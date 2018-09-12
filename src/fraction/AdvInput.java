package fraction;

import java.util.Scanner;

public class AdvInput {
	static double NumOne;
	static double NumTwo;
	static String[] Sign = {"","","","","","","","","",""};
	static int NumOfNum = 1;
	static String Input;
	static Scanner scanInput = new Scanner(System.in);
	static String[] Spliced = null;
	static String[] Signs = null;
	static String[] Numbers = null;
	
	public static void AdvancedInput(){
		System.out.println("Equation?");
		Input = scanInput.nextLine();
		Input.length();
		Spliced = SpliceTwo(Splice(Input),Splice(Input).length);
	}
	
	public static String[] Splice(String Input){
		int i = 0;
		int length = Input.length();
		char temp;
		String ati = null;
		String[] spliced = new String[length];
		while(i<length){
			temp = Input.charAt(i);
			ati = String.valueOf(temp);
			spliced[i] = ati;
			i++;
		}
		return spliced;
	}
	
	public static String[] FractionSplice(String[] spliced, int length){
		int i = 0;
		int c = 0;
		int b = 0;
		int a = 0;
		int PrevAns = 0;
		int PrevAnsLength = 0;
		String[] splicedTwo = new String[length + PrevAnsLength];
		String conNum = "";
		i = 0;
		while(i<spliced.length){
			try {
				try {
					if(Double.parseDouble(spliced[i])%1 == 0){
						conNum = conNum + spliced[i];
						splicedTwo[a] = conNum;
						/*int z = 0;
						while(z<splicedTwo.length){
							System.out.println(splicedTwo[z]);
							z++;
						}*/
						b = 1;
					}
				} catch (NumberFormatException e) {
					if(spliced[i].contentEquals(".")){
						conNum = conNum + spliced[i];
						splicedTwo[a] = conNum;
					} else {
						a++;
						splicedTwo[a] = spliced[i];
						conNum = "";
						//e.printStackTrace();
						a++;
					}
				}
			} catch (Exception e) {
				//e.printStackTrace();
			}
			i++;
		}
		return splicedTwo;
	}

	public static String[] SpliceTwo(String[] spliced, int length){
		int i = 0;
		int c = 0;
		int b = 0;
		int a = 0;
		int PrevAns = 0;
		int PrevAnsLength = 0;
		if(ChooseCalc.ConEqu == 1){
			PrevAnsLength = ChooseCalc.PreviousAnswer.length();
		}
		String[] splicedTwo = new String[length + PrevAnsLength];
		String conNum = "";
		if(ChooseCalc.ConEqu == 1){
			PrevAns = 1;
		}
		if(ChooseCalc.ConEqu == 1 && PrevAns == 1){
			splicedTwo[a] = ChooseCalc.PreviousAnswer;
			PrevAns = 0;
			c = 1;
		}
		while(i<spliced.length){
			if(spliced[i].equals(" ")){
				if(c == 0){
					c = 1;
				} else if(c == 1){
					c = 0;
				}
			} else if(c == 0){
				conNum = conNum + spliced[i];
				splicedTwo[a] = conNum;
			} else if(c == 1){
				a++;
				splicedTwo[a] = spliced[i];
				conNum = "";
				a++;
			}
			i++;
			/*int z = 0;
			while(z<splicedTwo.length){
				System.out.println(splicedTwo[z]);
				z++;
			}*/
		}
		return splicedTwo;
	}
	
	public static void main(String[] args) {
	}
}
