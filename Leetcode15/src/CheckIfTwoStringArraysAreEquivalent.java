public class CheckIfTwoStringArraysAreEquivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String strOne = String.join(",", word1);
        strOne=strOne.replaceAll(",","");
        String strTwo = String.join(",", word2);
        strTwo=strTwo.replaceAll(",","");

        return strOne.equals(strTwo);

    }
}
