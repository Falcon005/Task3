package main.java.com.task3.specification.implementations;

import main.java.com.task3.entity.CustomArray;
import main.java.com.task3.specification.Specification;

public class IdSpecification implements Specification {

    private int Id;
    public IdSpecification(int Id){
        this.Id = Id;
    }

    public boolean specify(CustomArray customArray){
        return customArray.getId()==Id;
    }
}
