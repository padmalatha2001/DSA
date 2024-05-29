package dsa.stack;


public class ReversingString {

	public static String reverse(String str) {
	
	Stack stack=new Stack();
	//String str="HELLO";
	char[] arr=str.toCharArray();
	for(char c:arr) {
	 stack.push(c);	
	}
	
	for(int i=0;i<str.length();i++)
	{
		arr[i]=(char) stack.pop();
	}
	
	return new String(arr);
  }
	
	public static void main(String[] args) {
		String str="HELLO";
		System.out.println(str);
        String rev=reverse(str);
        System.out.println(rev);
	}
	
}
