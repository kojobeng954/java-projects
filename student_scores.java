import java.util.Arrays;

public class student_scores {
    public static void main(String[] args) {
        int[] students = { 34, 76, 90, 45, 66 };
        int total = students[0] + students[1] + students[2] + students[3] + students[4];
        Arrays.sort(students);
        System.out.println("Average Score: " + total / students.length);
        System.out.println("Lowest: " + students[0]);
        System.out.println("Highest: " + students[4]);
    }
}
