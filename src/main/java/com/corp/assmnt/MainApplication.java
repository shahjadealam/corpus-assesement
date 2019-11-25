package com.corp.assmnt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/**
 * 
 * @author shahjade.a
 *
 */
public class MainApplication {

	static List<Employee> empList = new ArrayList<Employee>();

	public static void main(String[] args) {
		
		System.out.println("Application Started...\n");

		Scanner sc = new Scanner(System.in);
		
		//adding employee objects
		empList = Arrays.asList(
				new Employee("Shahjade", "Alam", 1001, "ERS"),
				new Employee("Harry", "Nagpal", 1002, "Smart Devices"), 
				new Employee("Jack", "Pawar", 1003, "IT"),
				new Employee("Gopi", "Chand", 1004, "HR"), 
				new Employee("Mansoor", "Ali", 1005, "Android"));

		System.out.println("Enter Your Choice : \n1 : Show Employee List \n2 : Get Employee Details by Number\n");
		int choice = sc.nextInt();

		switch (choice) {
		case 1: {
			getAllEmployee();
			break;
		}
		case 2: {
			System.out.println("Enter Employee Number To be Search");
			int number = sc.nextInt();
			System.out.println(getByNumber(number));
			break;
		}
		default:
			System.out.println("Invalid Choice");
		}
		
		sc.close();

	}

	// fetch list of employee
	private static void getAllEmployee() {
		System.out.println("======All Employee======");
		empList.forEach(System.out::println);
	}

	// fetch employee details based on number
	private static Employee getByNumber(int number) {

		Employee emp = null;
		try {
			emp = empList.stream().filter(e -> e.getNumber() == number).findFirst().get();
		} catch (Exception e) {
			System.out.println("No Such Id Match");
		}
		return emp;
	}

}
