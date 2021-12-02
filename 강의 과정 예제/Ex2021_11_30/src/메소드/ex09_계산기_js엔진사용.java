package 메소드;

import java.util.Scanner;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class ex09_계산기_js엔진사용 {
	public static void main(String[] args) throws Exception {
		ScriptEngineManager mgr = new ScriptEngineManager();
		ScriptEngine engine = mgr.getEngineByName("JavaScript");

		Scanner sc = new Scanner(System.in);
		System.out.println("계산식을 입력하세요>>");

		String str = sc.next();
		System.out.println(engine.eval(str));

	}
}
