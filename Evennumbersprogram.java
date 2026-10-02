package StreamApiPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Evennumbersprogram {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		ArrayList<Integer> arlist=new ArrayList();
		for(Integer num:list) {
			if(num%2==0)
			arlist.add(num);
		}
		arlist.forEach(System.out::print);
		System.out.println("----------------------------");
		list.stream().filter(num->num%2==0).forEach(System.out::println);
		
	}

}
