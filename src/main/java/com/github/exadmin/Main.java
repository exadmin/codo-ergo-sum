package com.github.exadmin;

import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;
import org.jline.utils.NonBlockingReader;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Press any key to continue...");

        try (Terminal terminal = TerminalBuilder.terminal()) {
            terminal.enterRawMode();

            NonBlockingReader reader = terminal.reader();
            int key = reader.read();

            System.out.println("You've pressed: " + key);
            System.out.println("Terminating.");

        } catch (IOException e) {
            System.err.println("Error while key reading: " + e.getMessage());
        }
    }
}