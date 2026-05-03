import java.util.Scanner;

public class TakeGrade {
        Scanner scanner = new Scanner(System.in);

        public Student getStudent() {
            System.out.print("Enter name: ");
            String name = scanner.next();

            System.out.print("Enter mark: ");
            double mark = scanner.nextDouble();

            System.out.print("Type (1 = Regular, 2 = Extension): ");
            int type = scanner.nextInt();

            if (type == 2) {
                return new ExtensionStudent(name, mark);
            } else {
                return new RegularStudent(name, mark);
            }
        }

}
