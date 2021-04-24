package hu.nive.ujratervezes.zarovizsga.digitscounter;

import java.util.HashSet;

public class DigitsCounter {
    public int getCountOfDigits(String text) {
        if ((text == null) || (text.equals(""))){
            return 0;
        }
        HashSet<Character> digits = new HashSet<>();
        for (char c : text.toCharArray()){
            if (Character.isDigit(c)){
                digits.add(c);
            }
        }
        return digits.size();
    }
}
