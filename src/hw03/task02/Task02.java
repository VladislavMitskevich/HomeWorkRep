package hw03.task02;


public class Task02 {
    Multiplication mp = (a, b) -> a * b;

    public void tableFiveColumn() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j + " x " + i + " = " + mp.multiply(i, j) + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            for (int j = 6; j <= 10; j++) {
                System.out.print(j + " x " + i + " = " + mp.multiply(i, j) + "\t");
            }
            System.out.println();
        }
    }

    public void tableOneColumn() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(j + " x " + i + " = " + mp.multiply(i, j) + "\t");
            }
        }
    }
}

