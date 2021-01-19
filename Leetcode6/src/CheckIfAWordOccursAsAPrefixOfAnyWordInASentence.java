import java.util.ArrayList;

public class CheckIfAWordOccursAsAPrefixOfAnyWordInASentence {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int searchIndex = -1;
        String[] sentences = sentence.split(" ");

        for (int i = 0; i < sentences.length; i++) {
            if (sentences[i].indexOf(searchWord) == 0) {
                return i + 1;
            }
        }

        return searchIndex;
    }
}
