package com.toinouf.croissant;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class ChooserTest {

    @Test
    public void should_elect_none_when_no_candidates() throws Exception {
        // Given
        Turns turns = new Turns();
        Chooser chooser = new Chooser(turns, new Candidates());

        // When
        chooser.electNew();

        // Then
        assertThat(turns.history.candidates).isEmpty();
        assertThat(turns.next()).isNull();
    }

    @Test
    public void should_add_next_user_elected() throws Exception {
        // Given
        Turns turns = new Turns();
        Candidate candidate = new Candidate("bla@bla.com");
        Chooser chooser = new Chooser(turns, new Candidates(candidate));

        // When
        chooser.electNew();

        // Then
        assertThat(turns.history.candidates).isEmpty();
        assertThat(turns.next()).isEqualTo(candidate);
    }

    @Test
    public void should_add_next_users_in_order() throws Exception {
        // Given
        Turns turns = new Turns();
        Candidate firstCandidate = new Candidate("bla@bla.com");
        Candidate secondCandidate = new Candidate("bli@bli.com");
        Chooser chooser = new Chooser(turns, new Candidates(firstCandidate, secondCandidate));

        // When
        chooser.electNew();
        chooser.electNew();

        // Then
        assertThat(turns.history.candidates).containsOnly(firstCandidate);
        assertThat(turns.next()).isEqualTo(secondCandidate);
    }

    @Test
    public void should_cycle_selection() throws Exception {
        // Given
        Turns turns = new Turns();
        Candidate firstCandidate = new Candidate("bla@bla.com");
        Candidate secondCandidate = new Candidate("bli@bli.com");
        Chooser chooser = new Chooser(turns, new Candidates(firstCandidate, secondCandidate));

        // When
        chooser.electNew();
        chooser.electNew();
        chooser.electNew();

        // Then
        assertThat(turns.history.candidates).containsOnly(firstCandidate, secondCandidate);
        assertThat(turns.next()).isEqualTo(firstCandidate);
    }
}
