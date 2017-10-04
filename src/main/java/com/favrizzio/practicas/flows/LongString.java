package com.favrizzio.practicas.flows;

public class LongString {

    public static final String EXTERNAL_REFERENCE_ID = "{\"externalTransactionId\":\"%s\",\"tariffId\":\"72705\",\"serviceId\":\"82911\",\"packageId\":\"72805\"}";

    public static final String AUTH = "S051315302227154911612122775437M";

    public static void main(String[] args) {

        // System.out
        // .println("{\"nombre\":\"http://apiweb.smsconsulting.company/index.php?ani={MSISDN}&ikhp=113582&idLanding=30&sec=23e71b&user={USER}&pass={PASS}&url=\"}"
        // .length());
        // System.out.println("C0BAE23DF8B51807B3E17D21925FADF273A70181E1D81B8EDE6C76A5C1F1716E".substring(0, 32));
        //
        // System.out.println(String.format(EXTERNAL_REFERENCE_ID, AUTH));

        System.out.println(("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz+-").length());
        
        System.out.println(("user=L000300_WS&password=Nq9BYXnQly&proveedorId=501&servicioId=PruebaATP&clientTid=160121150138501000&urlRet=http%3A%2F%2Fstarwars.personal.com.ar%2Fcb%2Fpersonal%2Fstarwarswl%2Fsuccess%3F&clave=TEST&msisdn=541157494777&validationTime=1453399298").length());

        // System.out
        // .println("{\"targetInterfaceType\":\"SMARTPHONE\",\"system\":\"Albatross\",\"campaignId\":131,\"userInterfaceType\":\"SMARTPHONE\",\"campaignName\":\"[AR] Ex killer AR (php)\",\"actionName\":\"[AR] Club Playboy\",\"flowType\":\"WAP_INFOTAINMENT_PERSONAL\"}"
        // .length());
        //
        // System.out
        // .println("{\"targetInterfaceType\":\"SMARTPHONE\",\"system\":\"Albatross\",\"campaignId\":131,\"userInterfaceType\":\"SMARTPHONE\",\"campaignName\":\"[AR] Ex killer AR (php)\",\"actionName\":\"[AR] Club Playboy\",\"flowType\":\"WAP_INFOTAINMENT_PERSONAL\"}{\"targetInterfaceType\":\"SMARTPHONE\",\"system\":\"Albatross\",\"campaignId\":131,\"userInterfaceType\":\"SMARTPHONE\",\"campaignName\":\"[AR] Ex killer AR (php)\",\"actionName\":\"[AR] Club Playboy\",\"flowType\":\"WAP_INFOTAINMENT_PERSONAL\"}{\"targetInterfaceType\":\"SMARTPHONE\",\"system\":\"Albatross\",\"campaignId\":131,\"userInterfaceType\":\"SMARTPHONE\",\"campaignName\":\"[AR] Ex killer AR (php)\",\"actionName\":\"[AR] Club Playboy\",\"flowType\":\"WAP_INFOTAINMENT_PERSONAL\"}"
        // .length());

        System.out.println("541141614297".substring(0, 8));
    }

}