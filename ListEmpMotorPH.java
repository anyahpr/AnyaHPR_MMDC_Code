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
        // Present Employee information in prescribed format: 
        //Employee Number,Last Name,First Name,
        //Birthday,Address,Phone Number,
        //SSS,Philhealth,TIN,Pagibig,
        //Employment Status,Position,
        //Immediate Supervisor,Basic Salary,Rice Subsidy,Phone Allowance,
        //Clothing Allowance,Gross Semi Monthly Rate,Hourly Rate
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] columns = line.split(",");
                 // .txt data is already separated by commas so I decided to use this one.
                for (String column : columns) {
                    System.out.print("EMPLOYEE LIST");
                    System.out.print(column + ",");
                    System.out.print(column + ",");
                    System.out.print(column + ",");
                }
                System.out.println();
            }
        } catch (IOException e) {
        }
    }
}


