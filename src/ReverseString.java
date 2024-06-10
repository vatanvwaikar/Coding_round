
public class ReverseString {

	public static void main(String[] args) {
		String str1 = "Hello World";
		String str2 = reversedstring(str1);
		
		System.out.println("Original string : " + str1);
		System.out.println(("reversed string : " + str2));
	}
	
	private static String reversedstring( String str) {
		String str3 = " ";
		
		 for(int i= str.length()-1;i>=0;i--) {
			 str3 = str3 + str.charAt(i);
		 }
		return str3;
	}

}
