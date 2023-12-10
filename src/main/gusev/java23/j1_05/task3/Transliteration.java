package gusev.java23.j1_05.task3;

import java.util.Arrays;
import java.util.List;

public class Transliteration {
    private final static String[] russianLetters = new String[]{"А", "Б", "В", "Г", "Д", "Е", "Ё", "Ж", "З", "И", "Й", "К", "Л", "М",
            "Н", "О", "П", "Р", "С", "Т", "У", "Ф", "Х", "Ц", "Ч", "Ш", "Щ", "Ъ", "Ы", "Ь", "Э", "Ю", "Я"};
    private final static String[] englishLetters = new String[]{"A", "B", "V", "G", "D", "E", "Yo", "Zh", "Z", "I", "J", "K", "L", "M",
            "N", "O", "P", "R", "S", "T", "U", "F", "H", "C", "Ch", "Sh", "Shch", "\"", "Y", "'", "E", "Yu", "Ya"};
    private final static List<String> listOfEnglishLetters = Arrays.asList("A", "B", "V", "G", "D", "E", "Yo", "Zh", "Z", "I", "J", "K", "L", "M",
            "N", "O", "P", "R", "S", "T", "U", "F", "H", "C", "Ch", "Sh", "Shch", "\"", "Y", "'", "E", "Yu", "Ya", "yo", "zh", "ch",
            "sh", "shch", "yu", "ya");

    public static String russianToEnglish(String russian) {
        StringBuilder answer = new StringBuilder();
        StringBuilder in = new StringBuilder(russian);
        for (int i = 0; i < russian.length(); i++) {
            String temp = in.substring(0, 1);
            in.delete(0, 1);
            int j = 0;
            while ((j < 33) && (!russianLetters[j].equals(temp.toUpperCase()))) {
                j = j + 1;
            }
            if (j == 33)
                answer.append(temp);
            else if (!temp.toUpperCase().equals(temp))
                answer.append(englishLetters[j].toLowerCase());
            else
                answer.append(englishLetters[j]);
        }
        return new String(answer);
    }

    public static String englishToRussian(String english) {
        StringBuilder answer = new StringBuilder();
        StringBuilder in = new StringBuilder(english);
        while (in.length() != 0) {
            String temp;
            if (in.length() >= 4 && listOfEnglishLetters.contains(in.substring(0, 4))) {
                temp = in.substring(0, 4);
                in.delete(0, 4);
            } else if (in.length() >= 2 && listOfEnglishLetters.contains(in.substring(0, 2))) {
                temp = in.substring(0, 2);
                in.delete(0, 2);
            } else {
                temp = in.substring(0, 1);
                in.delete(0, 1);
            }
            int j = 0;
            while ((j < 33) && ((!englishLetters[j].toLowerCase().equals(temp)) && (!englishLetters[j].equals(temp)))) {
                j = j + 1;
            }
            if (j == 33)
                answer.append(temp);
            else if (temp.toLowerCase().equals(temp))
                answer.append(russianLetters[j].toLowerCase());
            else
                answer.append(russianLetters[j]);
        }
        return new String(answer);
    }
}
