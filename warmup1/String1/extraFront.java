package String1;

public String extraFront(String str) {
    String front = str.length() < 2 ? str : str.substring(0, 2);
    return front + front + front;
}
