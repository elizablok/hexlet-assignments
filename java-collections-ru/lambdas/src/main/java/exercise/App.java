package exercise;

// BEGIN

public class App {
    public static String[][] enlargeArrayImage(String[][] original) {
        int originalHeight = original.length;
        int originalWidth = original[0].length;

        String[][] enlarged = new String[originalHeight * 2][originalWidth * 2];

        for (int i = 0; i < originalHeight; i++) {
            for (int j = 0; j < originalWidth; j++) {

                String originalValue = original[i][j];

                enlarged[i * 2][j * 2] = originalValue;
                enlarged[i * 2][j * 2 + 1] = originalValue;
                enlarged[i * 2 + 1][j * 2] = originalValue;
                enlarged[i * 2 + 1][j * 2 + 1] = originalValue;
            }
        }

        return enlarged;
    }
}
// END
