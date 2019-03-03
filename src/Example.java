import jdk.dynalink.beans.StaticClass;

import java.lang.*;

class Testing {

    public static void main(String[] args) {
        Reverse("GeeksForGeeks");
        if (CheckPalindro("never odd or even")) {
            System.out.printf("%n");
            System.out.print("Yes, it is a palindro");
        } else {
            System.out.print("No, it is not a palindro");
            System.out.printf("%n");
        }
    }
//Reverse any word provide
    public static void Reverse(String word){
        int len = word.length();
        for (int i = len - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }
    }
//compare is the phase is Palindro
    static boolean CheckPalindro(String input){
        input = input.toLowerCase().replaceAll("\\s","");
        int len = input.length();
        for (int i = 0; i < len / 2; i++) {
            if (input.charAt(i) != input.charAt(len - 1 - i)) return false;
        }
        return true;
    }
}


