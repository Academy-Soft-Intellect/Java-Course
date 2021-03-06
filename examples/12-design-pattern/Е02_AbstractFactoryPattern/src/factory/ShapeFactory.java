package factory;

import shape.factory.Circle;
import shape.factory.Rectangle;
import shape.factory.Shape;
import shape.factory.Square;
import color.factory.Color;

public class ShapeFactory extends AbstractFactory {
	
	 @Override
	 public Shape getShape(String shapeType){
		 if(shapeType == null){
			 return null;
		 }
		 if(shapeType.equalsIgnoreCase("CIRCLE")){
			 return new Circle();
		 } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
			 return new Rectangle();
		 } else if(shapeType.equalsIgnoreCase("SQUARE")){
			 return new Square();
		 }
	 	return null;
	 }

	 @Override
	 public Color getColor(String color) {
		 return null;
	 }
}
