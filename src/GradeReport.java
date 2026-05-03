public class GradeReport {


        public void printReport(Student student) {
            System.out.println("\n===== REPORT =====");
            System.out.println("School:" );
            System.out.println("Student: " + student.name);
            System.out.println("Grade: " + student.CalculateGrade());

            student.showRules();
        }
}

