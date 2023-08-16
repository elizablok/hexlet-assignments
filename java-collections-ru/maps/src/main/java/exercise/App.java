package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        Map<String, Integer> wordsCount = new HashMap<>();
        if (sentence.equals("")) {
            return wordsCount;
        }
        String[] splitSentence = sentence.split(" ");
        for (var i = 0; i < splitSentence.length; i++) {
            var word = splitSentence[i];
            var count = wordsCount.containsKey(word) ? wordsCount.get(word) + 1 : 1;
            wordsCount.put(word, count);
        }
        return wordsCount;
    }

    public static String toString(Map<String, Integer> wordsCount) {
        if (wordsCount.isEmpty()) {
            return "{}";
        }
        StringBuilder res = new StringBuilder("{");
        for (Map.Entry<String, Integer> wordCount: wordsCount.entrySet()) {
            res.append("\n  ").append(wordCount.getKey()).append(": ").append(wordCount.getValue());
        }
        res.append("\n}");
        return res.toString();
    }
}
//END
