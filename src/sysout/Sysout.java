package sysout;

import java.util.ArrayList;
import java.util.List;

public class Sysout {

	public static void main(String[] args) {
	 List<Integer> ListIntegers = new ArrayList<>();
	 ListIntegers.add(1);
	 ListIntegers.add(2);
	 ListIntegers.add(3);
	 
	 // Function lambda
	 ListIntegers.forEach(intger -> System.out.println(intger));
	 
	// Reference Method
	 ListIntegers.forEach(System.out::println);
	}

}
