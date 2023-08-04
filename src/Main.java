import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] weight = {1, 2, 3};
        double[] weights = {1.57, 7.654, 9.986};
        int[] carNumbers = {1347, 1800, 1009, 2900, 2751, 4422, 1223, 5524, 8115};
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] weight = {1, 2, 3};
        for (int index = 0; index < weight.length; index++) {
            if (index == weight.length - 1) {
                System.out.println(weight[index]);
                break;
            }
            System.out.print(weight[index] + ", ");
        }

        double[] weights = {1.57, 7.654, 9.986};
        for (int index = 0; index < weights.length; index++) {
            if (index == weights.length - 1) {
                System.out.println(weights[index]);
                break;
            }
            System.out.print(weights[index] + ", ");
        }

        int[] carNumbers = {1347, 1800, 1009, 2900, 2751, 4422, 1223, 5524, 8115};
        for (int index = 0; index < carNumbers.length; index++) {
            if (index == carNumbers.length - 1) {
                System.out.println(carNumbers[index]);
                break;
            }
            System.out.print(carNumbers[index] + ", ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] weight = {1, 2, 3};
        int n = weight.length - 1;
        for (int i = n; i >= 0; i--) {
            n -= n;
            if (i == n) {
                System.out.println(weight[i] + " ");
            } else {
                System.out.print(weight[i] + ", ");
            }
        }

        double[] weights = {1.57, 7.654, 9.986};
        int n1 = weights.length - 1;
        for (int i = n1; i >= 0; i--) {
            n1 -= n1;
            if (i == n1) {
                System.out.println(weights[i] + " ");
            } else {
                System.out.print(weights[i] + ", ");
            }
        }

        int[] carNumbers = {1347, 1800, 1009, 2900, 2751, 4422, 1223, 5524, 8115};
        int n2 = carNumbers.length - 1;
        for (int i = n2; i >= 0; i--) {
            n2 -= n2;
            if (i == n2) {
                System.out.println(carNumbers[i] + " ");
            } else {
                System.out.print(carNumbers[i] + ", ");
            }
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] weight = {1, 2, 3};
        for (int i = 0; i < weight.length; i++) {
            if (i % 2 == 0) {
                weight[i] = weight[i] + 1;
            }
        }
        System.out.println(Arrays.toString(weight));
    }
}
