package com.charlesmoloney.apache;

import org.apache.commons.io.IOUtils;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class IOUtilsDemo {
    public static void run() throws IOException {
        String text = "Hello, Apache Commons IO!";
        // convert string to InputStream
        try (InputStream in = new ByteArrayInputStream(text.getBytes(StandardCharsets.UTF_8))) {
            String output = IOUtils.toString(in, StandardCharsets.UTF_8);
            System.out.println("Read from InputStream: " + output);
        }

        // copy streams
        try (InputStream in = new ByteArrayInputStream(text.getBytes());
             ByteArrayOutputStream out = new ByteArrayOutputStream()) {
            IOUtils.copy(in, out);
            System.out.println("Copied bytes count: " + out.size());
        }
    }
}
