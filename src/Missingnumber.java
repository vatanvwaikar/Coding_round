

public class Missingnumber {
	static void printUncommon(int arr1[], int arr2[], int n1, int n2)
{

int i = 0, j = 0 ,k=0;
while (i < n1 && j < n2) {

   if (arr1[i] < arr2[j]) {
       System.out.print(arr1[i] + " ");
       i++;
       k++;
   }
   else if (arr2[j] < arr1[i]) {
       System.out.print(arr2[j] + " ");
       k++;
       j++;
   }

   else {
       i++;
       j++;
   }
}

while (i < n1) {
   System.out.print(arr1[i] + " ");
   i++;
   k++;
}
while (j < n2) {
   System.out.print(arr2[j] + " ");
   j++;
   k++;
   }
}
    public static void main(String[] args) {
        int[] numbers = {
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 
            33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 
            63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 90, 91, 92, 93, 94, 
            95, 96, 97, 98, 99, 100
        };
        
        int[] numbers2= { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 
                33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 
                63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75,76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88,89, 90, 91, 92, 93, 94, 
                95, 96, 97, 98, 99, 100};
        
        int n1=numbers.length;
        int n2=numbers2.length;
        
        System.out.println("the missing numbers are :");
        printUncommon(numbers,numbers2,n1,n2); 
    }
}
