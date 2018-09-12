package fraction;

import java.util.Scanner;
import fraction.BasicFracCalc;

public class ChooseCalc {
	static int Calc;
	static String Input;
	static String PreviousAnswer = null;
	static Scanner scanInput = new Scanner(System.in);
	static int ConEqu = 0;
	public static void main(String[] args) {
		System.out.println("Calculator?");
		Input = scanInput.nextLine();
		Calc = Integer.parseInt(Input);
		ActivateCalculator(Calc);
		//MultiStepProcesses();
	}
	
	public static void ActivateCalculator(int Input){
		if(Input==1){
			BasicFracCalc.BasicFrac();
		} else if(Input==2){
			BasicRegCalc.BasicCalc();
		} else if(Input==3){
			AdvInputBasicCalc.AdvancedInputBasicCalc();
		} else if(Input==4){
			AdvCalc.AdvancedCalc();
		}
	}
	
	public static String CalculatorAnswer(int Input){
		String Result = null;
		if(Input==1){
			Result = BasicFracCalc.LastAns;
		} else if(Input==2){
			//Result = BasicRegCalc.BasicCalc();
		} else if(Input==3){
			//Result = AdvInputBasicCalc.AdvancedInputBasicCalc();
		} else if(Input==4){
			Result = AdvCalc.LastAns;
		}
		return Result;
	}
	
	public static void MultiStepProcesses(){
		System.out.println("Continue? (y/n)");
		Input = scanInput.nextLine();
		if(Input.contentEquals("y")||Input.contentEquals("Y")){
			System.out.println("New equation? (y/n)");
			Input = scanInput.nextLine();
			if(Input.contentEquals("y")||Input.contentEquals("Y")){
				ActivateCalculator(Calc);
				ConEqu = 0;
			} else if(Input.contentEquals("n")||Input.contentEquals("N")){
				PreviousAnswer = CalculatorAnswer(Calc);
				ActivateCalculator(Calc);
				ConEqu = 1;
			}
		} else if(Input.contentEquals("n")||Input.contentEquals("N")){
			
		}
	}
	
}
