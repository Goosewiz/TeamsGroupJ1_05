package gusev.java23.j1_05.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransliterationTest {

    @Test
    void russianToEnglish() {
        String input = "виноград";
        String answer = Transliteration.russianToEnglish(input);
        assertEquals("vinograd", answer, "Ru");
        input = " ЁЖ ";
        answer = Transliteration.russianToEnglish(input);
        assertEquals(" YoZh ", answer, "Ru");
        input = "Виноград";
        answer = Transliteration.russianToEnglish(input);
        assertEquals("Vinograd", answer, "Ru");
        input = "!ЯбЛоКо";
        answer = Transliteration.russianToEnglish(input);
        assertEquals("!YabLoKo", answer, "Ru");
    }
    @Test
    void englishToRussian(){
        String input = "Vinograd";
        String answer = Transliteration.englishToRussian(input);
        assertEquals("Виноград", answer, "Eng");
        input = "YabLoKo";
        answer = Transliteration.englishToRussian(input);
        assertEquals("ЯбЛоКо", answer, "Eng");
        input = "YoZh";
        answer = Transliteration.englishToRussian(input);
        assertEquals("ЁЖ", answer, "Eng");
        input = "Shchyotka    ";
        answer = Transliteration.englishToRussian(input);
        assertEquals("Щётка    ", answer, "Eng");
        input = "!Chajka";
        answer = Transliteration.englishToRussian(input);
        assertEquals("!Чайка", answer, "Eng");
        input = "yubka";
        answer = Transliteration.englishToRussian(input);
        assertEquals("юбка", answer, "Eng");
        input = "shepot";
        answer = Transliteration.englishToRussian(input);
        assertEquals("шепот", answer, "Eng");
    }
}