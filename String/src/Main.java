import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		///	Donn?es
		String s = "Tsantanirina";
		String b = "3";
		byte by = Byte.parseByte(b);
		char[] tab = {'b', 'o', 'n', 'j', 'o', 'u', 'r'};
		
		// Process*
		String bonjour = new String(tab);
		String ch = new String(tab, 2, 4);
		System.out.println(ch);
		System.out.println(bonjour);
		System.out.println(s.charAt(8));
		System.out.println(s.indexOf("a", 3));
		System.out.println(by);
		char[] nom = s.toCharArray();
		System.out.println(String.valueOf(nom));
		
		String s1, s2;
		s1 = "Tsanta"; s2 = "Nirina";
		String s3 = s1.concat(s2);
		System.out.println(s3);
		
		System.out.println("Test 1---------------------------");
		String java = "la java";
		StringBuffer buff = new StringBuffer(java);
		System.out.println(buff);
		System.out.println("caractere a la position 0 : " + buff.charAt(0));
		buff.setCharAt(3, 'J'); System.out.println(buff);
		buff.setCharAt(1, 'e'); System.out.println(buff);
		buff.append(" 2"); System.out.println(buff);
		buff.insert(3, "langage "); System.out.println(buff);
	}
	
}
	
