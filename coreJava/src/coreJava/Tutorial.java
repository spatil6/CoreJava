package coreJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Tutorial {

	public static void main(String[] args) {
		
 HashMap<Employee, Integer> k = new HashMap<Employee, Integer>();
 
 Employee objEmployee = new Employee();
 objEmployee.setEmployeeId(5);
 objEmployee.setEmployeeName("sandip");
 
 Employee objEmployee1 = new Employee();
 objEmployee1.setEmployeeId(5);
 objEmployee1.setEmployeeName("sandip");
 
 k.put(objEmployee, 3);
 k.put(objEmployee1, 3);
 
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


