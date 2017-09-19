package com.miniproject;
/*Mini employee project
 * 
 */

public class Main {// main class

	public static void main(String[] args) {// main method
		PermanentEmployee permanent =new PermanentEmployee();// object of permanent employee
		permanent.avail_leave(7,'s' ); // available leave method called 
		permanent.calculate_balance_leaves();// balance method calculation called 
		permanent.calculate_salary();// method caluate salary called
		
		TemporaryEmp temporary=new TemporaryEmp();// object for temporary emplyoee
		temporary.avail_leave(0, 's');// available leave method called  
		temporary.calculate_balance_leaves();// balance method calculation called
		temporary.calculate_salary();// method caluate salary called
		
	}
}

class Employee{

	int empID = 1234; // Instance variables
	String empName= "Aftab";
	int total_Leaves = 12;
	double total_salary;
	
	void calculate_balance_leaves() {// method to show balance leave
		System.out.println("total leave " + total_Leaves);
	}
	
	
	
	boolean avail_leave(int num_Of_Leave, char type_of_Leave) {// method to return true if employee has leave 
		if (num_Of_Leave <0) {
			return false;
		}else 
			return true;
		
	}
	
	void calculate_salary() {// calculation of salary
		double basic =1000.00;
		double pf = 12 % basic;
		double hra = 50 % basic;
		double total_salary = basic + hra - pf;
		System.out.println("total salary " + total_salary);
		
	}
	
}

class PermanentEmployee extends Employee{// permanent emplyoee class extends emplyoee
	int paid_leave,sick_Leave,casual_leave;// instance variable
	double basic, hra,pfa;
	
	void print_leave_Details() {// method to print leave
	
		
	}
	
    void calculate_balance_leaves() { // calculation of leave total//
		paid_leave=6;
		sick_Leave=4;
		casual_leave=2;
		
		int total_leave=paid_leave+sick_Leave+casual_leave;
		System.out.println("total leaves for permanent Employee" + total_leave);// print leave
	}
    
    boolean avail_leave(int num_Of_Leave, char type_of_Leave) {/// method to return true if employee has leave
    	if (num_Of_Leave<0) {
			return true;
		}else
		return false	;
	}
	
	void calculate_salary() { //calculation of salary
		double basic =1000.00;
		double pf = 12 % basic;
		double hra = 50 % basic;
		double total_salary = basic + hra - pf;
		System.out.println("total salary for permanent employee " + total_salary);
	}
		
}

class TemporaryEmp extends Employee{
void calculate_balance_leaves() {
	System.out.println("no leave for temporary Emply");	// no leave for temporary employee
	}
    
    boolean avail_leave(int num_Of_Leave, char type_of_Leave) {// return true if temporary employee has leave
    	if (num_Of_Leave <0) {
			return false;
		}else 
			return true;
    	}
	
	void calculate_salary() {// salary calculation
		double basic =1000.00;
		double pf = 12 % basic;
		double hra = 50 % basic;
		double total_salary = basic + hra - pf;
		System.out.println("total salary  fr temporary employee" + total_salary);
		
	}
	
	
}