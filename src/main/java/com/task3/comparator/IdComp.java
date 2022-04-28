package main.java.com.task3.comparator;

import main.java.com.task3.entity.CustomArray;


import java.util.Comparator;

public class IdComp implements Comparator<CustomArray> {
    @Override
    public int compare(CustomArray array1, CustomArray array2){
        return Integer.compare(array1.getId(),array2.getId());
    }
}
