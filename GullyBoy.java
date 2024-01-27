import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String text = in.nextLine();
        int pos = in.nextInt();
        int n = in.nextInt();

        List<Character> characters = new ArrayList<>();

        for (char ch : text.toCharArray()) {
            if (ch != ' ') {
                characters.add(ch);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = pos - 1; j < characters.size(); j++) {
                System.out.print(characters.get(j) + " ");
            }

            for (int j = 0; j < pos - 1; j++) {
                System.out.print(characters.get(j) + " ");
            }
        }
    }
}