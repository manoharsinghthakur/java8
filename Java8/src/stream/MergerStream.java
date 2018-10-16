package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MergerStream {
	public static void main(String[] args) {
		List<String> string=Arrays.asList("a","gg","c","d","g");
		String list=string.stream().filter(s-> !string.isEmpty()).collect(Collectors.joining(", "));
		System.out.println(list);
	}

}
 