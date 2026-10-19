package Interview_BasicArrayQuestion;
import java.util.*;
class Employees
{
	int id;
	String name;
	double salary;
	
	Employees(int id, String name, double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public void display() {
		
		System.out.println(id+" " +name+" "+salary);
		
	}
}
public class EmployeeManagementSimplePractice {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        ArrayList<Employees> list = new ArrayList<>();
	        int choice;

	        do {
	            System.out.println("\n------ Employee Management System ------");
	            System.out.println("1. Add Employee");
	            System.out.println("2. Search Employee");
	            System.out.println("3. Display All Employees");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch(choice) {

	                case 1:  // Add Employee
	                    System.out.print("Enter Employee ID: ");
	                    int id = sc.nextInt();
	                    System.out.print("Enter Employee Name: ");
	                    String name = sc.next();
	                    System.out.print("Enter Employee Salary: ");
	                    double salary = sc.nextDouble();

	                    list.add(new Employees(id, name, salary));
	                    System.out.println("Employee Added Successfully!");
	                    break;

	                case 2:  // Search Employee
	                    System.out.print("Enter Employee ID to Search: ");
	                    int searchId = sc.nextInt();
	                    boolean found = false;

	                    for(Employees e : list) {
	                        if(e.id == searchId) {
	                            System.out.println("Employee Found:");
	                            e.display();
	                            found = true;
	                            break;
	                        }      
	                    }

	                    if(!found) {
	                        System.out.println("Employee Not Found!");
	                    }
	                    break;

	                case 3:  // Display All Employees
	                    System.out.println("------ Employee List ------");
	                    for(Employees e : list) {
	                        e.display();
	                    }
	                    break;

	                case 4:
	                    System.out.println("Exiting... Thank You!");
	                    break;

	                default:
	                    System.out.println("Invalid Choice! Please Try Again.");
	            }

	        } while(choice != 4);
	    }
	}
