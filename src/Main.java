import java.util.*;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1(){
        System.out.println("Задача 1");
        int [] weight = new int [2];
        double [] weights = {1.57, 7.654, 9.986};
        int [ ] carNumbers = {1347, 1800, 1009, 2900, 2751, 4422, 1223, 5524, 8115};
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] weight = new int[2];
        double[] weights = {1.57, 7.654, 9.986};
        int[] carNumbers = {1347, 1800, 1009, 2900, 2751, 4422, 1223, 5524, 8115};


        for (int i = 0; i <= 1; i++) {
            System.out.print(weight[i] + " ");
        }

        System.out.println();
        for (int i = 0; i <= 2; i++) {
            System.out.print(weights[i] + " ");
        }

        System.out.println();
        for (int i = 0; i <= 8; i++) {
            System.out.print(carNumbers[i] + " ");
        }
        System.out.println();
    }


        public static void task3(){
            System.out.println("Задача 3");
            int [] weight = new int [2];
            double [] weights = {1.57, 7.654, 9.986};
            int [ ] carNumbers = {1347, 1800, 1009, 2900, 2751, 4422, 1223, 5524, 8115};

            for(int i=1; i>=0 ; i = i-1){
                System.out.print(weight[i] + " ");
            }

            System.out.println();
            for(int i=2; i>=0 ; i = i-1){
                System.out.print(weights[i] + " ");
            }

            System.out.println();
            for(int i=8; i>=0 ; i = i-1){
                System.out.print(carNumbers[i] + " ");
            }
            System.out.println();
    }

    public static void task4(){
        System.out.println("Задача 4");
        int [ ] carNumbers = {1347, 1800, 1009, 2900, 2751, 4422, 1223, 5524, 8115};

        for (int i =0 ; i < carNumbers.length; i++){
            carNumbers[i] = carNumbers[i] + 1;
            System.out.print(carNumbers[i] + " ");
        }

    }

}