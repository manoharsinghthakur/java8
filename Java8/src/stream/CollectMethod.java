package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectMethod {

	public static void main(String[] args) {
		List l=Arrays.asList(1,5,3,4,2,6);
		List el=(List) l.stream().filter(x->(int) x%2==0).collect(Collectors.toList());
		System.out.println(el);
	}

} 
