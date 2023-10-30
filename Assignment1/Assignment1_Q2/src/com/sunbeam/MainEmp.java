package com.sunbeam;

public class MainEmp {
	
	public static int searchEmpbyId(Employee arr[], int size, int id) {
		
		for(int i=0;i<size;i++) {
			if(arr[i].getEmpid()==id) {
				return i;
			}
		}
		return -1;
		
	}
	
	
	//search by name 
public static int searchEmpbyName(Employee arr[], int size, String name ) {
		
		for(int i=0;i<size;i++) {
			if(arr[i].getName()==name ) {
				return i;
			}
		}
		return -1;
		
	}

//search by salary
public static int searchEmpbySalary(Employee arr[], int size, double  salary) {
	
	for(int i=0;i<size;i++) {
		if(arr[i].getSalary()==salary ) {
			return i;
		}
	}
	return -1;
	
}
	
	
	
	
	
	public static void main(String[] args) {
	 Employee arr[]= new Employee[5];
	 arr[0]= new Employee(1,"anand",8000.0);
	 arr[1]= new Employee(2,"raj",9000.0);
	 arr[2]= new Employee(3,"rakesh",10000.0);
	 arr[3]= new Employee(4,"parth", 7000.0);
	 arr[4]= new Employee(5, "zayn", 13000.0);
	 
	 //searching Employee by id 
	 int index= MainEmp.searchEmpbyId(arr, arr.length, 3);
	 if (index!= -1)
		 System.out.println("Employee found at index "+ index+" with id=3");
	 else 
		   System.out.println("Employee not found");
	 
	 // searching Employee by name ;
	 int index1= MainEmp.searchEmpbyName(arr, arr.length, "zayn");
	 if (index1 != -1)
		 System.out.println("Employee found at index "+ index1+" with name zayn");
	 else 
		   System.out.println("Employee not found");
			 
	 //search Employee by salary
	 int index3= MainEmp.searchEmpbySalary(arr, arr.length, 10000.0);
	 if (index3 != -1)
		 System.out.println("Employee found at index "+ index3+" with salary=10000");
	 else 
		   System.out.println("Employee not found");
	 
	 
	 
	}

}
