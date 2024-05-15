package Strings;

public class StringBuilderExample {
	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder("Ayush");
		System.out.println(stringBuilder);
		stringBuilder.reverse();
		System.out.println(stringBuilder);
		StringBuilder sBuilder = new StringBuilder("Ayush Mantralay Founded");
		int x = stringBuilder.compareTo(sBuilder);
		System.out.println(x);
		System.out.println(sBuilder.charAt(3));
		System.out.println(sBuilder.substring(1));
		System.out.println(sBuilder.substring(1, 6));
		sBuilder.insert(4, "Change");
		System.out.println(sBuilder);
		sBuilder.replace(2, 8, "Let's See");
		System.out.println(sBuilder);
		sBuilder.deleteCharAt(11);
		System.out.println("The deleteCharAt shows " + sBuilder);
		sBuilder.delete(2, 8);
		System.out.println(sBuilder);
		System.out.println(sBuilder.length());
		System.out.println(stringBuilder.lastIndexOf("yus"));
	}
}