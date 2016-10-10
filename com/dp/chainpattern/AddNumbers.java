package com.dp.chainpattern;

public class AddNumbers implements Chain {
	
	Chain chain;
	
	@Override
	public void setNextChain(Chain nextChain) {
		this.chain = nextChain;
	}

	@Override
	public void calculate(Numbers numbers) {
		
		if(numbers.getOp() == EnumOp.ADD.toString()) {
			System.out.println("Addition is: "+ (numbers.getNum1()+numbers.getNum2()));
		} else {
			chain.calculate(numbers);
		}
	}

}
