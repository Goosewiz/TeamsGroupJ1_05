package gusev.java23.j1_05.task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindAndReplaceTest {

    @Test
    void find() {
        FindAndReplace fr = new FindAndReplace("openn");
        String search = "l";
        Integer[] answer = fr.find(search);
        assertEquals(0, answer.length, "find");
        search = "op";
        answer = fr.find(search);
        assertEquals(0, answer[0], "find");
        search = "n";
        answer = fr.find(search);
        assertEquals(2, answer.length, "find");
        assertEquals(3, answer[0], "find");
        assertEquals(4, answer[1], "find");
        fr = new FindAndReplace("");
        search = "op";
        answer = fr.find(search);
        assertEquals(0, answer.length, "find");
        fr = new FindAndReplace("openOPENoPeN");
        search = "OPEN";
        answer = fr.find(search, true);
        assertEquals(4, answer[0], "find");
        answer = fr.find(search, false);
        assertEquals(3, answer.length, "find");
        assertEquals(0, answer[0], "find");
        assertEquals(4, answer[1], "find");
        assertEquals(8, answer[2], "find");
    }
    @Test
    void replace() {
        FindAndReplace fr = new FindAndReplace("openn");
        String search = "nn";
        String replace = "n";
        int answerI = fr.replace(search,replace);
        assertEquals(1, answerI, "replace");
        assertEquals("open", fr.getInfo(), "replace");
        search = "o";
        replace = "o";
        answerI = fr.replace(search,replace);
        assertEquals(1, answerI, "replace");
        assertEquals("open", fr.getInfo(), "replace");
        search = "open";
        replace = "";
        answerI = fr.replace(search,replace);
        assertEquals(1, answerI, "replace");
        assertEquals("", fr.getInfo(), "replace");
        search = "open";
        replace = "open";
        answerI = fr.replace(search,replace);
        assertEquals(0, answerI, "replace");
        assertEquals("", fr.getInfo(), "replace");
        fr = new FindAndReplace("openOPENoPeN");
        search = "OPEN";
        replace = "open";
        answerI = fr.replace(search,replace, true);
        assertEquals(1, answerI, "replace");
        assertEquals("openopenoPeN", fr.getInfo(), "replace");
        search = "OpEn";
        replace = "OPEN";
        answerI = fr.replace(search,replace, false);
        assertEquals(3, answerI, "replace");
        assertEquals("OPENOPENOPEN", fr.getInfo(), "replace");
    }
}