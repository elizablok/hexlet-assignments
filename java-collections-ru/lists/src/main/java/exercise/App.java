package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static boolean scrabble(String letterSet, String word) {
        String[] splitLetterSet = letterSet.toLowerCase().split("");
        String[] splitWord = word.toLowerCase().split("");

        List<String> letterSetList = new ArrayList<String>(Arrays.asList(splitLetterSet));
        List<String> wordList = new ArrayList<String>(Arrays.asList(splitWord));

        boolean hasAllLetters = true;

        for (String wordLetter: wordList) {

            if (!letterSetList.contains(wordLetter)) {
                hasAllLetters = false;
                break;
            }
            letterSetList.remove(wordLetter);
        }

        return hasAllLetters;
    }
}
//END
