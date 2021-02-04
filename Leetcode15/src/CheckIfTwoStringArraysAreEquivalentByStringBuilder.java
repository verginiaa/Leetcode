public class CheckIfTwoStringArraysAreEquivalentByStringBuilder {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuilder sbOne = new StringBuilder();
        for (int i = 0; i < word1.length; i++)
            sbOne.append(word1[i]);
        StringBuilder sbTwo = new StringBuilder();
        for (int i = 0; i < word2.length; i++)
            sbOne.append(word2[i]);
        return sbOne.toString().equals(sbTwo.toString());
    }
}
