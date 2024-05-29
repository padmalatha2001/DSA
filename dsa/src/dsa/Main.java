package dsa;

interface I1{
   default void main(){
        System.out.println("main method");
    }
}
 interface I2{
	 default void main(){
        System.out.println("main method-2");
    }
}
public class Main implements I1,I2
{
	
	public static void main(String[] args) {
		System.out.println("Hello World");
		Main main=new Main();
		main.main();
	}

	@Override
	public void main() {
		// TODO Auto-generated method stub
		I1.super.main();
		I2.super.main();
	}
}