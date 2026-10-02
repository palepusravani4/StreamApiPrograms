package StreamApiPrograms;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NameStartswithH {
public static void main(String[] args)
	    {
	        //Retrieve cities which starts with 'H' character
	        String []cities = {"Hyderabad", "Jaipur", "Haryana", "Indore", "Chennai"};
	       
	        Stream<String> s=Arrays.stream(cities);
	        s.filter(n->n.startsWith("H")).forEach(System.out::println);
	         int[] arr= {10,15,20,25,30,35,40,45,50};
	         IntStream a=Arrays.stream(arr);
	         
	         a.filter(n->n%3==0&&n%5==0).forEach(System.out::println);
	         
	         
	         String[] name={"siri","sai","allen","smith","blake","joe"};
	         Stream<String> names=Arrays.stream(name);
	         names.filter(n->n.length()>3).forEach(System.out::println);
	         
	       
	    }

	}
