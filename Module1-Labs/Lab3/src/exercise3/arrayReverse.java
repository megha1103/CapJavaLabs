package exercise3;
import java.util.Arrays; 
public class arrayReverse {

    static void reverse(int a[], int n) 
    { 
        int[] b = new int[n]; 
        int j = n; 
        for (int i = 0; i < n; i++) { 
            b[j - 1] = a[i]; 
            j = j - 1; 
        } 
  
        System.out.println("Reversed array is: \n"); 
        for (int k = 0; k < n; k++) { 
            System.out.println(b[k]); 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        int [] arr = {7,5,9,2,1}; 
        reverse(arr, arr.length);
        Arrays.sort(arr); 
    } 
}