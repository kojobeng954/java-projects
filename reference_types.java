public class reference_types {
    public static void main(String[] args) {
        String word = "Hello, I am Ernest";
        System.out.println(word.length());
        System.out.println(word.toUpperCase());
        if (word.contains("am")) {
            System.out.println("True");
        } else {
            System.out.println("Cannot find word.");
        }
    }
}
