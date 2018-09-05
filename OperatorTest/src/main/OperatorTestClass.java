package main;

public class OperatorTestClass {
	public int addition(int operand1,int operand2) {
		return operand1 + operand2;
	}
	public int subtraction (int operand1,int operand2) {
		return operand1 - operand2;
	}
	public int multiplication (int operand1,int operand2) {
		return operand1*operand2;
	}
	public int division (int operand1,int operand2) {
		return operand1/operand2;

}
	public int modulus (int operand1,int operand2) {
		return operand1%operand2;
	}
	public int bitAnd (int operand1,int operand2) {
		return operand1&operand2;
}
	public int bitOr(int operand1,int operand2)
	{
		return operand1|operand2;
	}
	public int bitExOr(int operand1,int operand2)
	{
		return operand1^operand2;
	}
	public int bitShiftLeft(int operand1,int operand2)
	{
		return operand1<<operand2;
	}
	public int bitShiftRight(int operand1,int operand2)
	{
		return operand1>>operand2;
	}
	public int bitShiftRightZero(int operand1)
	{
		return operand1 >>0;
	}
	public int bitShiftLeftZero(int operand1)
	{
		return operand1<<0;
	}
	
	public int equalTo(int operand1,int operand2)
	{
		return operand1=operand2 ;
	}
	public int greaterThan(int operand1,int operand2)
	{
		return operand1>>operand2;
	}
}
