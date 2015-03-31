package com.toinouf.croissant;

import org.junit.Ignore;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class TurnsTest {

    @Test
    public void history_should_be_empty_at_start_and_next_null() throws Exception {
        // Given
        Turns turns = new Turns();

        // When / Then
        assertThat(turns.history()).isEmpty();
        assertThat(turns.next()).isNull();
    }

    @Test
    public void should_add_user_to_next_and_leave_history_empty() throws Exception {
        // Given
        Candidate candidate = new Candidate("bla@bla.com");

        Turns turns = new Turns();
        turns.addNext(candidate);

        // When / Then
        assertThat(turns.history()).isEmpty();
        assertThat(turns.next()).isEqualTo(candidate);
    }

    @Test
    public void should_amend_next_user_and_add_him_to_history_when_next_is_not_null() throws Exception {
        // Given
        Candidate firstCandidate = new Candidate("first@bla.com");
        Candidate secondCandidate = new Candidate("second@bla.com");

        Turns turns = new Turns();
        turns.addNext(firstCandidate);
        turns.addNext(secondCandidate);

        // When / Then
        assertThat(turns.history()).containsOnly(firstCandidate);
        assertThat(turns.next()).isEqualTo(secondCandidate);
    }
}
