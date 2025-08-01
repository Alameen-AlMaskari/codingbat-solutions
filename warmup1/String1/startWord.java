package String1;

public String startWord(String str, String word) {
    int wordLen = word.length();
    if (str.length() < wordLen) {
        return "";
    }
    String strFront = str.substring(0, wordLen);
    // Check if all chars except the first match
    if (strFront.substring(1).equals(word.substring(1))) {
        return strFront;
    }
    return "";
}
