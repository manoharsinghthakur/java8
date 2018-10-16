package stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethod {
	public static void main(String[] args) {
		List l = Arrays.asList(1, 5, 6, 2);
		System.out.println(l);
		List listSquare = (List) l.stream().map(x -> (int)x*(int)x).collect(Collectors.toList());

		System.out.println(listSquare);
	}

}
 