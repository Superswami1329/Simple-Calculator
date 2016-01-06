import java.util.Scanner;

public class Main {
	
	Scanner sc = new Scanner(System.in);
	Scanner op = new Scanner(System.in);
	
	public float answer;
	public int factorial;
	public boolean didWork = true;
	
	public Main() {
		System.out.println("Your First Number: ");
		float firstNumber = sc.nextInt();
		System.out.println("Your Second Number: ");
		float secondNumber = sc.nextInt();
		System.out.println("Your operator: ");
		String operator = op.nextLine();
		
		switch(operator) {
		
		case "+" :
			answer = firstNumber + secondNumber;
			break;
		
		case "-":
			answer = firstNumber - secondNumber;
			break;
		
		case "*": 
			answer = firstNumber * secondNumber;
			break;
			
		case "/":
			answer = firstNumber / secondNumber;
			break;
			
		case "^":
			answer = getPower(firstNumber, secondNumber);
			break;
		case "!":
			answer = getFactorial(firstNumber);
			didWork = false;
			break;
			
		default:
			System.out.println("That is not a valid operator");
			didWork = false;
			break;
		}
		
		if(didWork)
			System.out.println((int)firstNumber + operator + (int)secondNumber + " = " + answer);
		if(operator.equals("!"))
			factorial = (int)getFactorial(secondNumber);
			System.out.println((int)firstNumber + "!" + " = " + answer + ", " + (int) secondNumber + "! = " + factorial);
	}
	
	public float getFactorial(float number1) {
		for(int i = (int)number1 - 1; i > 0; i--) {
			number1 *= i;
		}
		return number1;
	}
	
	public float getPower(float number1, float number2) {
		for(int i = 1; i < number2; i++) {
			number1 *= number1;
		}
		
		return number1;
	}

	public static void main(String[] args) {
		new Main();
	}
	
}
