package edu.hanover.sdp2026;

/**
 * Entry point and home of the course project's earliest utilities.
 */
public final class App {

    private App() {
    }

    /**
     * Returns a friendly greeting addressed to {@code name}.
     *
     * @param name the person to greet
     * @return the greeting
     */
    public static String greeting(String name) {
        return "Hello, " + name + "!";
    }

    public static void main(String[] args) {
        System.out.println(greeting("class"));
    }
}