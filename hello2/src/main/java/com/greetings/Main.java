package com.greetings;

import com.hidden.HiddenBaseClass;
import com.shared.StringSupplier;

public class Main extends HiddenBaseClass implements StringSupplier {
    @Override
    public String get() {
        return "Greetings from version TWO!";
    }

    /**
     * The main function is provided here only for testing this module in isolation.
     */
    public static void main(String[] args) {
        System.out.println(new Main().get());
    }
}
