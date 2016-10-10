package com.dp.chainpattern;

public enum EnumOp {
	
	ADD, SUB, MUL, DIV;
	
	public String toString() {
		switch (this) {
		case ADD:
			return "add";
		case SUB:
			return "sub";
		case MUL:
			return "mul";
		case DIV:
			return "div";
		default:
			return null;
		}
	}
	
}
