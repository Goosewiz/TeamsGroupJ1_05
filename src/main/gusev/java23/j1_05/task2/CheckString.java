package gusev.java23.j1_05.task2;

public class CheckString {
    public static String checkStr(String startString) {
        if (startString.matches("\\s*.+@.+(.com)|(.ru)\\s*"))
            return "email";
        if (startString.matches("\\s*\\+7-?\\(?\\d\\d\\d\\)?-?\\d\\d\\d-?\\d\\d-?\\d\\d\\s*"))
            return "телефон";
        if (startString.matches("\\s*(\\d{10})|(\\d{12})\\s*"))
            return "ИНН";
        if (startString.matches("\\s*[a-zA-Z][a-zA-Z1-90_$.]{0,7}[a-zA-Z1-90_$.]+\\s*"))
            return "username";
        return "none";
    }
}
