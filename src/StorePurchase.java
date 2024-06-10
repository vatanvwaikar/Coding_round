
public class StorePurchase {
	public static void main(String[] args) {
        
		int[] notes= {10,20,50,100,200};
		int item=380;
		System.out.println(demo(notes,item));
     }
	public static String demo(int[] arr, int item)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		if(sum>=item)
		{
			return "I can Purchase ";
		}
		else
		{
			return (" I need more money !");
		}
	}
}
