package TTD_and_JUNIT_Task;
import java.io.*;
import java.util.Scanner;
public class Java_Junit_demo_class {
	public static void main(String[] aa) {
		@SuppressWarnings("resource")
		Scanner scanobj=new Scanner(System.in);
		String input=scanobj.next();
		String result="";
		result=To_Remove_A(input);
		System.out.println(result);
	}
	static String To_Remove_A(String input) {
		if(input.charAt(0)=='A'&&input.charAt(1)=='A') {
			String result=input.substring(2,input.length());
					return result;
		}
		else if(input.charAt(0)=='A' && input.charAt(1)!='A') {
	     	String result=	input.substring(1,input.length());
		            return result;
		}

		else if(input.charAt(1)=='A' && input.charAt(0)!='A')
		{
			String result="";
			for(int i=0;i<input.length();i++)
	            {
				if(i==1) 
				{}
				else {
					result+=input.charAt(i);
					}
			}
			return result;
		}
		else {
			return input;
			}
	}
}
