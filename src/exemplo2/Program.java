package exemplo2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		List<Integer> newList =list.stream().filter(x -> x > 2).map(x -> x*10).collect(Collectors.toList());
		
		newList.forEach(System.out::println);
	}
}
