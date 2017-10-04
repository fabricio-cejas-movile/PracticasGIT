package com.favrizzio.practicas.flows;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BuscarRepetidos {

    protected static List<String> supString = new ArrayList<String>();

    public static void main(String[] args) throws IOException {

        FileInputStream fil = new FileInputStream(new File("/home/fabricio/Descargas/doc.txt"));

        DataInputStream entrada = new DataInputStream(fil);

        BufferedReader bf = new BufferedReader(new InputStreamReader(entrada));

        String linea = "";

        while ((linea = bf.readLine()) != null) {
            supString.add(linea);
        }

        entrada.close();

        String lin = "";

        for (int i = 0; i < supString.size(); i++) {
            lin = supString.get(i);
            // System.out.println("probando : " + lin);
            for (int j = 0; j < supString.size(); j++) {
                if (lin.equals(supString.get(j)) && (j != i)) {
                    System.out.println("probando" + j + " : " + lin);
                }
            }
        }
    }

}
