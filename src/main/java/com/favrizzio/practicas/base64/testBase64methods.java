package com.favrizzio.practicas.base64;

import java.io.UnsupportedEncodingException;

/**
 * @author fabrizzio
 */
public class testBase64methods {

    public static void main(String[] args) throws UnsupportedEncodingException {

        // String pattern = "((-|\\+)?[0-9]+(\\.[0-9]+)?)+";

        String num = "56987574523";

        String num_ = BaseN2.BASE2.convertDecimal(Long.valueOf(num));

        System.out.println("base2 -> " + num + " = " + num_);

        num_ = BaseN2.BASE16.convertDecimal(Long.valueOf(num));

        System.out.println("base16 -> " + num + " = " + num_);

        num_ = BaseN2.BASE36.convertDecimal(Long.valueOf(num));

        System.out.println("base36 -> " + num + " = " + num_);

        num_ = BaseN2.BASE62.convertDecimal(Long.valueOf(num));

        System.out.println("base62 -> " + num + " = " + num_);

        num_ = BaseN2.BASE64.convertDecimal(Long.valueOf(num));

        System.out.println("base64 -> " + num + " = " + num_);

        num_ = BaseN2.BASE8.convertDecimal(Long.valueOf(num));

        System.out.println("base8 -> " + num + " = " + num_);

        System.out.println("=====================================================");

        String numi = "7u04fOM";

        String numi_ = BaseN2.BASE2.revertToDecimal(numi).toString();

        System.out.println("base2 -> " + numi + " = " + numi_);

        numi_ = BaseN2.BASE16.revertToDecimal(numi).toString();

        System.out.println("base16 -> " + numi + " = " + numi_);

        numi_ = BaseN2.BASE36.revertToDecimal(numi).toString();

        System.out.println("base36 -> " + numi + " = " + numi_);

        numi_ = BaseN2.BASE62.revertToDecimal(numi).toString();

        System.out.println("base62 -> " + numi + " = " + numi_);

        numi_ = BaseN2.BASE64.revertToDecimal(numi).toString();

        System.out.println("base64 -> " + numi + " = " + numi_);

        numi_ = BaseN2.BASE8.revertToDecimal(numi).toString();

        System.out.println("base8 -> " + numi + " = " + numi_);

        String anotherEncrypted = "541125787699";

        String j = org.apache.commons.codec.binary.Base64.encodeBase64String(anotherEncrypted.getBytes());

        System.out.println("j -> " + anotherEncrypted + " = " + j);

        j = new String(org.apache.commons.codec.binary.Base64.decodeBase64(j), "UTF-8");

        System.out.println("j -> " + j + " = " + j);
    }

}
