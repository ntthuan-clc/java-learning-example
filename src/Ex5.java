public class Ex5 {
    public static void main(String[] args) {
        // Pattern lines as an array of strings
        String[] patternLines = {
                "   J    a   v     v  a",
                "   J   a a   v   v  a a",
                "J  J  aaaaa   V V  aaaaa",
                " JJ  a     a   V  a     a"
        };

        // Print each line of the pattern
        for (String line : patternLines) {
            System.out.println(line);
        }
    }
}
