/*
* Класс для вычисления
*/
public class Calculate {
	public static void main(String[] args) {
		Integer first = Integer.parseInt(args[0]);
		Integer second = Integer.parseInt(args[1]);
		Integer result = first + second;
		System.out.println("sum=" + result);
	}
}