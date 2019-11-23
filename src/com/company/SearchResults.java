package com.company;

import java.util.ArrayList;

public class SearchResults {

    boolean found;
    int countOfMatches;
    ArrayList<Match> matches;

    public boolean isFound() {
        return found;
    }

    public void setFound(boolean found) {
        this.found = found;
    }



    public int getCountOfMatches() {
        return countOfMatches;
    }

    public void setCountOfMatches(int countOfMatches) {
        this.countOfMatches = countOfMatches;
    }
}
