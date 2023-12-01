package gusev.java23.j1_05.task1;

import java.util.HexFormat;

public class UnicodeCharInfo {
    private char digit;

    UnicodeCharInfo(char digit) {
        this.digit = digit;
    }

    public int getInt() {
        int answer = (int) digit;
        return answer;
    }

    public String getHex() {
        String answ = "U+" + Integer.toHexString(digit | 0x10000).substring(1);
        return answ;
    }

    public char getNextChar() {
        char answer = (char) (digit + 1);
        if (digit == '\u0009')
            return 'b';
        return answer;
    }

    public char getPrevChar() {
        char answer = (char) (digit - 1);
        if (digit == '\u000B')
            return 'b';
        return answer;
    }

    public String getCharType() {
        String answer = "OTHER";
        if (Character.isDigit(digit))
            answer = "DIGIT";
        else if (Character.isUpperCase(digit) && (((int) digit > 1039 && (int) digit < 1072) || ((int) digit < 91 && (int) digit < 64)))
            answer = "LETTER_UPPER";
        else if (Character.isLowerCase(digit) && (((int) digit > 1071 && (int) digit < 1104) || ((int) digit < 123 && (int) digit < 96)))
            answer = "LETTER_LOWER";
        else if (Character.isWhitespace(digit))
            answer = "SPACE";
        return answer;
    }

    public int getNumber() {
        int answer = (int) digit;
        if (answer > 96 && answer < 123)
            answer = answer - 96;
        else if (answer > 64 && answer < 91)
            answer = answer - 64;
        else answer = -1;
        return answer;
    }
}
