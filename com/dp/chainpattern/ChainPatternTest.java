package com.dp.chainpattern;

public class ChainPatternTest {
	
	public static void main(String args[]) {
		
		Chain chain1 = new AddNumbers();
		Chain chain2 = new SubtractNumbers();
		Chain chain3 = new MultNumbers();
		Chain chain4 = new DivideNumbers();
		
		chain1.setNextChain(chain2);
		chain2.setNextChain(chain3);
		chain3.setNextChain(chain4);
		
		Numbers numbers = new Numbers(40, 5, EnumOp.DIV.toString());
		chain1.calculate(numbers);
	}
	
}
