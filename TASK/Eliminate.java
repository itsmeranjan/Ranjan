package TASK;

public class Eliminate {
	

	public static void main(String[] args) {
	String str="abccbdabbc";
	char[] ch = str.toCharArray();

	for(int i=0;i<ch.length-1;i++) {
	if(ch[i]!='*')	{
		if(ch[i]==ch[i+1])
		{
		ch[i]='*';
		ch[i+1]='*';

		}
	}
	
	


	}
	String s1=String.valueOf(ch).replace("*", "");
	System.out.println(s1);

	}
	}


