public class Ex5_another_way {
    public static void main(String[] args) {
        printPattern();
    }

    private static void printPattern() {
        char[][] pattern = {
                { ' ', ' ', ' ', 'J', ' ', ' ', ' ', 'a', ' ', ' ', 'v', ' ', ' ', ' ', ' ', 'v', ' ', ' ', 'a' },
                { ' ', ' ', ' ', 'J', ' ', ' ', 'a', ' ', 'a', ' ', 'v', ' ', ' ', ' ', 'v', ' ', ' ', 'a', 'a' },
                { 'J', ' ', ' ', 'J', ' ', 'a', 'a', 'a', 'a', 'a', 'a', 'a', ' ', 'V', ' ', 'V', ' ', ' ', 'a', 'a',
                        'a', 'a' },
                { ' ', 'J', 'J', ' ', ' ', 'a', ' ', ' ', ' ', ' ', ' ', ' ', 'V', ' ', ' ', 'a', ' ', ' ', ' ', ' ',
                        'a', ' ', ' ' }
        };

        for (int i = 0; i < pattern.length; i++) {
            for (int j = 0; j < pattern[i].length; j++) {
                System.out.print(pattern[i][j]);
            }
            System.out.println();
        }
    }
}
