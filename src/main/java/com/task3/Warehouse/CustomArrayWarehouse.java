package main.java.com.task3.Warehouse;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CustomArrayWarehouse {

    //Map<Integer:id,Map<String:name of max or min and so on,Double:value>>
    private Map<Integer, Map<String,Double>> warehouse;

    private static CustomArrayWarehouse customArrayWarehouse = null;

    private CustomArrayWarehouse(){}

    public static CustomArrayWarehouse getInstance(){
        if(customArrayWarehouse==null){
            customArrayWarehouse = new CustomArrayWarehouse();
        }
        return customArrayWarehouse;
    }

    public Map<Integer, Map<String, Double>> getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(HashMap<Integer, Map<String, Double>> warehouse) {
        this.warehouse = warehouse;
    }

    //Iteration
    public  void iterate( Map<Integer, Map<String,Double>> warehouse1){
        for (Map.Entry<Integer, Map<String, Double>> entry:warehouse1.entrySet()){
            Map<String, Double> childMap = entry.getValue();
            System.out.println("ID: "+entry.getKey());
            for(Map.Entry<String, Double> entry2:childMap.entrySet()){
                System.out.println(entry2.getKey()+" : "+entry2.getValue());
            }
        }
    }


    @Override
    public String toString() {
        return "CustomArrayWarehouse{" +
                "warehouse=" + warehouse +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomArrayWarehouse that = (CustomArrayWarehouse) o;
        return Objects.equals(warehouse, that.warehouse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(warehouse);
    }

}
