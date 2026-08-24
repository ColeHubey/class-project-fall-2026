package edu.hanover.sdp2026;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    @DisplayName("generates a greeting that includes the given name")
    void greetingIncludesTheName() {
        assertEquals("Hello, Ada!", App.greeting("Ada"));
    }
}