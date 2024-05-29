package dsa;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList<>();
		a.stream().forEach(e->System.out.println(""));
		a.stream().collect(Collectors.counting());
		System.out.println(a);

	}

}
