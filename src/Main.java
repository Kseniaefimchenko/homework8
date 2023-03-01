import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача1");
        int[] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;

        double[] two = {1.57, 7.654, 9.986};

        int[] three = {4, 87, 51, 9};
    }

    public static void task2(){
        System.out.println("Задача2");
        int[] one = {1,2,3};

        for(int i = 0; i < one.length; i++) {
            System.out.print(one[i]);
            if (i != one.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        double[] two = {1.57, 7.654, 9.986};

        for (int i = 0; i < two.length; i++) {
            System.out.print(two[i]);
            if (i != two.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        int[] three = {4, 87, 51, 9};

        for (int i = 0; i < three.length; i++) {
            System.out.print(three[i]);
            if (i != three.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static void task3(){
        System.out.println("Задача3");
        int[] one = {1,2,3};

        for (int i = one.length - 1; i >= 0; i--) {
            System.out.print(one[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        double[] two = {1.57, 7.654, 9.986};

        for (int i = two.length - 1; i >= 0; i--) {
            System.out.print(two[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        int[] three = {4, 87, 51, 9};

        for (int i = three.length - 1; i >= 0; i--) {
            System.out.print(three[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static void task4() {
        System.out.println("Задача4");
        int[] one = {1,2,3};

        for (int i = 0; i < one.length; i++) {
            if (one[i] % 2 != 0) {
                one[i] += 1;
            }
        }
        System.out.println(Arrays.toString(one));
    }
}
