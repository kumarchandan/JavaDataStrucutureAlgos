package com.dp.chainpattern;

public class SubtractNumbers implements Chain {
	
	Chain chain;
	
	@Override
	public void setNextChain(Chain nextChain) {
		this.chain = nextChain;
	}

	@Override
	public void calculate(Numbers numbers) {
		
		if(numbers.getOp() == EnumOp.SUB.toString()) {
			System.out.println("Subtraction is: "+ (numbers.getNum1()-numbers.getNum2()));
		} else {
			chain.calculate(numbers);
		}
	}

}
