package be.intebrussel;

import java.util.List;

public class DuoApp {
    public static void main(String[] args) {

        Duo<Integer> duo = new Duo<Integer>(12, 13);
        System.out.println(duo.getFirst());
        System.out.println(duo.getSecond());
        duo.swap();
        System.out.println(duo.getFirst());
        System.out.println(duo.getSecond());
        Duo<String> duo1 = new Duo<>("Hello","Jorge");
        System.out.println(duo1.getFirst());
        System.out.println(duo1.getSecond());
        duo.swap();
        System.out.println(duo1.getFirst());
        System.out.println(duo1.getSecond());

    }
}
