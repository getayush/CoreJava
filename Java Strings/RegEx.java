package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
	public static void main(String[] args) {
		String string = "Ayush";
		String string2 = "Sarthak";
		String string3 = "ayush";
		String string4 = "sarThaK";
		string.concat(" X");
		System.out.println(string);
		string = string.concat(" X");
		System.out.println(string);
		string = string.concat(" " + string2).concat(" X");
		System.out.println(string);
		System.out.println("The concatention is done in this way " + string + " " + string2);
		System.out.println(string.equalsIgnoreCase(string3));
		System.out.println(string2.equalsIgnoreCase(string4));
		System.out.println(string.equalsIgnoreCase(string4));
		String xString = "Ayush";
		String yString = "Sarthak";
		System.out.println(xString.compareTo(yString));
		String pString = "AyushX";
		String subStrings = pString.substring(4);
		System.out.println(subStrings);
		String[] s = pString.split(subStrings);

		for (int i = 0; i < s.length; ++i) {
			System.out.println(s[i]);
		}

		System.out.println(pString.isEmpty());
		System.out.println(pString.isBlank());
		Pattern pattern = Pattern.compile("@gmail.com", 2);
		Matcher matcher = pattern.matcher("ayushx232@gmail.com");
		Matcher matcher2 = pattern.matcher("ayushx232@GMAIL.COM");
		String checkString = "Ayushx232@gmail.com";
		System.out.println("The result of matches method" + checkString.matches("Ayush(.*)"));
		boolean matchfound = matcher.find();
		boolean matchfound2 = matcher2.find();
		if (matchfound) {
			System.out.println("Found!!");
		}

		if (matchfound2) {
			System.out.println("Again Found ");
		}

	}
}
