package switchstatement;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String day = "Mon";
		switch(day) {
		case "mon":
			System.out.println("review java");
		case "tue":
			System.out.println("school");	
		case "wed":
			System.out.println("do codelab");	
			
		case "thu":
			System.out.println("do assignment");	
		case "fri":
			System.out.println("go gym");	
		case "sat":
			System.out.println("practise java");	
			
		case "sun":
			System.out.println("submit assignment");
			default:
			System.out.println("invalid day");
			
			
		}

	}

}
