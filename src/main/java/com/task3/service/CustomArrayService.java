package main.java.com.task3.service;

import main.java.com.task3.exception.CustomArrayException;
import main.java.com.task3.exception.EmptySetException;


import java.util.Arrays;

public class CustomArrayService {

    public double findSum(int[] array)throws CustomArrayException,EmptySetException{
        if (array == null) {
            throw new CustomArrayException("Array can't be null");
        }
        if(array.length==0){
            throw new EmptySetException("Length of array can't be zero");
        }
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public double findMax(int[] array) throws CustomArrayException,EmptySetException{
        if (array == null) {
            throw new CustomArrayException("Array can't be null");
        }
        if(array.length==0){
            throw new EmptySetException("Length of array can't be zero");
        }
        Arrays.sort(array);
        return array[array.length-1];
    }


    public double findMin(int[] array) throws CustomArrayException,EmptySetException{
        if (array == null) {
            throw new CustomArrayException("Array can't be null");
        }
        if(array.length==0){
            throw new EmptySetException("Length of array can't be zero");
        }
        Arrays.sort(array);
        return array[0];
    }


    public double average(int[] array)throws CustomArrayException,EmptySetException
    {
        if (array == null) {
            throw new CustomArrayException("Array can't be null");
        }
        if(array.length==0){
            throw new EmptySetException("Length of array can't be zero");
        }
        return findSum(array)/ array.length;
    }
}
