import java.util.Scanner; 

public class Main { 
        public static void main(String[] args) { 
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("===================== Welcome ======================");
        System.out.print("Please enter your Student Name: ");
        String userName = scanner.next();
        
        System.out.print("Enter student mark: ");
        
        
        double mark = scanner.nextDouble(); 

        if (mark >= 90) { 
            System.out.println(userName + "'s Grade is: A");
        } else if (mark >= 80) {
            System.out.println(userName + "'s Grade is: B");
        } else if (mark >= 70) {
            System.out.println(userName + "'s Grade is: C");
        } else if (mark >= 60) {
            System.out.println(userName + "'s Grade is: D");
        } else {
            System.out.println(userName + "'s Grade is: F");
        }
    }
}