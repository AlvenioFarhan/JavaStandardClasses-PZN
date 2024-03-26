package programmer.zaman.now.classes;

public class StringBuilderApp {
    public static void main(String[] args) {

        //Tidak disarankan
//        String name = "Alvenio";
//        name = name + " " + "Farhan";
//        name = name + " " + "Prayogo";
//
//        System.out.println(name);
        //Alvenio
        //Farhan
        //Prayogo

        //=========================================
        //Menggunakan String Builder

        StringBuilder builder = new StringBuilder();
        builder.append("Alvenio");
        builder.append(" ");
        builder.append("Farhan");
        builder.append(" ");
        builder.append("Prayogo");

        String name = builder.toString();

        System.out.println(name);

    }
}
