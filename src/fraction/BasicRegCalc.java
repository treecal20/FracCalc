package fraction;

import java.util.Scanner;

public class BasicRegCalc {
	static double NumOne;
	static double NumTwo;
	static String[] Sign = {"","","","","","","","","",""};
	static int NumOfNum = 1;
	static int i = 2;
	static int s = 2;
	static int n = 3;
	static String Input1, Input2, Input3, Input4;
	static Scanner scanInput = new Scanner(System.in);
	
	public static void BasicCalc(){
		System.out.println("Number of Numbers?");
		Input1 = scanInput.nextLine();
		NumOfNum = Integer.parseInt(Input1);
		NumOne = Start();
		while(i<NumOfNum){
			NumOne = Cycle(NumOne);
			i++;
		}
		System.out.println("Result: " + NumOne);
	}
	
	public static double Cycle(double NumOne){
		double Result;
		String Input;
		
		System.out.println("Sign?");
		Sign[s] = scanInput.nextLine();
		
		System.out.println("Number " + n + "?");
		Input2 = scanInput.nextLine();
		NumTwo = Double.parseDouble(Input2);
		n++;
		
		Input = Sign[s];
		Result = InputDetect(NumOne, NumTwo, Input);
		System.out.println(NumOne + " " + Input + " " + NumTwo + ": " + Result);
		s++;
		return Result;
	}
	
	public static double Start(){
		double Result;
		String Input;
		
		System.out.println("Number 1?");
		Input2 = scanInput.nextLine();
		NumOne = Double.parseDouble(Input2);
		
		System.out.println("Sign?");
		Sign[1] = scanInput.nextLine();
		
		System.out.println("Number 2?");
		Input2 = scanInput.nextLine();
		NumTwo = Double.parseDouble(Input2);
		
		Input = Sign[1];
		Result = InputDetect(NumOne, NumTwo, Input);
		System.out.println(NumOne + " " + Input + " " + NumTwo + ": " + Result);
		return Result;
	}
	
	public static double InputDetect(double NumOne, double NumTwo, String Input){
		double Result = 0;
		if(Input.contentEquals("+")){
			Result = Add(NumOne, NumTwo);
		} else if(Input.contentEquals("-")){
			Result = Subtract(NumOne, NumTwo);
		} else if(Input.contentEquals("*")){
			Result = Multiply(NumOne, NumTwo);
		} else if(Input.contentEquals("/")){
			Result = Divide(NumOne, NumTwo);
		} else {
			System.out.println("Error at InputDetect");
		}
		return Result;
	}
	
	public static double Add(double NumOne, double NumTwo){
		double Result = 0;
		Result = NumOne + NumTwo;
		return Result;
	}
	
	public static double Subtract(double numOne, double numTwo){
		double Result = 0;
		Result = numOne - numTwo;
		return Result;
	}
	
	public static double Multiply(double NumOne, double NumTwo){
		double Result = 0;
		Result = NumOne * NumTwo;
		return Result;
	}
	
	public static double Divide(double NumOne, double NumTwo){
		double Result = 0;
		Result = NumOne / NumTwo;
		return Result;
	}
	
	public static void main(String[] args) {
	}

}
