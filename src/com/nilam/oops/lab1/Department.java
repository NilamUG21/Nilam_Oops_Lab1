package com.nilam.oops.lab1;

import java.util.Scanner;

public class Department {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first name ");
		String firstName = sc.nextLine();
		System.out.println("Enter your last name ");
		String lastName = sc.nextLine();

		Employee emp = new Employee(firstName, lastName);

		CredentialService newEmp = new CredentialService();

		System.out.print("Please enter the department from the following");
		System.out.print("\n 1. Technical");
		System.out.print("\n 2. Admin ");
		System.out.print("\n 3. Human Resource");
		System.out.print("\n 4. Legal");

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int deptChoice = in.nextInt();
		if (deptChoice == 1) {
			newEmp.showInfo(emp, "tech");
		} else if (deptChoice == 2) {
			newEmp.showInfo(emp, "admin");
		}

		else if (deptChoice == 3) {
			newEmp.showInfo(emp, "hr");
		}

		else if (deptChoice == 4) {
			newEmp.showInfo(emp, "legal");
		}

		else {
			System.out.println("invalid input");
		}
	}
}
