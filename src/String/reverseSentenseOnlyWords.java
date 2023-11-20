package String;

import java.util.Arrays;

public class reverseSentenseOnlyWords {


	public static String reverse(String s) {
		// TODO Auto-generated method stub
		
		String rev="";
		
		for (int i = s.length()-1; i>=0; i--) {
			
			rev=rev+s.charAt(i);
			
		}
		return rev;
		

	}
	public static void reverseWords(String s)
	{
		String [] words=s.split(" ");
		
		for (int i = 0; i < words.length; i++) {
			
			words [i]=reverse(words[i]);
		}
		System.out.println(Arrays.toString(words));
		String ans="";
		
		for (int i = 0; i < words.length; i++) {
			
			ans=ans+words[i]+" ";
		}
		System.out.println(ans.trim());
		
		
		
	}
	public static void main(String[] args) {
		reverseWords("I love my india");
	}
}
