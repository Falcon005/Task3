package main.java.com.task3.entity;

import java.util.Arrays;
import java.util.Objects;

public class CustomArray {
    private int id;
    private int[] array;

    public CustomArray(){

    }
    public CustomArray(int id,int[] array){
        this.id=id;
        this.array=array;
    }

    public int getId(){
        return id;
    }
    public int[] getArray(){
        return array;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "CustomArray{" +
                "id=" + id +
                ", array=" + Arrays.toString(array) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomArray that = (CustomArray) o;
        return id == that.id && Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }
}
