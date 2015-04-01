package com.toinouf.croissant.random;

import com.toinouf.croissant.Candidate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RandomChooser {

    private Random random = new Random();

    public RandomChooser() {
    }

    public RandomChooser(long seed) {
        this.random = new Random(seed);
    }

    public List<Candidate> shuffleList(List<Candidate> candidates) {
        ArrayList<Candidate> candidatesCopy = new ArrayList<>(candidates);
        Collections.shuffle(candidatesCopy, random);

        return candidatesCopy;
    }
}
