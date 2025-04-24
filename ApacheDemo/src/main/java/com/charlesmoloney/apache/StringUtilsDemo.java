package com.charlesmoloney.apache;

import org.apache.commons.lang3.StringUtils;

public class StringUtilsDemo {
    public static void run() {
        String input = "  Apache Commons Lang  ";
        System.out.println("Original: '" + input + "'");
        // trim and normalize whitespace
        String normalized = StringUtils.normalizeSpace(input);
        System.out.println("Normalized: '" + normalized + "'");

        // capitalize and abbreviate
        String cap = StringUtils.capitalize(normalized.toLowerCase());
        System.out.println("Capitalized: " + cap);
        System.out.println("Abbreviated to 10 chars: " + StringUtils.abbreviate(cap, 10));

        // join arrays
        String[] parts = {"One", "Two", "Three"};
        System.out.println("Joined: " + StringUtils.join(parts, ", "));
    }
}
