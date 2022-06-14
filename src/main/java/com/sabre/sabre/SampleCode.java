package com.sabre.sabre;

public class SampleCode {

	public static void main(String[] args) {
		String word = "malayala";
		char[] ch = word.toCharArray();
		int j = word.length()-1;
		boolean result = true;
		for(int i=0;i<word.length();i++)
		{
			if(ch[i]==ch[j])
			{
				j--;
			}
			else {
				result = false;
				break;
			}
		}
		if(result)
		{
			System.out.println("String is a palindrome");
		}
		else {
			System.out.println("String is not a palindrome");
		}
		
		
		

	}

}
