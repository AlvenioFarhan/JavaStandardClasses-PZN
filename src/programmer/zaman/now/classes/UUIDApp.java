package programmer.zaman.now.classes;

import java.util.UUID;

public class UUIDApp {
    public static void main(String[] args) {

        for (int index = 0; index < 100; index++) {
            UUID uuid = UUID.randomUUID();
            String key = uuid.toString();
            System.out.println(key);
        }

    }
}
