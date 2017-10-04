package com.favrizzio.practicas.lombok;

public class ImplLombok {

    public static void main(String[] args) {

        TynctecCodes res = TynctecCodes.getValueByCode(5040);

        System.out.println(res.getDescription());

        TyntecResponse tr = new TyntecResponse();
        tr.setCountry("AR");
        tr.setCurrency("ARS");

        System.out.println(tr);

    }

}
