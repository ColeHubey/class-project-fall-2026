package edu.hanover.sdp2026;

/**
 * Combines a repository lookup with a ready-to-print result.
 */
public final class GreetingService {

    private final GreetingRepository repository;

    public GreetingService(GreetingRepository repository) {
        this.repository = repository;
    }

    public String greet(String name) {
        return repository.findGreetingFor(name);
    }
}