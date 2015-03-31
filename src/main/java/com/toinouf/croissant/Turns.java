package com.toinouf.croissant;

import java.util.ArrayList;
import java.util.List;

public class Turns {
    public Candidates history = new Candidates();
    private Candidate nextCandidate;

    public List<Candidate> history() {
        return history.candidates;
    }

    public Candidate next() {
        return nextCandidate;
    }

    public void addNext(Candidate candidate) {
        if (nextCandidate != null) {
            history.add(nextCandidate);
        }
        nextCandidate = candidate;
    }
}
