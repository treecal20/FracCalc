package fraction;

public class AdvCalc {
	static int i = 0;
	static int x = 0;
	static int Length;
	static String[] FullInput = null;
	static String LastAns;
	
	public static void AdvancedCalc(){
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
		LastAns = FullInput[x];
		System.out.println("Result: " + FullInput[x]);
	}
	
	public static void Continue(){
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
		LastAns = FullInput[x];
		System.out.println("Result: " + FullInput[x]);
		ChooseCalc.MultiStepProcesses();
	}
	
	public static String Cycle(String InOne, String InTwo, String Sign){
		double result;
		result = AdvOperations.InputDetect(InOne, InTwo, Sign, 1);
		return String.valueOf(result);
	}
	
	public static String Start(String[] Input){
		double result;
		result = AdvOperations.InputDetect(Input[0], Input[2], Input[1], 1);
		return String.valueOf(result);
	}
}
