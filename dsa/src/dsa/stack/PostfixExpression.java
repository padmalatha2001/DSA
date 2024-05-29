package dsa.stack;

import java.util.Stack;
public class PostfixExpression {

	 public static int evaluate(String s) {
		 
		 Stack<Integer> stack=new Stack<>();
		 for(int i=0;i<s.length();i++) {
			 char c=s.charAt(i);
			 if(Character.isDigit(c))
			 {
				 stack.push(c-'0');
			 }
			 else {
				 int o2=stack.pop();
				 int o1=stack.pop();
				 switch(c) {
				 case '+':stack.push(o1+o2);break;
				 case '-':stack.push(o1-o2);break;
				 case '*':stack.push(o1*o2);break;
				 case '/':stack.push(o1/o2);break;
				 }
			 }
		 }
		 return stack.pop();
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String postfixExpression = "52+83-*4/";
		 System.out.println(evaluate(postfixExpression));

	}

}
