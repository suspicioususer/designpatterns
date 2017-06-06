package creational.prototype;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProtoypeTest {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter Employee Id: ");
		int eid = Integer.parseInt(br.readLine());

		System.out.println("Enter Employee Name: ");
		String ename = br.readLine();

		System.out.println("Enter Employee Designation: ");
		String edesignation = br.readLine();

		System.out.println("Enter Employee Address: ");
		String eaddress = br.readLine();

		System.out.println("Enter Employee Salary: ");
		double esalary = Double.parseDouble(br.readLine());

		EmployeeRecord e1 = new EmployeeRecord(eid, ename, edesignation, esalary, eaddress);
		System.out.println("");
		e1.showRecord();
		System.out.println("\n");
		EmployeeRecord e2 = (EmployeeRecord) e1.getClone();
		e2.showRecord();
	}
}
