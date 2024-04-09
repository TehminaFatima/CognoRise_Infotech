package tasks;
import java.util.Scanner;
	class Calculator {
		double a,b;
		public double add (double a,double b){
			return  a+b;
			}

			public double sub (double a,double b){
		return a-b;
		}

			public double mul(double a,double b){
		return a*b;
		}
			public	double div(double a,double b){
			    try {
		            return a / b;
		        } catch (ArithmeticException e) {
		            System.out.println("Error: Division by zero");
		          
		            return Double.POSITIVE_INFINITY;}
		        
			}
			public double rem(double a, double b){
		return a%b;
			}
		}
public class Task3 {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner sc= new Scanner(System.in);
				System.out.println("Welcome to my calculator");
				while(true){
				System.out.println("Enter 1st number : ");
			double a = sc.nextDouble();
			
			
			System.out.println("Enter operator (+, -, *, /, % ): ");
			char operator = sc.next().charAt(0);

			System.out.println("Enter 2nd number : ");
		double b = sc.nextDouble();

		Calculator calculator = new Calculator();
		 double result = 0 ;
		 
		 
		 switch (operator){
		 case '+' :
		 result = calculator.add(a, b);
			System.out.print("result : " + result );
			break;
		 case '-'  :
		 result = calculator.sub(a, b);
			System.out.print("result : " + result );
			break;
		 case '*' :
		 result = calculator.mul(a, b);
			System.out.print("result : " + result );
			break;
		 case '/'  :
		 result = calculator.div(a, b);
			System.out.print("result : " + result );
			break;
		 case '%' :
		result = calculator.rem(a, b);
			System.out.print("result : " + result );
			break;}
		 System.out.println("\ndo you want to continue");
		 String choice = sc.next();
		 if (choice.equalsIgnoreCase("no"))
			 break;
	} System.out.println("THANK YOU");
sc.close();	}

}
