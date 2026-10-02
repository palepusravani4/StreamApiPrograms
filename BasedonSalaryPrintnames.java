package StreamApiPrograms;

import java.util.Arrays;
import java.util.List;

record Employee(Integer Id,String Name,Double price) {
	
}
public class BasedonSalaryPrintnames {

	public static void main(String[] args) {
		Employee e1=new Employee(101,"jhon",55000d);
		Employee e2=new Employee(102,"A",55000d);
		Employee e3=new Employee(103,"B",65000d);
		Employee e4=new Employee(104,"C",45000d);
		Employee e5=new Employee(105,"D",75000d);
		List<Employee> list=Arrays.asList(e1,e2,e3,e4,e5);
		list.stream().filter(emp->emp.price()>50000).forEach(e->System.out.println(e.Name()));
		
	}

}
