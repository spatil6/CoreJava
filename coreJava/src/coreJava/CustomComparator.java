package coreJava;

import java.util.Comparator;

public class CustomComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getEmployeeName().compareToIgnoreCase(o2.getEmployeeName());
	}

}
