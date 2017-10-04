package com.favrizzio.practicas.general;

import java.util.Random;
import java.util.regex.Pattern;

public class GeneralTest2 {

    public static final Pattern RECOBRO_CODIGOS = Pattern.compile("(201|202|058|006)");

    private static String url1 = "http://pixelhandler.it.movile.com/pixelHandler/pixel/presuscribe?msisdn=%s&carrierId=%s&applicationId=%s&referenceId=%s&jsonParams=%s&adPartner=%s";

    private String url2 = "http://pixelhandler.it.movile.com/pixelHandler/pixel/convert?msisdn=%s&carrierId=%s&applicationId=%s&referenceId=%s";

    private final String i = getClass().getResource("/").getFile();

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        GeneralTest2 generalTest2 = new GeneralTest2();

        String num1 = "1";

        Boolean bool = Boolean.parseBoolean(num1);

        System.out.println(bool);

        System.out.println(GeneralTest2.RECOBRO_CODIGOS.matcher(String.format("%03d", Integer.parseInt("6"))).matches());

        System.out.println(String.format("%03d", 123234156));

        System.out.println(String.format(url1, new Object[] {"A", 2, "c", "d", 2L, 1.9}));

        Random random = new Random();

        for (int i = 0; i < 1; i++) {
            int randomNumber = random.nextInt(999900000) + 100000;

            System.out.println(" -->> " + randomNumber + " <<--");
        }

        CallBackParams callBackParam = CallBackParams.getStatusById(1002);

        switch (callBackParam) {
        case MANDATORY_SCP_PASSWORD:

            System.out.println(callBackParam.getDescription());
            break;
        case SUCCESS_TRANSACTION:
        case INSUFFICIENT_CREDIT:
        case SUCCESS_PARTIAL_BILLING:
        case SUCCESS_POST_BILLING:
        case PREPAID_USER_UNABILITY_IN_NETWORK:

            System.out.println(callBackParam.getDescription());
            break;
        case NOT_FOUND:
            String code = "u";
            String message = "u";
            String type = "u";

            System.out.println("(" + code + ") " + message + " - " + type);
            break;
        default:

            System.out.println(callBackParam.getDescription());

            break;
        }

        System.out.println(callBackParam);

        System.out.println(generalTest2.i);

    }

}
