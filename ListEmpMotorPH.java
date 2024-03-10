/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author anyah
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ListEmpMotorPH {
    public static void main(String[] args) {
        String filePath = "C:/Users/anyah/OneDrive/Documents/EmployeeDataForMotorPH.txt"; 
        //Locate from laptop C: drive
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] columns = line.split(",");
                 // .txt data is already separated by commas so I decided to use this one.
                for (String column : columns) { // Present Employee information in prescribed format: 
                    System.out.print("******************MOTORPH EMPLOYEES LIST*****************");
                    System.out.print("Employee Number" + "," + "Last Name" + "," + "First Name");
                    System.out.print("Birthdate" + "," + "Address" + "," + "Phone Number");
                    System.out.print("SSS" + "," + "Philhealth" + "," + "TIN" + "" + "Pagibig");
                    System.out.print("Employment Status" + "," + "Position" + "," + "Immediate Supervisor");
                    System.out.print("SSS" + "," + "Philhealth" + "," + "TIN" + "" + "Pagibig");
                    System.out.print("Basic Salary" + "," + "Rice Subsidy" + "," + "Phone Allowance");
                    System.out.print("Semi-Monthly" + "Hourly Rate");
                }         
            }
        } catch (IOException e) {
        }
    }
}