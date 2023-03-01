package hw_01test.backup_utility_test;

import hw_01.backup_utility.utils.ThreadUtils1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a Directory: ");
        Path source = Paths.get(in.nextLine());
        in.close();
        Path destination = Files.createDirectories(Path.of(source + "_new"));
        /*Path source = Paths.get("C:\\Users\\7062\\Desktop\\123");
        Path destination = Paths.get("C:\\Users\\7062\\Desktop\\123_new");*/
        ThreadUtils1 utils1 = new ThreadUtils1(source, destination);
        utils1.start();
        System.out.println("Done");
    }
}
