package stream;

import java.util.Date;
import java.util.stream.Stream;

public class StreamDate {

	public static void main(String[] args) {
		Stream s=Stream.generate(()->{
			return new Date();
		}).limit(1);
		
		s.forEach(System.out::println);
	}
	

}
 