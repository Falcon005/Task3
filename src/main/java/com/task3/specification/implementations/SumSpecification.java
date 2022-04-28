package main.java.com.task3.specification.implementations;

import main.java.com.task3.entity.CustomArray;
import main.java.com.task3.exception.CustomArrayException;
import main.java.com.task3.exception.EmptySetException;
import main.java.com.task3.service.CustomArrayService;
import main.java.com.task3.specification.Specification;

public class SumSpecification implements Specification {

    private double sumOfArray;
    public SumSpecification(double sumOfArray){
        this.sumOfArray = sumOfArray;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        double result=-1;
        try{
            result = new CustomArrayService().findSum(customArray.getArray());
        }catch (CustomArrayException e){
            System.out.println(e);
        }catch (EmptySetException e){
            System.out.println(e);
        }
        return (sumOfArray==result);
    }
}
