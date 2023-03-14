package hw_05.impr_calculator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
//Класс для генерации массивов
public class GenerateListOfArray {
    public Collection<int[]> createList(int size) {
        Collection<int[]> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(new Random().ints(new Random().nextInt(15), 1, 301).toArray());
        }
        return list;
    }
}
