package Java8Feature;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedPrgs {

	public SortedPrgs() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*******Sortred Prgs*******");
		System.out.println();
		System.out.println("============================");
		
		List<Integer> al = Arrays.asList(11,22,33,54,56,67,76,87,89,90,98);
		List<Integer> alsorted = al.stream().sorted().toList();
		List<Integer> alreversesorted = al.stream().sorted(Comparator.reverseOrder()).toList();

		
		System.out.println();
		System.out.println("Sorted List : "+alsorted);
		System.out.println("Reversed Sorted List : "+alreversesorted);
		
		List <String> al1 = Arrays.asList("Mohan","Ram","Balu","Surya","Rohan","Lakshman");
		List <String> al2 = al1.stream().sorted(Comparator.comparingInt(e-> e.length())).toList();
		List <String> al3 = al1.stream().sorted(Comparator.comparingInt(e-> e.length())).filter(e->(e.length()>3&&e.length()<6&&e.contains("a"))).toList();

		System.out.println("Sorted Name According to the length of each word :"+al2);
		System.out.println("Sorted Name According to the length Not Exceeding 3to5 and contains 'a' :"+al3);
		System.out.println();
		System.out.println("============================");
		
	}

}
