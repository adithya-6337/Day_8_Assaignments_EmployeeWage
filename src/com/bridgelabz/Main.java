package com.bridgelabz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        EmployeeWage emp = new EmployeeWage();
        System.out.println("enter employee first name : ");
        emp.setFirstName(input.next());
        System.out.println("enter employee last name : ");
        emp.setLastName(input.next());

        System.out.println("employee first name " + emp.getFirstName());
        System.out.println("employeelast name " + emp.getLastName());

        emp.calTotalEmpWage();
    }
}