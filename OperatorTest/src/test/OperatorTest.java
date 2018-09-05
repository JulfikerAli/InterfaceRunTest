package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.OperatorTestClass;

class OperatorTest {
	OperatorTestClass OT=new OperatorTestClass();

	@Test
	void test() {
		assertEquals(5,OT.addition(3,2),"");
		assertEquals(3,OT.subtraction(5,2),"");
		assertEquals(10,OT.multiplication(5,2),"");
		assertEquals(5,OT.division(10,2),"");
		assertEquals(2,OT.modulus(10,4),"");
		assertEquals(29,OT.bitOr(12, 25),"");
    	assertEquals(21,OT.bitExOr(12, 25),"");
    	assertEquals(1,OT.bitShiftRight(212,7),"");
    	assertEquals(12,OT.bitShiftRightZero(12),"");
    	assertEquals(3392,OT.bitShiftLeft(212, 4),"");
    	assertEquals(12,OT.bitShiftLeftZero(12),"");

	}

}
