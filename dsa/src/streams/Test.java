package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {
	
	public List<Employee> getList(){
		
		List<Employee> employeeList = new ArrayList<Employee>();


		employeeList.add(new Employee(1, "Ram", 32, "Male", "HR", 2011, 25000.0));
		employeeList.add(new Employee(2, "Sita", 25, "Female", "Marketing", 2015, 13500.0));
		employeeList.add(new Employee(3, "Murali", 29, "Male", "Sales", 2012, 18000.0));
		employeeList.add(new Employee(4, "Mahesh", 28, "Male", "Development", 2014, 32500.0));
		employeeList.add(new Employee(5, "Preethi", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(6, "Gopi", 43, "Male", "Accounts", 2016, 10500.0));
		employeeList.add(new Employee(7, "Kamal", 35, "Male", "Finance", 2010, 27000.0));
		employeeList.add(new Employee(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
		employeeList.add(new Employee(9, "AKhila", 24, "Female", "Marketing", 2016, 11500.0));
		employeeList.add(new Employee(10, "Arjun", 38, "Male", " Marketing ", 2015, 11000.5));
       return employeeList;
	}
	
	public static void main(String[] args) {
		
		Test test=new Test();
		List<Employee> employeeList=test.getList();
		//male and female count in organization
		System.out.println("-----male and female count in organization---");
		employeeList.stream().collect(Collectors.groupingBy(Employee::getGender)).entrySet().forEach((entry)->
		{System.out.println(entry.getKey()+" : "+entry.getValue().size());});
		
		//print the names of all departments in organization
		System.out.println("-----print the names of all departments in organization-----");
		employeeList.stream().map(emp->emp.getDepartment()).distinct().forEach(System.out::println);
	   
		//highest paid employee using optional
		System.out.println("-----highest paid employee using optional----");
	  Optional<Employee> emp=employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		System.out.println(emp.get());
		
	   //Get the names of all employees who have joined after 2015?
	   System.out.println("------.Get the names of all employees who have joined after 2015-----");
	   employeeList.stream().filter(e->e.getYearOfJoining()>2015).collect(Collectors.toList()).forEach(System.out::println);
		
	   //Get the details of youngest male employee in the Development department
	   System.out.println("-----Get the details of youngest male employee in the Development department---");
	   Optional<Employee> emp1=employeeList.stream().min(Comparator.comparing(Employee::getAge));
	   System.out.println(emp1.get());
	   
	   //6.	How many male and female employees are there in the sales and marketing team
	   System.out.println("---How many male and female employees are there in the sales and marketing team--");
	   employeeList.stream().filter(e->e.getDepartment().equals("Sales")||e.getDepartment().equals("Marketing")).collect(
			   Collectors.groupingBy(Employee::getDepartment,Collectors.groupingBy(Employee::getGender))).entrySet().forEach(
					   entry->{
						   System.out.println(entry.getKey());
						    entry.getValue().entrySet().forEach(e1->{
						    	System.out.println(e1.getKey()+" "+e1.getValue().size());
						    });
						   });
	   //7.	List down the names of all employees in each department?
	   System.out.println("---List down the names of all employees in each department---");
	   employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment)).entrySet().forEach(entry->{
		  System.out.println(entry.getKey()+" : ");
		  entry.getValue().forEach(emp2->System.out.println(emp2.getName()));
	   });
	   
	   //8.Calculate the average salary of all employees in the organization.
	   System.out.println("Average sal of all emps :"+
	   employeeList.stream().collect(Collectors.averagingDouble(Employee::getSalary)));
	   
	   //9.Find the employee with the longest name.
	   System.out.println("--Find the employee with the longest name---");
	   employeeList.stream().max(Comparator.comparingInt(e1->e1.getName().length())).ifPresent(e1->System.out.println(e1.getName()));
	   
	   //10.Group employees by their department and calculate the total salary for each department.
	   System.out.println("---Group employees by their department and calculate the total salary for each department----");
	   employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.summarizingDouble(Employee::getSalary))).entrySet()
	   .forEach(emp2->{
		   System.out.println(emp2.getKey()+" "+
	   emp2.getValue().getSum());
	   });
	   
	   //11.Find the employee(s) with the highest salary in each department.
	   System.out.println("----Find the employee(s) with the highest salary in each department.---");
	   Map<String,Optional<Employee>> map=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
	   map.entrySet().forEach(entry->{
		 System.out.print(entry.getKey()+" : ");  
		 
		 System.out.println(entry.getValue().get().getName());
	   });
	 
	  
	  
	  //12.Determine the department with the highest average salary.
	   System.out.println("-----Determine the department with the highest average salary---");
	    employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,
	    		Collectors.averagingDouble(Employee::getSalary))).entrySet().stream()
	    .max(Comparator.comparing(Map.Entry::getValue)).ifPresent(dep->System.out.println(dep.getKey()));
	    
        
	  //13.Sort the employees by their age in ascending order.
	    System.out.println("----Sort the employees by their age in ascending order----");
	    employeeList.stream().sorted(Comparator.comparing(Employee::getAge)).forEach(System.out::println);
      //14.Check if there are any employees with the same age and print their details.
	    System.out.println("----Check if there are any employees with the same age and print their details--");
	    employeeList.stream().collect(Collectors.groupingBy(Employee::getAge)).entrySet().stream().filter(entry->entry.getValue().size()>1).forEach(entry->{
	    	System.out.println(entry.getKey()+" "+entry.getValue());
	    });
	    
	    //15.Find the employee(s) who have the lowest salary in the organization.
	    System.out.println("----Find the employee(s) who have the lowest salary in the organization---");
	    Employee e1=employeeList.stream().min(Comparator.comparing(Employee::getSalary)).get();
	    System.out.println(e1);
	    
       //16.Calculate the total number of years of experience of all employees in the organization.
	    System.out.println("----Calculate the total number of years of experience of all employees in the organization.---");
	    int ex=employeeList.stream().mapToInt(y->2024-y.getYearOfJoining()).sum();
	    System.out.println(ex);
	    
	    //17.Identify the department(s) with the most number of employees.
	    System.out.println("---Identify the department(s) with the most number of employees---");
	    Map<String,Long> map2= employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
	    Long max=map2.values().stream().max(Long::compareTo).orElse(0L);
	    map2.entrySet().stream().filter(entry->entry.getValue().equals(max)).forEach(entry->System.out.println(entry.getKey()));
	
	    //18.Find the employee(s) with the shortest name in each department.
	    System.out.println("--Find the employee(s) with the shortest name in each department--");
	    Employee e3=employeeList.stream().min(Comparator.comparingInt(e->e.getName().length())).get();
	    System.out.println(e3);
	    
	    //19.Calculate the total number of employees in each age group (e.g., 20-25, 26-30, etc.).
	    
	}

}
