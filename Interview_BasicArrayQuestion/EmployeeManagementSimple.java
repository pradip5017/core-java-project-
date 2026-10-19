package Interview_BasicArrayQuestion;

import java.util.*;

class Employee {
    int id;
    String name;
    double salary;
}

public class EmployeeManagementSimple {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> list = new ArrayList<>();

        while(true) {

            System.out.println("\n1. Add Employee");
            System.out.println("2. Search Employee");
            System.out.println("3. Display All Employees");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            if(choice == 1) {
                Employee e = new Employee();
                System.out.print("Enter ID: ");
                e.id = sc.nextInt();
                System.out.print("Enter Name: ");
                e.name = sc.next();
                System.out.print("Enter Salary: ");
                e.salary = sc.nextDouble();

                list.add(e);
                System.out.println("Employee Added!");
            }

            else if(choice == 2) {
                System.out.print("Enter Employee ID to Search: ");
                int id = sc.nextInt();
                boolean found = false;

                for(Employee e : list) {
                    if(e.id == id) {
                        System.out.println("Employee Found: " + e.id + " " + e.name + " " + e.salary);
                        found = true;
                        break;
                    }
                }

                if(!found) {
                    System.out.println("Employee Not Found!");
                }
            }

            else if(choice == 3) {
                System.out.println("---- Employee List ----");
                for(Employee e : list) {
                    System.out.println(e.id + " " + e.name + " " + e.salary);
                }
            }

            else if(choice == 4) {
                System.out.println("Thank You!");
                break;
            }

            else {
                System.out.println("Invalid Choice!");
            }
        }
    }
}

