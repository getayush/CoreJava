package Strings;

public class StringBufferExample {
	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer("Ayush");
		stringBuffer.append(" Sarthak");
		System.out.println(stringBuffer);
		stringBuffer.append(false);
		System.out.println(stringBuffer);
		boolean brother = true;
		stringBuffer.append(brother);
		CharSequence charSequence = "Golden Times";
		stringBuffer.append(charSequence);
		char[] nums = new char[]{'7', 'A', '5', 'B', '1'};
		stringBuffer.append(nums);
		String dates = " 7th December 2022";
		char[] converted = dates.toCharArray();
		stringBuffer.append(converted);
		StringBuffer sb = new StringBuffer();
		String[] strings = new String[]{"Take", "Me", "Out", "For", "Dinner"};
		sb.append(strings);
		System.out.println("The response is " + sb.toString());
		System.out.println("After all appending " + stringBuffer);
		stringBuffer.reverse();
		System.out.println("Reversing stringBuffer " + stringBuffer);
	}
}