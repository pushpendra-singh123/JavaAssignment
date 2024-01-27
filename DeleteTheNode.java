import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int size = scanner.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            list.add(scanner.nextInt());
        }
        
        if (!list.isEmpty()) {
            list.remove(list.size() - 1);
        }

        for (int element : list) {
            System.out.print(element + " ");
        }
    }
}