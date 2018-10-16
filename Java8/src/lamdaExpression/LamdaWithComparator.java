package lamdaExpression;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.omg.Messaging.SyncScopeHelper;

class Employee{
	Integer id;
	String name;
	Double salary;
	public Employee(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public String toString(){
		return id+", "+name+", "+salary;
	}
	 
}

public class LamdaWithComparator {
	public static void main(String[] args) {
		List<Employee> l=new ArrayList<Employee>();
		l.add(new Employee(101, "name1", 1500.00));
		l.add(new Employee(102, "name4", 100.00));
		l.add(new Employee(103, "nam3", 2500.00));
		l.add(new Employee(104, "name2", 500.00));
				
		l.forEach((s)->System.out.println(s));
		
		Collections.sort(l,(e1,e2)->{
			if (e1.salary > e2.salary){
				return 1;
			};
			return -1;
		});
		System.out.println("--------------");
		l.forEach((s)->System.out.println(s));
		
	}

}
