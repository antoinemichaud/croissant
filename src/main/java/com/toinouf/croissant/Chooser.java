package com.toinouf.croissant;

import com.google.common.collect.Iterables;

import java.util.Iterator;

public class Chooser {
    private final Turns turns;
    private final Candidates candidates;
    private final Iterator<Candidate> currentCandidate;

    public Chooser(Turns turns, Candidates candidates) {
        this.turns = turns;
        this.candidates = candidates;
        currentCandidate = Iterables.cycle(candidates.candidates).iterator();
    }

    public void electNew() {
        if (candidates.candidates.size() > 0) {
            turns.addNext(currentCandidate.next());
        }
    }
}
