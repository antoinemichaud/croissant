package com.toinouf.croissant;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

public class Candidates {
    public final List<Candidate> candidates;

    public Candidates(Candidate... candidates) {
        this.candidates = Lists.newArrayList(candidates);
    }
}
