package hw03.Task01Demo;

import hw03.task01.Task01;

public class Demo {
    public static void main(String[] args) {
        String[] strings = new String[]{"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};

        Task01 t = new Task01();
        System.out.println(t.getMapFromArray(strings));
        System.out.println(t.getStringFromMap(t.getMapFromArray(strings)));
    }
}
