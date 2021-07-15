package com.rodrigo.aula124.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.rodrigo.aula124.entities.Employee;
import com.rodrigo.aula124.entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		List<Employee> list = new ArrayList<>();
		
		
		for (int i=0; i<n; i++) {
			System.out.println("Employee #" + (i + 1) + " data:");
			
			System.out.print("Outsourced (y/n)? ");
			char optional = sc.next().charAt(0);
			
			
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Hours: ");
				int hours = sc.nextInt();
				System.out.print("Value per Hours: ");
				double valueperHour = sc.nextDouble();
				
				if (optional == 'y') {
				System.out.print("Additional charge: ");
				double additional = sc.nextDouble();				
				list.add(new OutsourcedEmployee(name, hours, valueperHour,additional)); 
				} else {
					list.add(new Employee(name, hours, valueperHour));
			}
		}
		
		System.out.println();
		System.out.println("PAYMENTS");
		
		for (Employee emp : list) {
			System.out.println(emp);
		}
		
		sc.close();
	}

}
