package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {
	public static void main(String[] args) {
		Stream myStream=Stream.of(12,45,78,1,33,125);
		myStream.forEach(System.out::println);
		
		List l=new ArrayList<>();
		l.add("a");
		l.add("h");
		l.add("d");
		
		System.out.println(l);

		Stream s=l.stream();
		 
		s.forEach(System.out::print);
		//we can't use stream object more than one time
		//System.out.println((int) s.count());
		
	}
}
