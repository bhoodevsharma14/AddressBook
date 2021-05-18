package com;
import java.util.Scanner;
public class AddressBook {
	static Scanner scan=new Scanner(System.in);
	public static void createContact()
	{	String fisrt_name,last_name,address,city,state;
		int zip;
		long phone;
		System.out.println("Please Enter First Name: ");
		fisrt_name=scan.next();
		System.out.println("Please Enter Last Name: ");
		last_name=scan.next();
		System.out.println("Please Enter Address: ");
		address=scan.next();
		System.out.println("Please Enter City Name: ");
		city=scan.next();
		System.out.println("Please Enter State Name: ");
		state=scan.next();
		System.out.println("Please Enter Zip Code: ");
		zip=scan.nextInt();
		System.out.println("Please Enter Phone Number: ");
		phone=Long.parseLong(scan.next());
	}

	public static void main(String[] args) 
	{
		System.out.println("Welcome To Address Book Progream");
		createContact();
		
	}

}
