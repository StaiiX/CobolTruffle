package com.github.lopoha.coboltruffle.parser;

// todo: position
// todo: base parser exception
public class CobolVariableSizeMismatch extends RuntimeException {
    public CobolVariableSizeMismatch(String variableName, int expectedSize, int childrenSize) {
        super(String.format("The variable %s was expected to have a size of %d, but it's childrend had a size of %d", variableName, expectedSize, childrenSize));
    }
}