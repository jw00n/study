package �޼ҵ�;

import java.util.Scanner;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class ex09_����_js������� {
	public static void main(String[] args) throws Exception {
		ScriptEngineManager mgr = new ScriptEngineManager();
		ScriptEngine engine = mgr.getEngineByName("JavaScript");

		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���>>");

		String str = sc.next();
		System.out.println(engine.eval(str));

	}
}
