package programmer.zaman.now.classes;

public class NumberApp {
    public static void main(String[] args) {

        Integer intValue = 10;

        Long longValue = intValue.longValue();
        Double doubleValue = intValue.doubleValue();
        Short shortValue = doubleValue.shortValue();

        String contoh = "10000";
        String contoh2 = "100.10";

        Integer contohInt = Integer.valueOf(contoh);
        System.out.println(contohInt);

        Double contohDouble = Double.valueOf(contoh2);
        System.out.println(contohDouble);
    }
}
