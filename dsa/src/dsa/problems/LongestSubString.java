package dsa.problems;

import java.util.HashSet;

public class LongestSubString {

	  public static String longS(String s) {
		  int n=s.length();
		  int left=0,right=0,max=0;
		  String subStr="";
		  HashSet<Character> set =new HashSet<>();
		  while(right<n) {
			  char c=s.charAt(right);
			  if(!set.contains(c)) {
				  set.add(c);
				  right++;
				  if(right-left>max) {
					  max=right-left;
					  subStr=s.substring(left, right);
				  }
			  }else {
				  set.remove(s.charAt(left));
				  left++;
			  }
			  
		  }
		  
		  return subStr;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str="abcabcabb";
       System.out.println("Longest substring : "+longS(str));
	}

}
