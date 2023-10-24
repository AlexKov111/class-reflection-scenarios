package telran.reflection;

public class X {
	
	String f1(int a) {
		return String.format("function1 %d", a);
	}
	private String f2(int a) {
		return String.format("function2 %d", a);
	}

	public String f3(int a) {
		return String.format("function3 %d", a);
	}
}
