package task20aug;

public class Calculations {
	
	int MAXIMUM_CAPACITY = 15;
	int quantity = 0;
	Student[] arrStudent = new Student[MAXIMUM_CAPACITY];

	public void addStudent(Student s) {
		if(quantity > MAXIMUM_CAPACITY - 1) {
			System.out.println("ERROR: Excedió la capacidad máxima de estudiantes permitidos.");
		}
		else {
			arrStudent[quantity] = s;
			quantity++;
		}
	}
	
	float getDiffAvg() {
		float diff = 0;
		float higherPayment = getHigherPayment();
		float average = getAverage();
		diff = higherPayment - average;
		return diff;
		
	}
	
	float getHigherPayment() {
		float payment = 0;
		for(int i=0; i<quantity; i++) {
			if(arrStudent[i].payment > payment) {
				payment = arrStudent[i].payment;
			}
		}
		return payment;
	}
	
	float getAverage() {
		float average = 0;
		average = totalPayment() / quantity;
		return average;
	}
	
	float totalPayment() {
		float total = 0;
		for(int i=0; i<quantity; i++) {
			total = total + arrStudent[i].payment;
		}
		return total;
	}

}
