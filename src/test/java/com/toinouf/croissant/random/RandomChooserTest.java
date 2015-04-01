package com.toinouf.croissant.random;

import com.toinouf.croissant.Candidate;
import org.junit.Test;

import java.util.List;

import static com.google.common.collect.Lists.*;
import static org.assertj.core.api.Assertions.*;

public class RandomChooserTest {

    @Test
    public void should_shuffle_list() throws Exception {
        // Given
        RandomChooser randomChooser = new RandomChooser(0);

        // When
        Candidate firstCandidate = new Candidate("bla@bla.com");
        Candidate secondCandidate = new Candidate("bli@bli.com");
        Candidate thirdCandidate = new Candidate("blo@blo.com");
        Candidate fourthCandidate = new Candidate("blou@blou.com");
        List<Candidate> shuffledCandidates =
                randomChooser.shuffleList(newArrayList(firstCandidate,
                        secondCandidate, thirdCandidate, fourthCandidate));

        // Then
        assertThat(shuffledCandidates).containsExactly(fourthCandidate, firstCandidate, secondCandidate, thirdCandidate);
    }
}
