import java.util.Scanner;

public class IT24102235Lab4Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter exam marks (out of 100) : ");
        int ExamMarks = scanner.nextInt();
        if (ExamMarks > 100 || ExamMarks < 0) {
            System.out.println("Invalid input for exam marks. Terminating program.");
            return;
        }
        System.out.println("Please enter exam lab submission marks (out of 100) : ");
        int labMarks = scanner.nextInt();
        if (labMarks > 100 || labMarks < 0) {
            System.out.println("Invalid input for lab submission marks. Terminating program.");
            return;
        }
        System.out.println("Please enter the percentage given for the exam : ");
        int ExamPercent = scanner.nextInt();
        System.out.println("Please enter the percentage given for the lab submission : ");
        int LabPercent = scanner.nextInt();

        int Exam = ExamMarks * ExamPercent / 100;
        int Lab = labMarks * LabPercent / 100;

        if (LabPercent + ExamPercent != 100) {
            System.out.println("The Percentages must add up to 100. Terminating program.");
            return;
        }
        double Final = Exam + Lab;
            System.out.println("Final mark is : " +Final);
    }
}