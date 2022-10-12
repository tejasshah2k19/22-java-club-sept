
public class Add {

	public static void main(String[] args) {// args[0] args[1]
//		System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));

		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
			sum = sum + Integer.parseInt(args[i]);
		}
		
		System.out.println(sum);
	}
}
