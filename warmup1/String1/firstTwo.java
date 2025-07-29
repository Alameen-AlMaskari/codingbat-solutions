package String1;

public String firstTwo(String str) {
    if (str.length()<2){
        return str.substring(0);
    }
    else{
        return str.substring(0,2);
    }
}

