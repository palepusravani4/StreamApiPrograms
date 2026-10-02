package StreamApiPrograms;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateNames {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("sudha","sani","shon","sudha","rani");
		list.stream().filter(name->name.startsWith("s")).distinct().forEach(System.out::println);
	}

}
