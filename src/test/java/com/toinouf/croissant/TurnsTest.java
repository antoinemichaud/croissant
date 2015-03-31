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
}
