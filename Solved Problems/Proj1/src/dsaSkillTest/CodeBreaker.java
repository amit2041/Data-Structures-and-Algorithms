package dsaSkillTest;

import java.util.Scanner;

public class CodeBreaker {

	public static String longestCommonPrefix(String s1, String s2) {
        int common = 0;
        int minLength = Math.min(s1.length(), s2.length());
        while (common < minLength && s1.charAt(common) == s2.charAt(common)) {
            common++;
        }
        return s1.substring(0, common);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        String[] strings = new String[n];
        s.nextLine(); // Consume newline after reading integer
        for (int i = 0; i < n; i++) {
            strings[i] = s.nextLine().trim();
        }

        int q = s.nextInt();
        s.nextLine(); // Consume newline after reading integer
        for (int i = 0; i < q; i++) {
            String[] query = s.nextLine().split(" ");
            int x = Integer.parseInt(query[0]);
            String code = query[1];

            int maxLCP = -1;
            String lexSmallest = null;

            for (int j = 0; j < x; j++) {
                String lcp = longestCommonPrefix(strings[j], code);
                if (lcp.length() > maxLCP) {
                    maxLCP = lcp.length();
                    lexSmallest = strings[j];
                } else if (lcp.length() == maxLCP && strings[j].compareTo(lexSmallest) < 0) {
                    lexSmallest = strings[j];
                }
            }

            System.out.println(lexSmallest);
        }
    }
}