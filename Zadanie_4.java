/*
    Задание 4
   Необходимо написать рекурсивный алгоритм для нахождения НОД
   и НОК двух чисел. Два числа вводятся вручную во время 
   выполнения программы.
 */
package zadanie_4;

import java.util.Scanner;

/**
 *
 * @author vital
 */
public class Zadanie_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        Scanner in = new Scanner(System.in); 
        int a = in.nextInt();
        System.out.println("Введите второе число: ");
        int b = in.nextInt();
        int max, min, A = a, B = b;
        if(a>=b) max = a;
        else max = b;
        if(a<=b) min = a;
        else min = b;
        int[] number = new int[max];
        int chiclo = 1;
        for(int i = 0; i<max; i++){
                number[i]=chiclo;
                chiclo++;
        }
        int chet = 0, p = 0;
        int[] prost_number = new int[max];
        for(int i = 0; i < max; i++){
            for(int j = 1; j <= max; j++){
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
        int[] prost_cifr = new int[p];
        for(int i = 0; i<p; i++){
            prost_cifr[i] = prost_number[i];
        }
        int kol = 0;
        int[] NOD = new int[p];
        for(int i = 0; i < p; i++){
            if( (a%prost_cifr[i] == 0 && b%prost_cifr[i] == 0) ){
                NOD[kol] = prost_cifr[i];
                kol++;
            }
        }
        int[] cifr_Nod = new int[kol];
        for(int i = 0; i < kol; i++){
            cifr_Nod[i] = NOD[i];
        }
        int[] nod = new int[max];
        int w = 0;
        for(int i = 0; i < kol; i++){
            if(a%cifr_Nod[i] == 0 && b%cifr_Nod[i]== 0){
                nod[w] = cifr_Nod[i];
                w++;
                a=a/cifr_Nod[i];
                b=b/cifr_Nod[i];
                i--;
            }
        }
        int Nod = 1;
        for(int i = 0; i < w; i++){
            Nod = Nod * nod[i];
        }
        System.out.println("НОД чисел " + A + " и " + B + ": " + Nod);
        
        int nok = min / Nod;
        int Nok = nok * max;
        System.out.println("НОК чисел " + A + " и " + B + ": " + Nok);      
    }
    
}
