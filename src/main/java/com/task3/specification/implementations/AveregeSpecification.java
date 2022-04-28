package main.java.com.task3.specification.implementations;

import main.java.com.task3.entity.CustomArray;
import main.java.com.task3.exception.CustomArrayException;
import main.java.com.task3.exception.EmptySetException;
import main.java.com.task3.service.CustomArrayService;
import main.java.com.task3.specification.Specification;

public class AveregeSpecification implements Specification {
    private double averegeOfArray;

    public AveregeSpecification(double averegeOfArray){
        this.averegeOfArray = averegeOfArray;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        double result=-1;
        try{
            result= new CustomArrayService().average(customArray.getArray());
        }catch (CustomArrayException e){
            System.out.println(e);
        }catch (EmptySetException e){
            System.out.println(e);
        }
        return (averegeOfArray==result);
    }
}
