package com.dp.chainpattern;

public interface Chain {
	public void setNextChain(Chain nextChain);
	public void calculate(Numbers numbers);
}
