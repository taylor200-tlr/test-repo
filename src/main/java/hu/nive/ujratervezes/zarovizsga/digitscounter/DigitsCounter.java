package hu.nive.ujratervezes.zarovizsga.digitscounter;


import java.util.HashSet;
import java.util.Set;

public class DigitsCounter {
    public int getCountOfDigits(String text) {
        if ((text == null) || (text.equals(""))){
            return 0;
        }
        Set<Character> digits = new HashSet<>();
        for (char c : text.toCharArray()){
            if (Character.isDigit(c)){
                digits.add(c);
            }
        }
        return digits.size();
    }
}
