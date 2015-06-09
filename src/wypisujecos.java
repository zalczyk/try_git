/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lab716-16
 */
public class wypisujecos {
    
    
    

    public static void main(String[] args) {
       
    
        int liczbaCalkowita = 123;
        
        System.out.println(liczbaCalkowita);
        System.out.println(liczbaCalkowita);
   
        liczbaCalkowita = 333;
        System.out.println(liczbaCalkowita);
        
        double liczbaRzeczywista = 12.7;
        System.out.println(liczbaRzeczywista);
        
        String tekst = "jakis tekst";
        System.out.println(tekst);
        
        String[] tablicaWyrazow = new String [5];
        tablicaWyrazow [0] = "wyraz 1";
        tablicaWyrazow [1] = "wyraz 2";
        tablicaWyrazow [2] = "wyraz 3";
        tablicaWyrazow [3] = "wyraz 4";
        tablicaWyrazow [4] = "wyraz 5";
        
        System.out.println(tablicaWyrazow[2]);
        
        int i;
        for(i=0; i<5; i=i+1) {
            System.out.println(tablicaWyrazow[i]);
        
        }
        
        for(i=0; i<10; i=i+1){
        for(int j=0; j<10-i ; j=j+1){
            System.out.print(" ");
        }
            for(int j=0; j<i; j=j+1){
        System.out.print(" *");
        }
        System.out.println();
        
     
        }
        {System.out.println("   Merry Christmas");}
        {System.out.println(" ");}
                
        
    }}