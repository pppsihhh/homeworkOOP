package sample;

public class Main {
	public static void main(String[] args) {

		TipoStack ts = new TipoStack(2);
		System.out.println(ts.getTStack().length);
		ts.push(34);
		ts.push(45);
		ts.push("Hello");
		ts.push("world");
		ts.push("java");
		System.out.println(ts.getTStack().length);
		System.out.println(ts.toString());
		System.out.println("------------------------------");
		Object a = ts.peek();
		System.out.println("method peek() => " + a.toString());
		System.out.println("after method peek() => " + ts.toString());
		System.out.println("------------------------------");
		Object b = ts.pop();
		System.out.println("method pop() => " + b.toString());
		System.out.println("after method pop() => " + ts.toString());
		System.out.println("------------------------------");
		Object c = ts.pop();
		System.out.println("else method pop() => " + c.toString());
		System.out.println("after else method pop() => " + ts.toString());
	}
}
