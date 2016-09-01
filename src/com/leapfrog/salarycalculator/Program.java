/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.salarycalculator;

import com.leapfrog.employee.Employee;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Toshiba
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{String fileName="c:/users/aashish/desktop/1.txt";
        BufferedReader bufferedReader=new BufferedReader(new FileReader(fileName));
        String line;
        List<Employee> employeeList=new ArrayList<>();
        
        while((line = bufferedReader.readLine()) != null)
        {
            System.out.println(line); 
            String[] token=line.split(",");
            Employee e=new Employee();
            e.setId(Integer.parseInt(token[0]));
            e.setFirstname(token[1]);
            e.setLastname(token[2]);
            e.setSalary(Double.parseDouble(token[3]));
            
            employeeList.add(e);
        }
        
        bufferedReader.close();
        FileWriter writer=new FileWriter("output.txt");
        for(Employee ee:employeeList){
            ee.setSalary(ee.getSalary()+ee.getSalary()*.2);
            writer.write(ee.toCSV());
        }
        
            
        writer.close();
        
        }catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }
        
        
        

        
    }
    
}
