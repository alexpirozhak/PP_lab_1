public class Task5 {
    public static int countOfEntrings(String[][] matrix, String substring) {
        int entrings = 0;

        for (String[] row : matrix) {
            for (String element : row) {
                entrings += countOfSubstring(element, substring);
            }
        }

        return entrings;
    }

    private static int countOfSubstring(String element, String substring) {
        int count = 0;

        for (int i = 0; i <= element.length() - substring.length(); i++) {
            if (compareSubstrings(element, i, substring)) {
                count++;
            }
        }

        return count;
    }

    private static boolean compareSubstrings(String element, int start, String substring) {
        for (int i = 0; i < substring.length(); i++) {
            if (element.charAt(start + i) != substring.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
