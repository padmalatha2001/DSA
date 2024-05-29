package dsa.stack;

public class ValidParenthesis {

	public static boolean isValid(String str) {
		
		char[] arr=str.toCharArray();
		Stack stack=new Stack();
		for(char c: arr)
		{
			if(c=='{'||c=='['||c=='(')
			{
				stack.push(c);
			}else {
				if(stack.isEmpty())
					return false;
			    if((c=='}'&&stack.peek()=='{')||(c==']'&&stack.peek()=='[')||(c==')'&&stack.peek()=='('))
			    {
		     		   stack.pop();
			    }
			    else {
			    	return false;
			    }
			}
	    }
		if(stack.isEmpty())
		{
			return true;
		}
		else
			return false;
	}
	public static void main(String[] args) {
		String str="{{}()}";
		if(isValid(str))
			System.out.println("it is valid parenthesis");
		else
			System.out.println("it is not a valid parenthesis");
		
	}
}
