package programmer.zaman.now.classes;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {

        StringJoiner joiner = new StringJoiner(", ","[","]");

        joiner.add("Alvenio");
        joiner.add("Farhan");
        joiner.add("Prayogo");

        String value = joiner.toString();

        System.out.println(value);

    }
}
