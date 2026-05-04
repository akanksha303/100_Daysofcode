import java.util.Scanner;

class Anangram {

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int value : count) {
            if (value != 0) {
                return false;
            }
        }

        return true;
    }
}

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = sc.next();

        System.out.print("Enter second string: ");
        String t = sc.next();

        Anangram sol = new Anangram();

        boolean result = sol.isAnagram(s, t);

        System.out.println("Is Anagram: " + result);

        sc.close();
    }
}