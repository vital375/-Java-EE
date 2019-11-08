/*
    Задание 2
   Необходимо написать рекурсивный алгоритм, который находит
   числа Фибоначчи в пределах от 1 до N. N - вводится вручную
   во время выполнения программы. 
 */
package zadanie_2;

import java.util.Scanner;

/**
 *
 * @author vital
 */
public class Zadanie_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Введите число N, до каторого будут вычисляться числа Фибоначчи: ");
        Scanner in = new Scanner(System.in); 
        int N = in.nextInt();
        int[] f = new int[N];
        f[0] = 0;
        f[1] = 1;
        int chet = 2, l = 1;
        for(int i = 2; i < N; i++){
            if(f[i-1]+f[i-2] <= N){
                f[chet]=f[i-1]+f[i-2];
                chet++;
            }
        }
        System.out.println("Числа Фибоначчи: ");
        System.out.print(f[1] + " " + f[1] + " ");
        for(int i = 3; i < chet; i++){
            if(f[i]!=f[i-1]){
                System.out.print(f[i] + " ");
            }
        }
    }
    
}
