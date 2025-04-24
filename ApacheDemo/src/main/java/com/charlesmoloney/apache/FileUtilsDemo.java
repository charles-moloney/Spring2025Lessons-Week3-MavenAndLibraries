package com.charlesmoloney.apache;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileUtilsDemo {
    public static void run() throws IOException {
        // create temp directory
        File dir = new File("tempDir");
        FileUtils.forceMkdir(dir);
        File file = new File(dir, "demo.txt");

        // write string to file
        FileUtils.writeStringToFile(file, "Apache Commons FileUtils demo", StandardCharsets.UTF_8);
        System.out.println("File written at: " + file.getAbsolutePath());

        // read back
        String content = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
        System.out.println("Read from file: " + content);

        // clean directory
        FileUtils.deleteDirectory(dir);
        System.out.println("Cleaned up tempDir");
    }
}