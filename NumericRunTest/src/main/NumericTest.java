package main;

public class NumericTest {
	public static void main(String args[]){
		NumericTestInterface isEven = (n) -> (n%2) == 0;
		NumericTestInterface isNegative = (n) -> (n<0);
		
		System.out.println(isEven.computerTest(10));
		System.out.println(isNegative.computerTest(-11));
		
		GreetingInterface mg = (name) -> "Good Morning " + name + "!";
		System.out.println(mg.processName("Julfiker"));
		
		GreetingInterface morningGreeting = (str) -> "Good Morning " + str + "!";
		System.out.println(morningGreeting.processName("Mesut"));
		
		GreetingInterface eveningGreeting = (str) -> "Good Evening " + str + "!";
		System.out.println(eveningGreeting.processName("Ozil"));	

}
}
