package com.bridgelabz.wage;

public class EmployeeWageProblem {
    public static void main(String[] args) {
        int is_Full_Time = 1;
        double employee_check =Math.floor(Math.random () *10) % 2;
        if(employee_check==is_Full_Time){
            System.out.println("Employee id Present");
        }else {
            System.out.println("Employee is Absent");
        }
    }
}
