package javaScript;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JsInJava {

	public static void main(String[] args) throws ScriptException {
		ScriptEngineManager sem=new ScriptEngineManager();
		ScriptEngine se=sem.getEngineByName("Nashorn");
		
		String s="mahesh";
		Integer i=null;
		
		se.eval("print(' "+s+" ')");
		System.out.println(se.eval(" 10 + 2 "));
		
	}

}
 