/*
    Задание 5
   Необходимо написать программу, которая проверяет слово
   на "палиндромность". Слово для проверки вводится вручную
   во время выполнения программы.
 */
package zadanie_5;

import java.io.*;
//import java.util.Scanner;

/**
 *
 * @author vital
 */
public class Zadanie_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnsupportedEncodingException, IOException {
        BufferedReader consol = new BufferedReader(new InputStreamReader(System.in,"Cp1251")); 
        System.out.println("Введите слово для проверки его на палиндромность: ");
        //Scanner in = new Scanner(System.in);
        String Slovo = consol.readLine();
        String[] slovo = Slovo.split("");
        int bykv = slovo.length;
        int p = 0;
        bykv = bykv / 2;
        String[] slovo_navivorot = new String[slovo.length];
        int k = slovo.length-1;
        for(int i = 0; i < slovo.length; i++){
            slovo_navivorot[i] = slovo[k];
            k--;
        }
        for(int i = 0; i < bykv; i++){
            char sl = slovo[i].charAt(0);
            char sl1 = slovo_navivorot[i].charAt(0);
            if(sl==sl1){
                p++;
            }
        }
        if(p == bykv){
            System.out.println("Слово " + Slovo + " - палиндром");
        }
        else{
            System.out.println("Слово " + Slovo + " - не палиндром");
        }
        
    }
    
}
