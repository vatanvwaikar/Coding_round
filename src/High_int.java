public class High_int {
    
    public static int findMaxRecursive(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        int maxOfRest = findMaxRecursive(arr, n - 1);
        if (arr[n - 1] > maxOfRest) {
            return arr[n - 1];
        } else {
            return maxOfRest;
        }
    }
    public static int findMax(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        return findMaxRecursive(arr, arr.length);
    }
    public static void main(String[] args) {
        int[] array1 = {-1, 3, 5, 6, 99, 12, 2};
        int[] array2 = {6, 7, 8};
        System.out.println(" highest element is : " + findMax(array1));  
        System.out.println("highest element is : " + findMax(array2));  
    }
}
