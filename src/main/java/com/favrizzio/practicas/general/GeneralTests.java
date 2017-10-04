package com.favrizzio.practicas.general;

public class GeneralTests {
    
    private static String uno = "fa";
    
    public static void main(String[] args) {

        
        int cont;
        for (cont = 5; cont > 0; cont --){
            System.out.print(cont);}
        System.out.print(cont);
            
        GeneralTests g = new GeneralTests();
        
        System.out.println(g.getUno());
        
    }
    
    
    public String getUno(){
        uno = "re";
        return uno;
    }
    

}
