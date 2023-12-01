package gusev.java23.j1_05.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnicodeCharInfoTest {

    @Test
    void char0() {
        char in = '0';
        UnicodeCharInfo uci = new UnicodeCharInfo(in);
        int answer = uci.getInt();
        assertEquals(48, answer, "getInt");
        String answerS = uci.getHex();
        assertEquals("U+0030", answerS, "getHex");
        char answerC = uci.getNextChar();
        assertEquals('1', answerC, "getNextChar");
        answerC = uci.getPrevChar();
        assertEquals('/', answerC, "getPrevChar");
        answerS = uci.getCharType();
        assertEquals("DIGIT", answerS, "getCharType");
        answer = uci.getNumber();
        assertEquals(-1, answer, "getNumber");
    }
    @Test
    void charN() {
        char in = 'N';
        UnicodeCharInfo uci = new UnicodeCharInfo(in);
        int answer = uci.getInt();
        assertEquals(78, answer, "getInt");
        String answerS = uci.getHex();
        assertEquals("U+004e", answerS, "getHex");
        char answerC = uci.getNextChar();
        assertEquals('O', answerC, "getNextChar");
        answerC = uci.getPrevChar();
        assertEquals('M', answerC, "getPrevChar");
        answerS = uci.getCharType();
        assertEquals("LETTER_UPPER", answerS, "getCharType");
        answer = uci.getNumber();
        assertEquals(14, answer, "getNumber");
    }
    @Test
    void charz() {
        char in = 'z';
        UnicodeCharInfo uci = new UnicodeCharInfo(in);
        int answer = uci.getInt();
        assertEquals(122, answer, "getInt");
        String answerS = uci.getHex();
        assertEquals("U+007a", answerS, "getHex");
        char answerC = uci.getNextChar();
        assertEquals('{', answerC, "getNextChar");
        answerC = uci.getPrevChar();
        assertEquals('y', answerC, "getPrevChar");
        answerS = uci.getCharType();
        assertEquals("LETTER_LOWER", answerS, "getCharType");
        answer = uci.getNumber();
        assertEquals(26, answer, "getNumber");
    }
    @Test
    void charЖ() {
        char in = 'Ж';
        UnicodeCharInfo uci = new UnicodeCharInfo(in);
        int answer = uci.getInt();
        assertEquals(1046, answer, "getInt");
        String answerS = uci.getHex();
        assertEquals("U+0416", answerS, "getHex");
        char answerC = uci.getNextChar();
        assertEquals('З', answerC, "getNextChar");
        answerC = uci.getPrevChar();
        assertEquals('Е', answerC, "getPrevChar");
        answerS = uci.getCharType();
        assertEquals("LETTER_UPPER", answerS, "getCharType");
        answer = uci.getNumber();
        assertEquals(-1, answer, "getNumber");
    }
    @Test
    void charBlank() {
        char in = ' ';
        UnicodeCharInfo uci = new UnicodeCharInfo(in);
        int answer = uci.getInt();
        assertEquals(32, answer, "getInt");
        String answerS = uci.getHex();
        assertEquals("U+0020", answerS, "getHex");
        char answerC = uci.getNextChar();
        assertEquals('!', answerC, "getNextChar");
        answerC = uci.getPrevChar();
        assertEquals('\u001F', answerC, "getPrevChar");
        answerS = uci.getCharType();
        assertEquals("SPACE", answerS, "getCharType");
        answer = uci.getNumber();
        assertEquals(-1, answer, "getNumber");
    }
    @Test
    void charTab() {
        char in = '\u0009';
        UnicodeCharInfo uci = new UnicodeCharInfo(in);
        int answer = uci.getInt();
        assertEquals(9, answer, "getInt");
        String answerS = uci.getHex();
        assertEquals("U+0009", answerS, "getHex");
        char answerC = uci.getNextChar();
        assertEquals('b', answerC, "getNextChar");//Юникод номер Backspace нельзя применять ни в каком виде
        answerC = uci.getPrevChar();
        assertEquals('\u0008', answerC, "getPrevChar");
        answerS = uci.getCharType();
        assertEquals("SPACE", answerS, "getCharType");
        answer = uci.getNumber();
        assertEquals(-1, answer, "getNumber");
    }
    @Test
    void charAmpersant() {
        char in = '&';
        UnicodeCharInfo uci = new UnicodeCharInfo(in);
        int answer = uci.getInt();
        assertEquals(38, answer, "getInt");
        String answerS = uci.getHex();
        assertEquals("U+0026", answerS, "getHex");
        char answerC = uci.getNextChar();
        assertEquals('\'', answerC, "getNextChar");
        answerC = uci.getPrevChar();
        assertEquals('%', answerC, "getPrevChar");
        answerS = uci.getCharType();
        assertEquals("OTHER", answerS, "getCharType");
        answer = uci.getNumber();
        assertEquals(-1, answer, "getNumber");
    }
    @Test
    void charGreece() {
        char in = 'λ';
        UnicodeCharInfo uci = new UnicodeCharInfo(in);
        int answer = uci.getInt();
        assertEquals(955, answer, "getInt");
        String answerS = uci.getHex();
        assertEquals("U+03bb", answerS, "getHex");
        char answerC = uci.getNextChar();
        assertEquals('μ', answerC, "getNextChar");
        answerC = uci.getPrevChar();
        assertEquals('κ', answerC, "getPrevChar");
        answerS = uci.getCharType();
        assertEquals("OTHER", answerS, "getCharType");
        answer = uci.getNumber();
        assertEquals(-1, answer, "getNumber");
    }
}