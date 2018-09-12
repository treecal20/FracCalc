package fraction;

import java.util.Scanner;

public class AdvInputBasicCalc {
	static double NumOne;
	static double NumTwo;
	static int NumOfNum = 1;
	static int i = 0;
	static int s = 2;
	static int n = 3;
	static int x = 0;
	static int Length;
	static String Input1, Input2, Input3, Input4;
	static Scanner scanInput = new Scanner(System.in);
	static String[] FullInput = null;
	
	public static void AdvancedInputBasicCalc(){
		AdvInput.AdvancedInput();
		Length = AdvInput.Spliced.length - 1;
		FullInput = AdvInput.Spliced;
		while(i<AdvInput.Spliced.length){
			if(FullInput[i] == null){
				Length = i-1;
				i = AdvInput.Spliced.length;
			}
			i++;
		}
		FullInput[2] = Start(FullInput);
		i = 2;
		while(i<Length){
			String StrNumOne = FullInput[i];
			i++;
			String StrSign = FullInput[i];
			i++;
			String StrNumTwo = FullInput[i];
			FullInput[i] = Cycle(StrNumOne, StrNumTwo, StrSign);
		}
		x = Length;
		System.out.println("Result: " + FullInput[x]);
	}
	
	public static String Cycle(String InOne, String InTwo, String Sign){
		double result;
		result = InputDetect(InOne, InTwo, Sign);
		return String.valueOf(result);
	}
	
	public static String Start(String[] Input){
		double result;
		result = InputDetect(Input[0], Input[2], Input[1]);
		return String.valueOf(result);
	}
	
	public static double InputDetect(String StrOne, String StrTwo, String Sign){
		double Result = 0;
		double NumOne = NumberDetect(StrOne);
		double NumTwo = NumberDetect(StrTwo);
		if(Sign.contentEquals("+")){
			Result = Add(NumOne, NumTwo);
		} else if(Sign.contentEquals("-")){
			Result = Subtract(NumOne, NumTwo);
		} else if(Sign.contentEquals("*")){
			Result = Multiply(NumOne, NumTwo);
		} else if(Sign.contentEquals("/")){
			Result = Divide(NumOne, NumTwo);
		} else {
			System.out.println("Error at InputDetect");
		}
		return Result;
	}
	
	public static double NumberDetect(String NumStr){
		double result = 0;
		result = Double.parseDouble(NumStr);
		return result;
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
