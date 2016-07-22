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
		
		
		 Employee objEmployee = new Employee();
		 objEmployee.setEmployeeId(5);
		 objEmployee.setEmployeeName("sandip");
		 
		 Employee objEmployee1 = new Employee();
		 objEmployee1.setEmployeeId(15);
		 objEmployee1.setEmployeeName("Aamit");
		 
		 Employee objEmployee2 = new Employee();
		 objEmployee2.setEmployeeId(15);
		 objEmployee2.setEmployeeName("saodip");
 
		// Create Hashset collection
		HashSet<Employee> _eSet = new HashSet<Employee>();
			
		 // Add in set collection
		 _eSet.add(objEmployee);
		 _eSet.add(objEmployee1);
		 _eSet.add(objEmployee2);
 
		 //Convert Set to List
		 List<Employee> _lst = new ArrayList<Employee>(_eSet);
		 // Sort by employyee name with custom compare class
		 Collections.sort(_lst,new CustomComparator());
		 //Sort by employee name with annonymous function
		 Collections.sort(_lst,new Comparator<Employee>() {
			 			@Override
		 				public int compare(Employee o1, Employee o2) {
			 				return o1.getEmployeeName().compareTo(o2.getEmployeeName());
			 				}
		 				});
 
		 //Print list and set
		 for (Employee employee : _eSet) {
			System.out.println(employee.getEmployeeName());
		 }
		 
		 for(Employee er : _lst)
		 {
			 System.out.println(er.getEmployeeName());
		 }
 
		// Create HashMap collection
		HashMap<Employee, Integer> _eMap = new HashMap<Employee, Integer>();
			
		// Add in Hashmap collection
		_eMap.put(objEmployee, 3);
		_eMap.put(objEmployee1, 3);
		
        // Convert Hashmap to set for Iteration
		 Set<Entry<Employee, Integer>> o = _eMap.entrySet();
		 Iterator<Entry<Employee, Integer>>  i = o.iterator();
		 
		 //Print HashMap Data
			while(i.hasNext()) {
			    Entry<Employee, Integer> me = i.next();
			    
			    Employee e = (Employee)me.getKey();
			    System.out.print(e.getEmployeeId() +":"+ e.getEmployeeName() + ": ");
			    System.out.println(me.getValue());
			 }
			
		// Thread
			 
			EmployeeService objEmployeeService = new EmployeeService(0);
			EmployeeService objEmployeeService1 = new EmployeeService(1);
			EmployeeService objEmployeeService2 = new EmployeeService(2);
			 
			Thread _th = new Thread(objEmployeeService);
			Thread _th1 = new Thread(objEmployeeService1);
			Thread _th2 = new Thread(objEmployeeService2);
			 System.out.println("FT");
			_th.start();
			try {
				_th.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 System.out.println("ST");
			_th1.start();
			 System.out.println("TT");
			_th2.start();
			 
			
			
	}

}


