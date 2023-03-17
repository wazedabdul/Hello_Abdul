package getstarted;

public class varaibles {

	public static void main(String[] args) { //this is main method
		// TODO Auto-generated method stub

		//this is one line comment
		/*this is
		 * a multiple line
		  comment
		 */
		//System.out.print("Hello world"); //this is print statement
		
		
		//primative variable
		//instance variable
		
		//variable
		//numbers
		//whole number
		byte b = 12;  //1 byte
		short s = 234;  //2 bytes
		int x = 2; //4 bytes
		long L = 25411888888344L;  //8 bytes
		
		
		//fractions
		float f = 1.2345656f; //4 bytes
		double d = 1.25d; // 8 bytes
		
		//in-line variable declaration and assignment
		int ageOfDog = 12;
		
		//variable declaration
		double doub;
		
		//variable assignment 
		doub = 1.5;
		
		//variable reassignment
		doub = 5.4;
		
		int g, k, a, m;
		g = 2;
		k = 6;
		
		
		//characters
		char ch =  ' ';
		
		//chain of characters
		String str = "wed56788kk9988";
		
		//True or false values
		boolean bool = false;
		
		//final make the variable immutable
		final int age = 20;
		
		System.out.println(11>3);
		
		//string concatenation
		System.out.println("3"+312);
		System.out.println(2+2+"3"+3+2);
		System.out.println(5!=2);  //not equal
		
		//operator in java
		//assignment: =
		//aritmetic: +, -, ++, --, *, %
		//comparison: ==, !=, <, >=, >, <= 
		//logical: &&, ||, !
		


		 System.out.println(111 !=11);
		 //assignment
		 String name ="john";
		
		 // Arethmetic
		 System.out.println(3+3);
		 System.out.println(3-3);
		 System.out.println(10/3);
		 System.out.println(10*3);
		 System.out.println(10%3);
		 System.out.println(age);
	//	 System.out.println(age++);
		// System.out.println(numberOfStudents);
	//	 System.out.println(numberOfStudents++);
		
		 // comparison
		 System.out.println(10==10);
		 System.out.println(10!=10);
		 System.out.println(5>4);
		 System.out.println(5>=4);
		 System.out.println(0<-5);
		 System.out.println(0<=5);
		// logical &&, ||, !
		 System.out.println(10>5 && 10 <15); //true
		 System.out.println(10<5 && 10<15); // false

		
		System.out.println("\"hi!\"");
		


/*
			\' single quote
			\" double quote
			\\ backslash
			\n new line
			\t tab
			\r back to the beginning of the line
			\b backspace
			\f next page
			
			*/

		
		int []array = {10,20,30,40};
		System.out.println(array[1]);
		int [][]array1 = {{10,20,30,40},{50,60,70,80}};
		
		System.out.println(array1[0][0]);
		
				
		
	}

}
