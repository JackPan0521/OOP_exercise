package Interfave.Q19;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Product> list = Arrays.asList(
            new Product("Keyboard", 1000),
            new Product("Mouse", 600),
            new Product("Monitor", 1000)
        );

        Collections.sort(list);
        list.forEach(System.out::println);
    }
}