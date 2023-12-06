package gusev.java23.j1_05.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckStringTest {

    @Test
    void checkStr() {
        String input = "user.name@example.com";
        String answer = CheckString.checkStr(input);
        assertEquals("email", answer, "email");
        input = "@example.com";
        answer = CheckString.checkStr(input);
        assertEquals("none", answer, "none");
        input = "user.name.example.com";
        answer = CheckString.checkStr(input);
        assertEquals("username", answer, "username");
        input = "user.name@example";
        answer = CheckString.checkStr(input);
        assertEquals("none", answer, "none");
        input = "user_name1@some.example.com";
        answer = CheckString.checkStr(input);
        assertEquals("email", answer, "email");
        input = "+7-(123)-456-78-90";
        answer = CheckString.checkStr(input);
        assertEquals("телефон", answer, "телефон");
        input = "+7(123)456-78-90";
        answer = CheckString.checkStr(input);
        assertEquals("телефон", answer, "телефон");
        input = "+7-123-456-78-90";
        answer = CheckString.checkStr(input);
        assertEquals("телефон", answer, "телефон");
        input = "     +71234567890";
        answer = CheckString.checkStr(input);
        assertEquals("телефон", answer, "телефон");
        input = "71234567890";
        answer = CheckString.checkStr(input);
        assertEquals("none", answer, "none");
        input = "1234567890";
        answer = CheckString.checkStr(input);
        assertEquals("ИНН", answer, "ИНН");
        input = "7777-8888-9999";
        answer = CheckString.checkStr(input);
        assertEquals("none", answer, "none");
        input = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz.$1234_";
        answer = CheckString.checkStr(input);
        assertEquals("username", answer, "username");
        input = "       aaaa1111";
        answer = CheckString.checkStr(input);
        assertEquals("username", answer, "username");
        input = "a";
        answer = CheckString.checkStr(input);
        assertEquals("none", answer, "none");
        input = "qwerty 456";
        answer = CheckString.checkStr(input);
        assertEquals("none", answer, "none");
        input = "4abc";
        answer = CheckString.checkStr(input);
        assertEquals("none", answer, "none");
        input = "$asdfghjk";
        answer = CheckString.checkStr(input);
        assertEquals("none", answer, "none");
        input = "   ";
        answer = CheckString.checkStr(input);
        assertEquals("none", answer, "none");
    }
}