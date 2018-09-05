import java.util.*;
import java.io.*;
public class InfixToPostfix {
	
	public void toPostfix(String string) {
		int len = string.length();
		char[] ch = new char[len];
		int index = -1;
		char[] array = new char[len];
		array = string.toCharArray();
		for(int k = 0; k < len; k++) {
			System.out.print(array[k]);
		}
		
		System.out.println("----------");
		String postfix = "";
		char c = ' ';
		for(int i = 0; i < len; i++) {
			if(array[i] == '^') {
				if(index >= 0) {
					if(ch[index] == '^') {
						while(ch[index] == '^') {
							c = ch[index];
							postfix = postfix + c;
							index--;
						}
					}
				}	
				ch[++index] = array[i];
			}
			else if(array[i] == '/' || array[i] == '*'){
				if(index >=0) {
					if(ch[index] == '^' || ch[index] == '/' || ch[index] == '*') {
						while(ch[index] == '^') {
							c = ch[index];
							postfix = postfix + c;
							index--;
						}
					}
				}
				ch[++index] = array[i];
			}
			else if(array[i] == '+' || array[i] == '-') {
				if(index >= 0) {
					if(ch[index] == '^' || ch[index] == '/' || ch[index] == '*' || ch[index] == '+' || ch[index] == '-') {
						while(ch[index] == '^' || ch[index] == '/' || ch[index] == '*') {
							c = ch[index];
							postfix = postfix + c;
							index--;
						}
					}
				}
				ch[++index] = array[i];
			}
			else {
				postfix = postfix + array[i];
			}
		}
		System.out.println(postfix);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		InfixToPostfix obj = new InfixToPostfix();
		
		String str = scanner.nextLine();
		
		obj.toPostfix(str);
	}
}
