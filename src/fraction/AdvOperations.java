package fraction;

public class AdvOperations {
	public static double InputDetect(String StrOne, String StrTwo, String Sign, int Stage){
		double Result = 0;
		double NumOne = 0;
		double NumTwo = 0;
		if(Stage == 1){
			NumOne = NumberDetectOne(StrOne);
			NumTwo = NumberDetectOne(StrTwo);
		} else if(Stage == 2){
			NumOne = NumberDetectTwo(StrOne);
			NumTwo = NumberDetectTwo(StrTwo);
		}
		if(Sign.contentEquals("+")){
			Result = Add(NumOne, NumTwo);
		} else if(Sign.contentEquals("-")){
			Result = Subtract(NumOne, NumTwo);
		} else if(Sign.contentEquals("*")){
			Result = Multiply(NumOne, NumTwo);
		} else if(Sign.contentEquals("/")){
			Result = Divide(NumOne, NumTwo);
		} else if(Sign.contentEquals("^")){
			Result = Power(NumOne, NumTwo);
		} else {
			System.out.println("Error at InputDetect" + Sign + Stage);
		}
		return Result;
	}
	
	public static double Power(double NumOne, double NumTwo){
		double Result = 0;
		int i = 1;
		Result = NumOne;
		while(i<NumTwo){
			Result = Result * NumOne;
			i++;
		}
		return Result;
	}
	
	public static double NumberDetectOne(String NumStr){
		double result = 0;
		String[] spliceNumStr = AdvInput.Splice(NumStr);
		String[] temp = AdvInput.FractionSplice(spliceNumStr, spliceNumStr.length);
		int i = 0;
		int a = 0;
		while(i < temp.length-1){
			if(temp[i] == null){
				a = 1;
				if(temp[0] == null){
					result = 1;
				} else {
					result = Double.parseDouble(temp[0]);
				}
			}
			i++;
		}
		if(temp.length > 1 && a == 0){
			result = InputDetect(temp[0], temp[2], temp[1], 2);
		} else {
			result = Double.parseDouble(temp[0]);
		}
		
		return result;
	}
	
	public static double NumberDetectTwo(String NumStr){
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
