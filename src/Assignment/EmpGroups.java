package Assignment;

public class EmpGroups extends Employee {

	public static void main(String[] args) {
		int i;
		EmpGroups info = new EmpGroups();
		for (i = 0; i < info.Empnames.length; i++) {
			System.out.println(" EmployeeID :" + info.id[i] + "  Employee Name: " + info.Empnames[i]);

		}
	}

}
