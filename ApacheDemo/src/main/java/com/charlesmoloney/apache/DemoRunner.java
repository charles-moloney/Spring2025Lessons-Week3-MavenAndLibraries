package com.charlesmoloney.apache;

public class DemoRunner {
    public static void main(String[] args) throws Exception {
        System.out.println("=== StringUtils Demo ===");
        StringUtilsDemo.run();

        System.out.println("\n=== IOUtils Demo ===");
        IOUtilsDemo.run();

        System.out.println("\n=== FileUtils Demo ===");
        FileUtilsDemo.run();

        System.out.println("\n=== CollectionUtils Demo ===");
        CollectionUtilsDemo.run();

    }
}
