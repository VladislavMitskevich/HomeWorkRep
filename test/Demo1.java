import hw_02.FileUtil;

import java.io.IOException;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter source Directory:");
        Scanner in = new Scanner(System.in);
        String source = in.nextLine();
        //System.out.println("Enter destination Dir");
       // Scanner in2 = new Scanner(System.in);
        //String destination = in2.nextLine();
        in.close();
       // String source = "D:\\Desktop\\new.txt";
        FileUtil fileUtil = new FileUtil();
        fileUtil.sortedInFile(source);
       // System.out.println(fileUtil.averageScore(source));
        System.out.println(fileUtil.getListOfLargestNumberCombination(source));
    }
}
