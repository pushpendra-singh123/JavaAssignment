import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);

        String text = in.nextLine();
        int size = in.nextInt();

        String[] textArr = text.split("\\s+");

        int[] arr = new int[textArr.length];

        for (int i = 0; i < textArr.length; i++) {
            arr[i] = Integer.parseInt(textArr[i]);
        }

        int maxSum = findMaxSubarraySum(arr, size);
        System.out.println(maxSum);

        int[] maxSubarray = findMaxSubarray(arr, size);
        for (int i = 0; i < maxSubarray.length; i++) {
            System.out.print(maxSubarray[i] + " ");
        }
    }

    public static int findMaxSubarraySum(int[] arr, int size) {
        int maxSum = Integer.MIN_VALUE;
        int maxEnd = 0;
        int start = 0, end = 0;
        int s = 0;

        for (int i = 0; i < size; i++) {
            maxEnd += arr[i];

            if (maxSum < maxEnd) {
                maxSum = maxEnd;
                start = s;
                end = i;
            }

            if (maxEnd < 0) {
                maxEnd = 0;
                s = i + 1;
            }
        }

        return maxSum;
    }

    public static int[] findMaxSubarray(int[] arr, int size) {
        int start = 0, end = 0;
        int s = 0;
        int maxSum = Integer.MIN_VALUE;
        int maxEnd = 0;

        for (int i = 0; i < size; i++) {
            maxEnd += arr[i];

            if (maxSum < maxEnd) {
                maxSum = maxEnd;
                start = s;
                end = i;
            }

            if (maxEnd < 0) {
                maxEnd = 0;
                s = i + 1;
            }
        }

        int[] maxSubarray = new int[end - start + 1];
        for (int i = start; i <= end; i++) {
            maxSubarray[i - start] = arr[i];
        }

        return maxSubarray;
    }
}