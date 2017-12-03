// 60171672
// 황준하

abstract public class Shape implements Drawable, Movable {
	private double x;
	private double y;
	private double width;
	private double height;
	// private
	
	public double getX() {return x;}
	public void setX(int x) {this.x = x;}
	public double getY() {return y;}
	public void setY(int y) {this.y = y;}
	public double getWidth() {return width;}
	public void setWidth(int width) {this.width = width;}
	public double getLength() {return height;}
	public void setLength(int height) {this.height = height;}
	public double getArea() {return width*height;}
	public double getHeight() {return height;}
	public void setHeight(int height) {this.height = height;}
	// getter setter
	
	public void draw() {
		// implements Drawable
	}
	public void move(double dx, double dy) {
		// implements Movable
		setX((int) dx+10);
		setY((int) dy+10);
		draw();
	}
}

class Rectangle extends Shape {
	public double getArea() {return getWidth()*getHeight();}
	public double getLength() {return (getWidth()+getHeight())*2;}
	// getter setter , override
	
	public Rectangle() {}
	// Default Constructor
	public Rectangle(int x, int y, int width, int height) {
	// constructor Rectangle(x,y,width,height)
		setX(x);
		setY(y);
		setWidth(width);
		setHeight(height);
	}
	@Override
	public void draw() {
		// override draw
		System.out.printf("Rectangle (%.1f , %.1f) - (%.1f, %.1f)\n", getX(), getY(), getX()+getWidth(), getY()+getHeight());
	}
}

class Circle extends Shape {
	private double radius;
	// private

	public double getRadius() {return radius;}
	public void setRadius(int radius) {this.radius = radius;}
	public double getArea() {return (Math.pow(getRadius(),2) * Math.PI);}
	public double getLength() {return 2*getRadius()*Math.PI;}
	// getter setter , override
	
	public Circle() {}
	// Default Constructor
	public Circle(int x, int y, int radius){
	// constructor Circle(x,y,radius)
		setX(x);
		setY(y);
		setRadius(radius);
	}
	public void move(double dx, double dy) {
		// implements Movable
		setX((int)(getX() + dx));
		setY((int)(getY() + dy));
		draw();
	}
	
	public void draw() {
	// override
		System.out.printf("Circle center (%.1f , %.1f) - radius (%.1f)\n", getX(), getY(), getRadius());
	}
}

class Square extends Shape {
	// 정사각형
	public double getArea() {return getWidth()*getWidth();}
	public double getLength() {return getWidth()*4;}
	// getter setter
	
	public Square() {}
	// Default Constructor
	public Square(int x, int y, int width) {
		setX(x);
		setY(y);
		setWidth(width);
	}
	// constructor Square (x, y, width)
	
	@Override
	public void draw() {
		// override draw
		System.out.printf("Square (%.1f , %.1f) - (%.1f, %.1f)\n", getX(), getY(), getX()+getWidth(), getY()+getWidth());
	}
}


class Triangle extends Shape {
	// 삼각형
	private int bottom;
	
	public int getBottom() {return bottom;}
	public void setBottom(int bottom) {this.bottom = bottom;}
	// getter setter
	
	public Triangle() {}
	// Default Constructor
	public Triangle(int x,int y, int bottom, int width) {
		setX(x);
		setY(y);
		setBottom(bottom);
		setWidth(width);
	}
	// constructor Triangle(x, y, bottom, width)

	@Override
	public void draw() {
		// override draw
		System.out.printf("Triangle (%.1f , %.1f) - (%.1f, %.1f) - (%.1f, %.1f)\n", getX(), getY(), getX()-getBottom()/2, getY()-getWidth(), getX()-getBottom(),getY()-getWidth());
	}
}

class Bear extends Shape{
	// Shape Bear
	private String shape = "Bear";
	private double radius;
	//private
	Shape[] shapes = new Shape[3];
	Drawable[] drawables = new Drawable[shapes.length];
	// Array

	public double getRadius() {return radius;}
	public void setRadius(int radius) {this.radius = radius;}
	// getter setter
	
	public Bear() {}
	// Default Constructor
	public Bear(int x, int y, int radius) {
		setX(x);
		setY(y);
		setRadius(radius);
		shapes[0] = new Rectangle(x-radius,y-radius,radius*2,radius*2);
		shapes[1] = new Circle(x-radius,y-radius,radius/2);
		shapes[2] = new Circle(x+radius, y-radius, radius/2);
	}
	// constructor Bear(x, y, radius) , shape[Rectangle, Circle, Circle]

	@Override
	public void draw() {
		// override draw
		System.out.println(shape);
		// "Bear"
		for(int i = 0; i< shapes.length; i++) {
			drawables[i] = shapes[i];
		}
		for(Drawable d : drawables) {
			d.draw();
		}
	}
}