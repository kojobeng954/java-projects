public class reference_vs_primitive {
    public static void main(String[] args) {
        int number = 200;
        int num = number;
        number = 250;
        System.out.println(number);
        System.out.println(num);
    }
}
