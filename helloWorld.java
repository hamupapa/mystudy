public class helloWorld {
	public static void main(String[] args) {

		String str = "";

		if(args.length == 0) {
			str = "Hello, World.";
		}
		else {
			str = "Hello, " + args[0] + ".";
		}
		System.out.println(str);
	}
}
