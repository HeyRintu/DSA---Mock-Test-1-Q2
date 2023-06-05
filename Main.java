public class Main {
    public static int firstUniqChar(String s) {
        int[] charCount = new int[26]; // Array to store the count of each character

        // Count the occurrences of each character in the string
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }

        // Find the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            if (charCount[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        // No non-repeating character found
        return -1;
    }

    public static void main(String[] args) {
        String s1 = "leetcode";
        System.out.println("First non-repeating character index in '" + s1 + "': " + firstUniqChar(s1));

        String s2 = "loveleetcode";
        System.out.println("First non-repeating character index in '" + s2 + "': " + firstUniqChar(s2));

        String s3 = "aabb";
        System.out.println("First non-repeating character index in '" + s3 + "': " + firstUniqChar(s3));
    }
}