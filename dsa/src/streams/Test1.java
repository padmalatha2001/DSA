package streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test test=new Test();
		List<Employee> employeeList=test.getList();
		//male and female count in organization
		System.out.println("-----male and female count in organization---");
		employeeList.stream().collect(Collectors.groupingBy(Employee::getGender)).entrySet()
		.forEach(entry->{
			System.out.print(entry.getKey()+" : "+entry.getValue().size());
			System.out.println();
		});
		
		
		//print the names of all departments in organization
		System.out.println("-----print the names of all departments in organization-----");
	    employeeList.stream().map(emp->emp.getDepartment()).distinct().forEach(System.out::println);
	    
	  //highest paid employee using optional
	  System.out.println("-----highest paid employee using optional----");
	 Optional<Employee> emp= employeeList.stream().max(Comparator.comparing(Employee::getSalary));
	 System.out.println(emp.get().getName());
	 
	//Get the names of all employees who have joined after 2015?
    System.out.println("------.Get the names of all employees who have joined after 2015-----");
   employeeList.stream().filter(emp1->emp1.getYearOfJoining()>2015).forEach(System.out::println);
	
   
  //Get the details of youngest male employee in the Development department
  System.out.println("-----Get the details of youngest male employee in the Development department---");
  Optional<Employee> young=	employeeList.stream().filter(e->e.getGender().equals("Male")).min(Comparator.comparing(Employee::getAge));
	 System.out.println(young.get().getName());
	
	 
	 //6.How many male and female employees are there in the sales and marketing team
	   System.out.println("---How many male and female employees are there in the sales and marketing team--");
	    employeeList.stream().filter(e->e.getDepartment().equals("Sales")||e.getDepartment().equals("Marketing")).collect(
	    		Collectors.groupingBy(Employee::getDepartment,Collectors.groupingBy(Employee::getGender))).entrySet().forEach(c1->{
	    			System.out.print(c1.getKey()+" :: ");
	    			c1.getValue().entrySet().forEach(c2->{
	    				System.out.print(c2.getKey()+"-"+c2.getValue().size());
	    				System.out.println();
	    			});
	    		});
	    
	    //7.List down the names of all employees in each department?
		   System.out.println("---List down the names of all employees in each department---");
		   employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment)).entrySet().forEach(entry->{
			   System.out.print(entry.getKey());
			   System.out.println();
		   });
		   
		   //8.Calculate the average salary of all employees in the organization.
		   System.out.println("Average sal of all emps :"+employeeList.stream().collect(Collectors.averagingDouble(Employee::getSalary)));
	
		   //9.Find the employee with the longest name.
		   System.out.println("--Find the employee with the longest name---");
		   employeeList.stream().max(Comparator.comparingInt(e1->e1.getName().length())).ifPresent(e->{
			   System.out.println(e.getName());
		   });
		   
		 //10.Group employees by their department and calculate the total salary for each department.
		   System.out.println("---Group employees by their department and calculate the total salary for each department----");
		   employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary))).entrySet()
		   .forEach(entry->{
			   System.out.print(entry.getKey()+": "+entry.getValue());
			   System.out.println();
		   });
		   
		 //11.Find the employee(s) with the highest salary in each department.
		   System.out.println("----Find the employee(s) with the highest salary in each department.---");
		   employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparing(Employee::getSalary))))
		   .entrySet().forEach(entry->{
			   System.out.print(entry.getKey()+" : "+entry.getValue().get().getName());
			   System.out.println();
		   });
		   
		 //12.Determine the department with the highest average salary.
		   System.out.println("-----Determine the department with the highest average salary---");
           employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary))).entrySet().stream()
           .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(1).forEach(entry->{
        	   System.out.print(entry.getKey()+" : "+entry.getValue());
           });
	
           //13.Sort the employees by their age in ascending order.
   	    System.out.println("----Sort the employees by their age in ascending order----");
	    employeeList.stream().sorted(Comparator.comparing(Employee::getAge)).forEach(System.out::println);
	       
	    //14.Check if there are any employees with the same age and print their details.
	    System.out.println("----Check if there are any employees with the same age and print their details--");
	    employeeList.stream().collect(Collectors.groupingBy(Employee::getAge)).entrySet().stream().filter(e->e.getValue().size()>1).forEach(entry->{
	    	System.out.println(entry.getKey()+" :");
	    	System.out.println(entry.getValue());
	    	System.out.println();
	    });
	    
	    
	  //15.Find the employee(s) who have the lowest salary in the organization.
	    System.out.println("----Find the employee(s) who have the lowest salary in the organization---");
	    System.out.println(employeeList.stream().min(Comparator.comparing(Employee::getSalary)));
	
	    //16.Calculate the total number of years of experience of all employees in the organization.
	    System.out.println("----Calculate the total number of years of experience of all employees in the organization.---");
	    employeeList.stream().forEach(e->{
	    	System.out.println(e.getName()+" : "+(2024-e.getYearOfJoining()));
	    });
	    
	  //17.Identify the department(s) with the most number of employees.
	    System.out.println("---Identify the department(s) with the most number of employees---");
	    employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting())).entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
	    .limit(3).forEach(entry->{
	    	System.out.println(entry.getKey()+" : "+entry.getValue());
	    });

	    //18.Find the employee(s) with the shortest name in each department.
	    System.out.println("--Find the employee(s) with the shortest name in each department--");
	    Optional<Employee> e1=employeeList.stream().min(Comparator.comparingInt(x->x.getName().length()));
	     System.out.print(e1.get().getName());
	     
	     //19.Second highest salary
	     System.out.println("------Second Highest Salary---------");
	     Optional<Employee> high=employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();
	     System.out.println(high.get());
	
	}

}
