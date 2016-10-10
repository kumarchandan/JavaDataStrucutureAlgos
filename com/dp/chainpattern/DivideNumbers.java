package com.dp.chainpattern;

public class DivideNumbers implements Chain {
	
	Chain chain;
	
	@Override
	public void setNextChain(Chain nextChain) {
		this.chain = nextChain;
	}

	@Override
	public void calculate(Numbers numbers) {
		
		if(numbers.getOp() == EnumOp.DIV.toString()) {
			System.out.println("Divide it: "+(numbers.getNum1() / numbers.getNum2()));
		} else {
			System.out.print("Sorry, We can't help you with this!");
		}
	}

}
