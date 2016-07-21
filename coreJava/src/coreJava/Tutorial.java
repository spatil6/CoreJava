package coreJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class Tutorial {

	public static void main(String[] args) {
		
		HashSet<Employee> _eSet = new HashSet<Employee>();
		
		
 HashMap<Employee, Integer> k = new HashMap<Employee, Integer>();
 
 Employee objEmployee = new Employee();
 objEmployee.setEmployeeId(5);
 objEmployee.setEmployeeName("sandip");
 
 Employee objEmployee1 = new Employee();
 objEmployee1.setEmployeeId(15);
 objEmployee1.setEmployeeName("Aamit");
 
 Employee objEmployee2 = new Employee();
 objEmployee2.setEmployeeId(15);
 objEmployee2.setEmployeeName("saodip");
 
 
 k.put(objEmployee, 3);
 k.put(objEmployee1, 3);
 
 _eSet.add(objEmployee);
 _eSet.add(objEmployee1);
 _eSet.add(objEmployee2);
 
 List<Employee> _lst = new ArrayList<Employee>(_eSet);
 Collections.sort(_lst,new CustomComparator());
 
 Collections.sort(_lst,new Comparator<Employee>() {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getEmployeeName().compareTo(o2.getEmployeeName());
	}
	 
 });
 
 
for (Employee employee : _eSet) {
	System.out.println(employee.getEmployeeName());
}
 
 for(Employee er : _lst)
 {
	 System.out.println(er.getEmployeeName());
 }
 
 
 
 Set<Entry<Employee, Integer>> o = k.entrySet();
 
Iterator<Entry<Employee, Integer>>  i = o.iterator();
while(i.hasNext()) {
    Entry<Employee, Integer> me = i.next();
    
    Employee e = (Employee)me.getKey();
    System.out.print(e.getEmployeeId() +":"+ e.getEmployeeName() + ": ");
    System.out.println(me.getValue());
 }
	}

}


