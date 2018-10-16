package stream;

import java.util.Arrays;
import java.util.List;

public class ReduceMethod {

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(1,2,3,4,5,6);
		int sum= l.stream().filter(x-> x%2==0).reduce(0,(val,i)->val+i);
		System.out.println(sum);
	}

}
 