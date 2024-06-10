

public class ReversedWord {

	public static void main(String[] args) {
		String str1 = "Hello World";
		String[] str2=str1.split(" ");
		String str3=str2[0];
		String str4=str2[1];
		String str5="";
		String str6="";
		for(int i=str3.length()-1;i>=0;i--)
		{
		
			str5=str5+str3.charAt(i);
		}
		
		for(int i=str4.length()-1;i>=0;i--)
		{
			str6=str6+str4.charAt(i);
		}
		System.out.println("input: " + str1);
		System.out.println("Output : " + String.join(" ",str5,str6));
	}
		

}

