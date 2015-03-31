package com.toinouf.croissant;

import java.util.ArrayList;
import java.util.List;

public class Turns {
    public Candidates history;
    private Candidate nextCandidate;

    public List<String> history() {
        return new ArrayList<>();
    }

    public Candidate next() {
        return nextCandidate;
    }

    public void addNext(Candidate candidate) {
        nextCandidate = candidate;
    }
}
