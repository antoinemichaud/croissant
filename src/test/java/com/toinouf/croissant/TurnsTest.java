package com.toinouf.croissant;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class TurnsTest {

    @Test
    public void history_should_be_empty_at_start() throws Exception {
        // Given
        Turns turns = new Turns();

        // When / Then
        assertThat(turns.history()).isEmpty();
    }
}
