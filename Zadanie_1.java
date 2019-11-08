/*
        Задание 1
    Необходимо написать программу, которая вычисляет простые числа
    в пределах от 1 до N. N - вводится вручную во время выполнения
    программы.
 */
package zadanie_1;

import java.util.*;

/**
 *
 * @author vital
 */
public class Zadanie_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        System.out.println("Введите число N, до каторого будут вычисляться простые числа: ");
        Scanner in = new Scanner(System.in); 
        int N = in.nextInt();
        int[] number = new int[N];
        int chiclo = 1;
        for(int i = 0; i<N; i++){
                number[i]=chiclo;
                chiclo++;
        }
        int chet = 0, p = 0;
        int[] prost_number = new int[N];
        
        for(int i = 0; i < N; i++){
            for(int j = 1; j <= N; j++){
                if(number[i]/j >= 1 && number[i]%j == 0){
                    chet++;
                }
            }
            if(chet == 2 ){
                prost_number[p] = number[i];
                p++;
            }
            chet = 0;
        }
        System.out.println("Простые числа: ");
        for(int i = 0; i<p; i++){
            System.out.print(prost_number[i] + " ");
        }
    }
    
    
}
