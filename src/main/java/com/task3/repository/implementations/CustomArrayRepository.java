package main.java.com.task3.repository.implementations;

import main.java.com.task3.entity.CustomArray;
import main.java.com.task3.repository.Repository;


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CustomArrayRepository  implements Repository{
    private  Map<Integer,CustomArray> repository;
    private static CustomArrayRepository customArrayRepository = null;
    private CustomArrayRepository(){}
    public static CustomArrayRepository getInstance(){
        if(customArrayRepository==null){
            customArrayRepository = new CustomArrayRepository();
        }
        return customArrayRepository;
    }


    public  Map<Integer, CustomArray> getRepository() {
        return repository;
    }

    public void setRepository(HashMap<Integer, CustomArray> repository) {
        this.repository = repository;
    }



    @Override
    public void add(int id, CustomArray customArray) {
        if(repository==null)repository = new HashMap<>();
        repository.put(id,customArray);
    }

    @Override
    public void delete(int id) {
        repository.remove(id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomArrayRepository that = (CustomArrayRepository) o;
        return Objects.equals(repository, that.repository);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repository);
    }

    @Override
    public String toString() {
        return "CustomArrayRepository{" +
                "repository=" + repository +
                '}';
    }
}
