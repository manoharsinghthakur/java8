package javaScript;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class InvokeFunctionDemo {

	public static void main(String[] args) throws ScriptException, FileNotFoundException, NoSuchMethodException {
		ScriptEngine engine=new ScriptEngineManager().getEngineByName("Nashorn");
		engine.eval(new FileReader("src/javaScript/hello1.js"));
		Invocable invocable=(Invocable) engine;
		Object ob=invocable.invokeFunction("fun1", "ram");
		System.out.println(ob.getClass());
		System.out.println(ob);
		
		
	} 

}
