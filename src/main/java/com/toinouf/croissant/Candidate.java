package com.toinouf.croissant;

public class Candidate {
    public final String emailAddress;

    public Candidate(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
