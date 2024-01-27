import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int size = in.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            int el = in.nextInt();
            arr[i] = el;
        }
        in.close();
        
        sortArray(arr);
        
        for (int el: arr) {
            System.out.print(el + " ");
        }
    }
    
    private static void sortArray(int[] arr) {
        int size = arr.length;
        
        for (int i = 1; i < size - 1; i += 2) {
            if (i > 0 && i < size - 1 && arr[i] > arr[i+1] && arr[i] > arr[i-1]) {
                continue;
            }
            
            if (arr[i] < arr[i+1]) {
                swap(arr, i, i+1);
            } 
            if (arr[i] < arr[i-1]) {
                swap(arr, i, i-1);
            }
            if (arr[i+1] < arr[i-1]) {
                swap(arr, i+1, i-1);
            }
        }
        
        if (size % 2 == 0 && arr[size - 1] < arr[size - 2]) {
            swap(arr, size - 1, size - 2);
        }
    }
    
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}