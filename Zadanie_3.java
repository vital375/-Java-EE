/*
    Задание 3
   Необходимо написать программу, которая определяет
   пересикаются ли два отрезка. Координаты отрезков 
   вводятся вручную во время выполнения программы.
 */
package zadanie_3;

import java.util.Scanner;
/**
 *
 * @author vital
 */
public class Zadanie_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Введите координаты первого отрезка l1: x1, y1, x2, y2: ");
        Scanner in = new Scanner(System.in);
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        System.out.println("Введите координаты второго отрезка l2: x1, y1, x2, y2: ");
        double x3 = in.nextDouble();
        double y3 = in.nextDouble();
        double x4 = in.nextDouble();
        double y4 = in.nextDouble();
        
        double k1 = (x2-x1)/(y2-y1);
        double k2 = (x4-x3)/(y4-y3);
        if(k1==k2){
            System.out.println("Эти отрезки будут параллейны, значит они не пересекаются и у них нет точки пересечения.");
        }
        else{
            double x = ((x1*y2 - x2*y1)*(x4-x3)-(x3*y4-x4*y3)*(x2-x1))/((y1-y2)*(x4-x3)-(y3-y4)*(x2-x1));
            double y = ((y3-y4)*x-(x3*y4-x4*y3))/(x4-x3); 
            if(((x1<=x) && (x2>=x) && (x3<=x) && (x4>=x)) || ((y1<=y) && (y2>=y) && (y3<=y) && (y4>=y))){
                System.out.println("Данные отрезки пересекаются");
            }
            else{
                System.out.println("Данные отрезки не пересекаются");
            }
        }
    }
    
}
