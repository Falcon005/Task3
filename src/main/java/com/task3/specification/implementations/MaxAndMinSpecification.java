package main.java.com.task3.specification.implementations;

import main.java.com.task3.entity.CustomArray;
import main.java.com.task3.exception.CustomArrayException;
import main.java.com.task3.exception.EmptySetException;
import main.java.com.task3.service.CustomArrayService;
import main.java.com.task3.specification.Specification;


public class MaxAndMinSpecification implements Specification {
    private double maxOfArray;
    private double minOfArray;

    public MaxAndMinSpecification(double maxOfArray,double minOfArray){
        this.maxOfArray=maxOfArray;
        this.minOfArray=minOfArray;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        boolean result=false;
        try{
            result =minOfArray < new CustomArrayService().findMin(customArray.getArray());
        }catch (CustomArrayException e){
            System.out.println(e);
        }catch (EmptySetException e){
            System.out.println(e);
        }
        return result;
    }
}
