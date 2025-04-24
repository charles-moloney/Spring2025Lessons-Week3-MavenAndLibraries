package com.charlesmoloney.lombok;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        User user = new User("moloneyminecraft@gmail.com", "Charles Moloney");
        System.out.println(user.getEmail() + ": " + user.getName());
    }
}
