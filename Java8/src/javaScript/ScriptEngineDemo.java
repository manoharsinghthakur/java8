package javaScript;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ScriptEngineDemo {

	public static void main(String[] args) throws FileNotFoundException, ScriptException {
		ScriptEngine engine=new ScriptEngineManager().getEngineByName("Nashorn");
		engine.eval(new FileReader("G:/java practice/hello.js"));
		
	}

}
 