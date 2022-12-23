/*
Simple Inventory Management System(SIMS): You have to create two methods to start with.
You need to implement Data Structures in Memory.
• One to add Item into Inventory add(“Item_Name”). It should add only one item at a time.
• One to Remove remove(“Item_Name”). It should remove only one item at a time.
• Each Item is identified using Name.
• Create one function to display all items with their counts in descending order in SIMS.
• Create one function to display biggest stock item in SIMS
• Create one function to return lowest stock item in SIMS
 */

import javax.print.attribute.HashPrintJobAttributeSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InventoryClass {
    static Map<String, Integer> invMap = new HashMap<>();

    public static void main(String[] args){

        String str = "Print the unique words in the sentence : Fear leads to anger; anger leads to hatred; hatred leads to conflict; conflict leads to suffering.";


    }

    public static Map add(String itemName){
        if(invMap.containsKey(itemName)){
            int quant = invMap.get(itemName);
            quant++;
            invMap.put(itemName, quant);
        }
        else{
            invMap.put(itemName, 1);
        }
        return invMap;
    }


    /*

    select MAX(salary) from employee_table where salary <
    (select MAX(salary) from employee_table);

     */



}

