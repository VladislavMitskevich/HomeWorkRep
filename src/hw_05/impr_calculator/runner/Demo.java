package hw_05.impr_calculator.runner;

import hw_05.impr_calculator.GenerateListOfArray;

import java.util.Arrays;
import java.util.Collection;

public class Demo {
    public static void main(String[] args) {
        GenerateListOfArray list = new GenerateListOfArray();
        Collection<int[]> l = list.createList(3);
        for (int[] ar: l){
            System.out.println(Arrays.toString(ar));
        }
    }
}
