/*
    Задание 6
   Необходимо написать программу, которая удаляет из текста
   числа. Текст вводится вручную во время выполнения
   программы.
 */
package zadanie_6;

import java.io.*;

/**
 *
 * @author vital
 */
public class Zadanie_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnsupportedEncodingException, IOException {
        BufferedReader consol = new BufferedReader(new InputStreamReader(System.in,"Cp1251")); 
        System.out.println("Введите текст: ");
        String text = consol.readLine();
        String[] bykva = text.split("");
        int[] numbers = new int[10];
        for(int i = 0; i < 10; i++){
            numbers[i] = i;
        }
        
        for(int i = 0; i < bykva.length; i++){
            for(int j = 0; j < 10; j++){
                if(bykva[i] == "") break;
                else{
                    char bykva_cr = bykva[i].charAt(0);
                    String a = String.valueOf(numbers[j]);
                    char number_cr = a.charAt(0);
                    if( bykva_cr == number_cr ){
                        bykva[i] = "";
                    }
                }
            }
        }
        for(int i = 0; i < bykva.length; i++){
            System.out.print(bykva[i]);
        }
    }
    
}
