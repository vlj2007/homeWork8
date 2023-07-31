public class Main {
    public static void main(String[] args) {
        task1();
        task2();

    }

    public static void task1(){
        System.out.println("Задача 1");
        int [] weight = new int [2];
        double [] weights = {1.57, 7.654, 9.986};
        int [ ] carNumbers = {1347, 1800, 1009, 2900, 2751, 4422, 1223, 5524, 8115};
    }

    public static void task2(){
        System.out.println("Задача 2");
        int [] weight = new int [2];
        double [] weights = {1.57, 7.654, 9.986};
        int [ ] carNumbers = {1347, 1800, 1009, 2900, 2751, 4422, 1223, 5524, 8115};

        System.out.println("Массив weight");
        for(int i=0; i<=1 ; i++){
            System.out.println("Элемент " + i +  " значение "+ weight[i]);
        }

        System.out.println("Массив weights");
        for(int i=0; i<=2 ; i++){
            System.out.println("Элемент " + i +  " значение "+ weights[i]);
        }

        System.out.println("Массив carNumbers");
        for(int i=0; i<=8 ; i++){
            System.out.println("Элемент " + i +  " значение "+ carNumbers[i]);
        }


    }


}