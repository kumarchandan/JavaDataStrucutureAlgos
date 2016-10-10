package com.dp.chainpattern;

public class MultNumbers implements Chain {
	
	Chain chain;
	
	@Override
	public void setNextChain(Chain nextChain) {
		this.chain = nextChain;
	}

	@Override
	public void calculate(Numbers numbers) {
		
		if(numbers.getOp() == EnumOp.MUL.toString()) {
			System.out.println("Multiplication is : "+(numbers.getNum1()*numbers.getNum2()));
		} else {
			chain.calculate(numbers);
		}
	}

}
