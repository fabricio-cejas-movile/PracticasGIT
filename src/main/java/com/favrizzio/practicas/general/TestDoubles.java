package com.favrizzio.practicas.general;

import java.text.DecimalFormat;

public class TestDoubles {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Double a = 1099.99d;

        Double[] factors = {0.8d, 0.6d, 0.4d, 0.2d, 0.1d};

        for (Double factor : factors) {

            //double c = (a * factor) / 10000d * 0.8d;

            double b = a * factor;

            System.out.println(b);

            DecimalFormat df = new DecimalFormat("#.##");

            b = Double.valueOf(df.format(b).replace(",", "."));

            System.out.println(b);
            // System.out.println(c);
        }

    }

}
