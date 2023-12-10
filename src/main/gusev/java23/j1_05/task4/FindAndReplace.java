package gusev.java23.j1_05.task4;

import java.util.ArrayList;
import java.util.List;

public class FindAndReplace {
    private StringBuilder info;

    FindAndReplace(String info) {
        StringBuilder temp = new StringBuilder(info);
        this.info = temp;
    }

    public String getInfo() {
        return this.info.toString();
    }

    public Integer[] find(String forSearch) {
        forSearch = forSearch.toLowerCase();
        String infoToLower = this.info.toString().toLowerCase();
        Integer[] answer = commonFindCode(forSearch, infoToLower);
        return answer;
    }

    public Integer[] find(String forSearch, boolean withCase) {
        if (withCase) {
            String whereSearch = new String(this.info);
            Integer[] answer = commonFindCode(forSearch, whereSearch);
            return answer;
        } else {
            Integer[] answer = find(forSearch);
            return answer;
        }
    }
    public Integer[] commonFindCode(String forSearch, String whereSearch){
        List<Integer> list = new ArrayList<Integer>();
        int overlap = whereSearch.indexOf(forSearch);
        while (overlap != -1) {
            list.add(overlap);
            overlap = whereSearch.indexOf(forSearch, overlap + 1);
        }
        Integer[] answer = list.toArray(new Integer[0]);
        return answer;
    }
    public int replace(String forSearch, String forReplace) {
        Integer[] getPositions = find(forSearch);
        int answer = commonReplaceCode(getPositions, forSearch, forReplace);
        return answer;
    }

    public int replace(String forSearch, String forReplace, boolean withCase) {
        if (withCase) {
            Integer[] getPositions = find(forSearch, withCase);
            int answer = commonReplaceCode(getPositions, forSearch, forReplace);
            return answer;
        } else {
            int answer = replace(forSearch, forReplace);
            return answer;
        }
    }
    public int commonReplaceCode(Integer[] getPositions, String forSearch, String forReplace){
        int answer = getPositions.length;
        for (int i = 0; i < getPositions.length; i++) {
            this.info.replace(getPositions[i], getPositions[i] + forSearch.length(), forReplace);
        }
        return answer;
    }
}
