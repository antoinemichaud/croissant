package com.toinouf.croissant;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class CandidatesTest {

    @Test
    public void should_add_candidate() throws Exception {
        // Given
        Candidates candidates = new Candidates();
        Candidate candidate = new Candidate("bla@bla.com");

        // When
        candidates.add(candidate);

        // Then
        assertThat(candidates.candidates).containsOnly(candidate);
    }
}