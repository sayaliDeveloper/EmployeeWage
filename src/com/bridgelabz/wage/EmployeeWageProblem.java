package com.bridgelabz.wage;

public class EmployeeWageProblem {
    public static void main(String[] args) {
        int is_Full_Time = 1;
        int empHour = 0;
        int empWageHr = 20;
        double employee_check =Math.floor(Math.random () *10) % 2;
        if(employee_check==is_Full_Time){
            empHour = 8;
            System.out.println("Employee id Present");
        }else {
            empHour = 0;
            System.out.println("Employee is Absent");
        }
        int wage = empHour*empWageHr;
        System.out.println(wage);

    }
}
