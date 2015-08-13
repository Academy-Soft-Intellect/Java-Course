package factory;

import shape.factory.Shape;
import color.factory.Color;

public abstract class AbstractFactory {
	
	 public abstract Color getColor(String color);
	 
	 public abstract Shape getShape(String shape);
	 }

