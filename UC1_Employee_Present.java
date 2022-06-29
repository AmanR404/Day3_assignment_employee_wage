public class UC1_Employee_Present {
public static void main(String[] args) {
	
	int Employee_present=1;
	double employeeCheck=(int) (Math.random() * 10)%2;
	
	if (employeeCheck==Employee_present){
		System.out.println("Employee is 'PRESENT'");
	}
	else {
		System.out.println("Employee is 'ABSENT'");
	}

}

}
