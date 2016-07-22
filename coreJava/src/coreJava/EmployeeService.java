package coreJava;

public class EmployeeService implements Runnable {

	private int _number;
	public  EmployeeService(int a) {
		this._number =a;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println(_number);

	}

}
