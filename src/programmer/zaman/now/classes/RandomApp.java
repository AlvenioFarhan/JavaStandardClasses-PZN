package programmer.zaman.now.classes;

import java.util.Random;

public class RandomApp {
    public static void main(String[] args) {

        Random random = new Random();

        for (int index = 0; index < 1000; index++) {
            int value = random.nextInt(1000);
            System.out.println(value);
        }

    }
}
