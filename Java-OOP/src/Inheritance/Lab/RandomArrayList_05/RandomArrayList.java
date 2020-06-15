package Inheritance.Lab.RandomArrayList_05;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList<T> extends ArrayList<T> {
    public Object getRandomElement() {
        Random random = new Random();
        int index = random.nextInt(super.size()-1);
        return super.remove(index);
    }
}
