package stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList();
		for(int i=0;i<5;i++){
			l.add(i);
		}
		int count=(int) l.parallelStream().filter(x->x%2==0).count();
		System.out.println(count);
		System.out.println(l.stream().filter(x->x%2==0).count());
	}
 
}
