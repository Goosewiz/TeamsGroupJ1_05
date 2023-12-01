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
        List<Integer> list = new ArrayList<Integer>();
        forSearch = forSearch.toLowerCase();
        String infoToLower = this.info.toString().toLowerCase();
        int overlap = infoToLower.indexOf(forSearch);
        while (overlap != -1) {
            list.add(overlap);
            overlap = infoToLower.indexOf(forSearch, overlap + 1);
        }
        Integer[] answer = list.toArray(new Integer[0]);
        return answer;
    }

    public int replace(String forSearch, String forReplace) {
        Integer[] getPositions = find(forSearch);
        int answer = getPositions.length;
        for (int i = 0; i < getPositions.length; i++) {
            this.info.replace(getPositions[i], getPositions[i] + forSearch.length(), forReplace);
        }
        return answer;
    }

    public Integer[] find(String forSearch, boolean withCase) {
        if (withCase) {
            List<Integer> list = new ArrayList<Integer>();
            int overlap = this.info.indexOf(forSearch);
            while (overlap != -1) {
                list.add(overlap);
                overlap = this.info.indexOf(forSearch, overlap + 1);
            }
            Integer[] answer = list.toArray(new Integer[0]);
            return answer;
        } else {
            Integer[] answer = find(forSearch);
            return answer;
        }
    }

    public int replace(String forSearch, String forReplace, boolean withCase) {
        if (withCase) {
            Integer[] getPositions = find(forSearch, withCase);
            int answer = getPositions.length;
            for (int i = 0; i < getPositions.length; i++) {
                this.info.replace(getPositions[i], getPositions[i] + forSearch.length(), forReplace);
            }
            return answer;
        } else {
            int answer = replace(forSearch, forReplace);
            return answer;
        }
    }
}
