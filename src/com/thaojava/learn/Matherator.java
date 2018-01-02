package com.thaojava.learn;

public class Matherator implements Adder, Subtractor {

	public long subtract(long... operands) {
		// TODO Auto-generated method stub
		long sub = operands[0];
		for (int i = 1; i < operands.length; i ++)
		 sub -= operands[i];
		return sub;
	}

	public long add(long... operands) {
		// TODO Auto-generated method stub
		long sum = 0;
		for(long operand: operands)
			sum += operand;
		return sum;
	}

}
