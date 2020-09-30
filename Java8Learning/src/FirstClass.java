import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

interface Formula {
	int calculate(int x);

	default double sqrt(int x) {
		return Math.sqrt(x);
	}
}

public class FirstClass {

	public static void main(String[] args) {

		/*
		 * 
		Formula formula = new Formula() {
			@Override
			public int calculate(int x) {
				return x * x;
			}
		};

		System.out.println(formula.calculate(5));
		System.out.println(formula.sqrt(16));
		
		*/
		
		List<String> nameList = Arrays.asList("ankit", "singh","ankur");
		
		/*  Traditonal ways
		Collections.sort(nameList, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				return -(a.compareTo(b));
			}
		});
		*/
		
		//Collections.sort(nameList, (String a, String b) -> a.compareTo(b));
		
		nameList.sort((a, b) -> a.compareTo(b));
		
		System.out.println(nameList);
	}

}
