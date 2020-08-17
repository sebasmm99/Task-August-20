package task20aug;

public class Program {

	public static void main(String[] args) {
				
		Student e1 = new Student();
		e1.name = "Pepito";
		e1.payment = 2000;
		
		Student e2 = new Student();
		e2.name = "Carlitos";
		e2.payment = 500;
		
		Student e3 = new Student();
		e3.name = "Miguelito";
		e3.payment = 700;
		
		Student e4 = new Student();
		e4.name = "Natalia";
		e4.payment = 3500;
		
		Student e5 = new Student();
		e5.name = "Jose";
		e5.payment = 2000;
		
		Calculations c = new Calculations();
		c.addStudent(e1);
		c.addStudent(e2);
		c.addStudent(e3);
		c.addStudent(e4);
		c.addStudent(e5);
		
		
		System.out.println("La difencia entre el mayor pago (" + c.getHigherPayment() + ") y el promedio de pagos (" + c.getAverage() + ") es de " + c.getDiffAvg());

	}
	
}
