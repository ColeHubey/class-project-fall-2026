package edu.hanover.sdp2026;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class GreetingServiceTest {

    @Mock
    private GreetingRepository repository;

    @InjectMocks
    private GreetingService service;

    @Test
    @DisplayName("uses the repository to look up the greeting")
    void delegatesToTheRepository() {
        when(repository.findGreetingFor("Ada")).thenReturn("Hello, Ada!");

        assertEquals("Hello, Ada!", service.greet("Ada"));
    }
}