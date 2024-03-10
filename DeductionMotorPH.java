/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author anyah
 */
public class DeductionMotorPH {
    public static void main(String[] args) {
    }
        //SSS deduction
        class SSS;
        double SSSdeduction(); {
        final int constant = 25000;
        if ((int) Math.round(salary) < constant) {
            return SSS * 0.045;
        }
        return constant * 0.045;

        //Philhealth Deduction
        private double getPagibigDeduction() {
        final double minimunCompensation = 1500;
        if (salary > minimunCompensation) {
            return salary * 0.02;
        }
        return salary * 0.01;
        }

        //TIN Deduction
        private double getWithholdingTax() {
        double withHoldingTax = 0;
        if (salary > 20833 && salary <= 33333) {
            withHoldingTax = (salary - 20833) * 0.15;
        } else if (salary >= 33333 && salary <= 66667) {
            withHoldingTax = 1875 + (salary - 33333) * 0.2;
        } else if (salary >= 66667 && salary <= 166667) {
            withHoldingTax = 8541 + (salary - 66667) * 0.25;
        } else if (salary >= 166667 && salary <= 666667) {
            withHoldingTax = 33541 + (salary - 166667) * 0.3;
        } else if (salary > 666667) {
            withHoldingTax = 183541 + (salary - 666667) * 0.35;
        }
        return withHoldingTax;

        //Pagibig Deduction
        private double getPhilHealthDeduction() {
        return salary * 0.05;
        }

        //Total of Deductions
        public double getTotalDeductions(double salary) {
        this.salary = salary;
        return getSSSdeduction() + getPagibigDeduction() + getPhilHealthDeduction() + getWithholdingTax();
    }

        //Calculate Net Salary: Gross Wage minus Total of Deductions

        System.out.println("SSS "+ return SSS);
        System.out.println("PhilHealth");
        System.out.println("TIN");
        System.out.println("Pagibig");
        System.out.println("Total of Contributions");
    }
}

//****************************************************************************








}