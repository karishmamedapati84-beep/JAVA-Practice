    import java.util.Scanner;
    class ERPSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "Not Added";
        String branch = "Not Set";
        int attendance = 0;
        int choice = -1;
        while (choice != 0) {
            System.out.println("1. Admin");
            System.out.println("2. Student");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("1. Add Student");
                System.out.println("2. Change Branch");
                System.out.println("3. Attendance");
                System.out.println("4. Exit");
                System.out.print("Enter choice: ");
                int a = sc.nextInt();
                if (a == 1) {
                    sc.nextLine();
                    System.out.print("Enter Student Name: ");
                    name = sc.nextLine();
                    System.out.println("Student Name Saved.");
                }
                else if (a == 2) {
                    sc.nextLine();
                    System.out.print("Enter Branch: ");
                    branch = sc.nextLine();
                    System.out.println("Branch Saved.");
                }
                else if (a == 3) {
                    System.out.print("Enter Attendance (%): ");
                    attendance = sc.nextInt();
                    System.out.println("Attendance Saved.");
                }
                else {
                    System.out.println("Wrong Option.");
                }
            }
            else if (choice == 2) {
                System.out.println("Name       : " + name);
                System.out.println("Branch     : " + branch);
                System.out.println("Attendance : " + attendance + "%");
            }
             else if (choice == 0) {
                System.out.println("Program Ended.");
            }
            else {
                System.out.println("Invalid Choice.");
            }
        }
    }
}