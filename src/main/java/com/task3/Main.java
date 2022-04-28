package main.java.com.task3;

import main.java.com.task3.Warehouse.CustomArrayWarehouse;
import main.java.com.task3.entity.CustomArray;
import main.java.com.task3.repository.implementations.CustomArrayRepository;
import main.java.com.task3.service.CustomArrayService;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        CustomArrayService cas = new CustomArrayService();
        CustomArrayRepository car = CustomArrayRepository.getInstance();
        CustomArrayWarehouse caw = CustomArrayWarehouse.getInstance();
        int[] array1={1,2,3,4,5};
        CustomArray customArray1 = new CustomArray(1,array1);
        int[] array2={6,7,8,9,10};
        CustomArray customArray2 = new CustomArray(2,array2);
        int[] array3={11,12,13,14,15};
        CustomArray customArray3 = new CustomArray(3,array3);

        car.add(1,customArray1);
        car.add(2,customArray2);
        car.add(3,customArray3);



        double sumOfArray1 = cas.findSum(array1);
        double sumOfArray2 = cas.findSum(array2);
        double sumOfArray3 = cas.findSum(array3);

        double maxOfArray1 = cas.findMax(array1);
        double maxOfArray2 = cas.findMax(array2);
        double maxOfArray3 = cas.findMax(array3);

        double minOfArray1 = cas.findMin(array1);
        double minOfArray2 = cas.findMin(array2);
        double minOfArray3 = cas.findMin(array3);

        double averegeArray1 = cas.average(array1);
        double averegeArray2 = cas.average(array2);
        double averegeArray3 = cas.average(array3);


        Map<String,Double> wh1 = new HashMap<>();
        wh1.put("sum of array1",sumOfArray1);
        wh1.put("max of array1",maxOfArray1);
        wh1.put("min of array1",minOfArray1);
        wh1.put("average of array1",averegeArray1);
        Map<Integer, Map<String,Double>> warehouse1 = new HashMap<>();
        warehouse1.put(1,wh1);


        Map<String,Double> wh2 = new HashMap<>();
        wh1.put("sum of array2",sumOfArray2);
        wh1.put("max of array2",maxOfArray2);
        wh1.put("min of array2",minOfArray2);
        wh1.put("average of array2",averegeArray2);
        Map<Integer, Map<String,Double>> warehouse2 = new HashMap<>();
        warehouse2.put(2,wh2);


        Map<String,Double> wh3 = new HashMap<>();
        wh1.put("sum of array3",sumOfArray3);
        wh1.put("max of array3",maxOfArray3);
        wh1.put("min of array3",minOfArray3);
        wh1.put("average of array3",averegeArray3);
        Map<Integer, Map<String,Double>> warehouse3 = new HashMap<>();
        warehouse3.put(3,wh3);

        caw.iterate(warehouse1);
        caw.iterate(warehouse2);
        caw.iterate(warehouse3);

    }
}
