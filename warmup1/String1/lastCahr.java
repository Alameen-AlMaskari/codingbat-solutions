package String1;

public String lastChar(String a, String b) {
    char first = (a.length() > 0) ? a.charAt(0) : '@';
    char last = (b.length() > 0) ? b.charAt(b.length() - 1) : '@';
    return "" + first + last;
}
