package pl.workshops.intellij.debugger;

import java.util.stream.Stream;

public class StreamDebugger {

    public static void main(String[] args) {
        final var result = Stream.of(1, 2, 5)
                .filter(i -> i > 1)
                .map(i -> "i = " + i)
                .skip(1)
                .toList();
        System.out.println(result);
    }
}
