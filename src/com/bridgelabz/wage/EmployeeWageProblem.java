package com.bridgelabz.wage;

public class EmployeeWageProblem {


    public static void calculateEmployeeWage(String CompanyName,int empRate,int numDays,int MaxHours,int empWageHr){
        int is_Full_Time = 1;
        int emp_Part_Time = 2;
       // int empWageHr = 20;
        int empHour  = 0;
        int totalWage = 0;
        int totalHour = 0;

        for(int i=0;i<20;i++) {


            int employee_check = (int)(Math.random() * 10) % 3;

            switch (employee_check) {
                case 1:
                    empHour = 8;
                    System.out.println("Employee id Present");
                    break;
                case 2:
                    empHour = 4;
                    System.out.println("Employee is Present as PartTime");
                    break;
                case 0:
                    empHour = 0;
                    System.out.println("Employee is Absent");
                    break;
            }
            int wage = empHour * empWageHr;
            totalHour = totalHour+empHour;
            totalWage= totalWage+wage;
            System.out.println(wage);
        }

        System.out.println(totalHour);
        System.out.println(totalWage);


    }


    public static void main(String[] args) {
         calculateEmployeeWage("Dmart",20,2,10,20);
        calculateEmployeeWage("UCmart",20,4,20,10);


    }
}
