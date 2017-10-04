package com.favrizzio.practicas.general;

import java.net.URLEncoder;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class GenerateString {

    public static final String TIMEZONE = "America/Buenos_Aires";

    public static final String URL = "https://optinint.personal.com.ar/cdagwapweb/cdag.php?params=";

    // public static final String PARTIAL_URL =
    // "user=Proveedor_Billing&password=Proveedor1234&proveedorId=999&servicioId=86&clientTid=160125125310999000&urlRet=http%3A%2F%2Firal.ch%2FDU%3Fk%3Dtest&clave=PruebaATP&msisdn=541169551983&contenido=desc&validationTime=";

    public static final String PARTIAL_URL = "user=Proveedor_Billing&password=Proveedor1234&proveedorId=999&servicioId=184&clientTid=160125125310999000&urlRet=http%3A%2F%2Firal.ch%2FDU%3Fk%3Dtest&clave=PruebaATP&msisdn=541166015307&contenido=desc&validationTime=";

    public static final String PARTIAL_URL_NO_MSISDN = "user=Proveedor_Billing&password=Proveedor1234&proveedorId=999&servicioId=86&clientTid=160125125310999000&urlRet=http%3A%2F%2Firal.ch%2FDU%3Fk%3Dtest&clave=PruebaATP&contenido=desc&validationTime=";

    public static final String ENCRYPTED = "Jk1PBrkxsj6pYqXrfHH3+bp3wuUZ6jth0PpHSoLGD8OnU+MAgC0xLTLdJOQXwifdiwQBHrlq+T/Nz4OJyD4bFJIS/5t9UyXiChJySTo4IsFz/gKjR8SO9BfnvL3S58JPcL0bxyJxP69SgMbBLhlaSowJ8oXaC4nkWz05f3Luvi+J1fZcBe7ZbvpeluYx1ag2kSahMB7xqn3kOr39dNfxeQ1L6uOI4w7k6YItmWxO50IDfNcl0XrURET1HvO8LZtBDm0Un92EHset+llltdYndY3skmubF/vCht0r1lt0Ml9NT8soXMc4nkFXClmAGbUHmkOKGV1ZtyxwSRO9FRlbug==";

    public static final String COMMAND = "echo \"%s\" | /usr/bin/openssl rsautl -encrypt -certin -inkey ./pKey.crt | /usr/bin/base64";

    public static void main(String[] argvs) {
        Long epochTime = GenerateString.getCurrentLocalTimestamp();

        String full = PARTIAL_URL + epochTime;

        String full2 = PARTIAL_URL_NO_MSISDN + epochTime;

        System.out.println("fullUrl: " + PARTIAL_URL + epochTime);

        try {

            CryptoInfotainment cryptoInfotainment = new CryptoInfotainment(full);

            String encrypted = cryptoInfotainment.encryptDataCMD();

            CryptoInfotainment cryptoInfotainment1 = new CryptoInfotainment(full2);

            String encrypted2 = cryptoInfotainment1.encryptDataCMD();

            System.out.println("command: " + String.format(COMMAND, PARTIAL_URL + epochTime));

            System.out.println("wapUrl: " + URL + URLEncoder.encode(encrypted, "utf-8"));

            System.out.println("wapUrl no msisdn: " + URL + URLEncoder.encode(encrypted2, "utf-8"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Long getCurrentLocalTimestamp() {
        Date date = new Date();
        TimeZone tzGMT = TimeZone.getTimeZone(TIMEZONE);
        Calendar cal = Calendar.getInstance();
        cal.setTimeZone(tzGMT);
        cal.setTime(date);
        return cal.getTimeInMillis() / 1000L;
    }

}
