public class Main {
    public static void main(String[] args) {

        TakeGrade tg = new TakeGrade();
        Student student = tg.getStudent();

        GradeReport report = new GradeReport();
        report.printReport(student);
    }
}
