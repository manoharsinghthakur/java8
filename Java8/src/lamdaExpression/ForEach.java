package lamdaExpression;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
	public static void main(String[] args){
List<String> list=new ArrayList<String>();
list.add("abnc");
list.add("1232");
list.add("545");
//list.forEach((x)->System.out.println(x));

 
list.forEach( System.out::println);

    }
} 