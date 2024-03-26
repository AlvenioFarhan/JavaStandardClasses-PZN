package programmer.zaman.now.classes;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {

        String value = "Alvenio Farhan Prayogo";

        StringTokenizer stringTokenizer = new StringTokenizer(value, " ");

        while (stringTokenizer.hasMoreTokens()){
            String result = stringTokenizer.nextToken();
            System.out.println(result);
        }

    }
}
