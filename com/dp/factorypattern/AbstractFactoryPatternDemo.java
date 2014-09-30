package com.dp.factorypattern;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		
		// get Shape Factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		
		// get an object of Shape Circle
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.draw();
	}
}
