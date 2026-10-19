package Class_and_object;


class Employee31
{
	int id;
	String name;
	String address;
	double marks;
	

	Employee31(int id, String name, String address, double marks)
	{
		this.id=id;
		this.name=name;
		this.address=address;
		this.marks=marks;
	}
	
	void getData()
	{
		System.out.println("Employee Id ="+id);
		System.out.println("Employee Id ="+name);
		System.out.println("Employee Id ="+address);
		System.out.println("Employee Id ="+marks);
		
	}

}
public class Constructor1_practice {

	public static void main(String[] args) {
		
		Employee31 s2 = new Employee31(11,"pradip","pune",89.5);
		s2.getData();
		
		System.out.println("\nSecound Employee name ..!!\n");
		Employee31 s3 = new Employee31(12,"Shivam","pune",98.9);
		s3.getData();
		
	}

}
