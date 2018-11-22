package step01.ex;

class Employee {
	public static void main (String [] args) {
		int sal = 5000;
		Employee e = new Employee();
		int s = e.comm(sal);
		
		System.out.println(sal + s);
	}
	
	int comm (int promotion) {
		promotion = promotion * 2;
		return promotion;
	}
}