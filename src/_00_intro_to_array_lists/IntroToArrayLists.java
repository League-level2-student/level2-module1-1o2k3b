package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
ArrayList<String> Strings = new ArrayList<String>();
		//2. Add five Strings to your list
int i = 0;		

		Strings.add("one");
		Strings.add("two");
		Strings.add("three");
		Strings.add("four");
		Strings.add("five");
		//3. Print all the Strings using a standard for-loop
		System.out.print("I can count to five: ");
		for(i = 0; i<5; i++) {
			String j = Strings.get(i);
		System.out.print(j + " ");
		}
		System.out.println("\n");
		//4. Print all the Strings using a for-each loop
		for(String s : Strings) {
			System.out.println(s);
		}
		System.out.println("\n");
		System.out.println("I know even vs odds too");
		System.out.println("these are even: ");

		//5. Print only the even numbered elements in the list.
for(int even = 0; even<5; even++) {
	String num = Strings.get(even);
	if(even%2 == 1) {
		System.out.print(num + " ");
	}
}
System.out.println("\n");
System.out.println("these are odd: ");

	for(int odd = 0; odd<5; odd++) {
		String one = Strings.get(odd);
		if(odd%2 == 0) {
			System.out.print(one + " ");
		}
System.out.println("\n");
}
		//6. Print all the Strings in reverse order.
	for(i = 4; i>-1; i--) {
System.out.println(Strings.get(i));
	}	
	System.out.println("\n");
	
	//7. Print only the Strings that have the letter 'e' in them.
	
	for(i = 0; i<5; i++) {
		String j = Strings.get(i);
			if(j.contains("e")) {
				System.out.println(j);
			}
	}
	
	}
}
