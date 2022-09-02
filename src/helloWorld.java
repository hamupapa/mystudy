public class helloWorld {
	public static void main(String[] args) {

		String str = "";

		// 引数が与えられていなければ「Hello, World」を表示する
		if(args.length == 0) {
			str = "Hello, World.";
		}
		// 引数が与えられていれば「Hello, <与えられた引数>」を表示する
		else {
			str = "Hello, " + args[0] + ".";
		}
		// 出力
		System.out.println(str);
	}
}
