package gusev.java23.j1_05.task3;

public class Transliteration {
    private static String[] russianLetters = new String[]{"А", "Б", "В", "Г", "Д", "Е", "Ё", "Ж", "З", "И", "Й", "К", "Л", "М", "Н",
            "О", "П", "Р", "С", "Т", "У", "Ф", "Х", "Ц", "Ч", "Ш", "Щ", "Ъ", "Ы", "Ь", "Э", "Ю", "Я"};
    private static String[] englishLetters = new String[]{"A", "B", "V", "G", "D", "E", "Yo", "Zh", "Z", "I", "J", "K", "L", "M", "N", "O", "P", "R",
            "S", "T", "U", "F", "H", "C", "Ch", "Sh", "Shch", "\"", "Y", "'", "E", "Yu", "Ya"};

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
            String temp = in.substring(0, 1);
            in.delete(0, 1);
            if (temp.equals("Y") || temp.equals("y")) {
                String next = in.substring(0, 1);
                if (next.equals("o") || next.equals("u") || next.equals("a")) {
                    temp = temp + next;
                    in.delete(0, 1);
                }
            } else if (temp.equals("Z") || temp.equals("z")) {
                String next = in.substring(0, 1);
                if (next.equals("h")) {
                    temp = temp + next;
                    in.delete(0, 1);
                }
            } else if (temp.equals("C") || temp.equals("c")) {
                String next = in.substring(0, 1);
                if (next.equals("h")) {
                    temp = temp + next;
                    in.delete(0, 1);
                }
            } else if (temp.equals("S") || temp.equals("s")) {
                String next = in.substring(0, 1);
                if (next.equals("h")) {
                    temp = temp + next;
                    in.delete(0, 1);
                    String nextTwo = in.substring(0,2);
                    if (nextTwo.equals("ch")){
                        temp = temp + nextTwo;
                        in.delete(0, 2);
                    }
                }
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
