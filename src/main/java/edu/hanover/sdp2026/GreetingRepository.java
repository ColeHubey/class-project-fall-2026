package edu.hanover.sdp2026;

/**
 * Source of greetings, decoupled so services can be tested with a mock.
 */
public interface GreetingRepository {

    /**
     * Returns the greeting to use for {@code name}.
     *
     * @param name the recipient of the greeting
     * @return the greeting
     */
    String findGreetingFor(String name);
}