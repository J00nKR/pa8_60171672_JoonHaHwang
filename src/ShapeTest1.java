// 60171672
// Ȳ����
public class ShapeTest1 {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[3];
		shapes[0] = new Rectangle(10, 20, 30, 40);
		shapes[1] = new Rectangle(30, 30, 10, 10);
		shapes[2] = new Circle(50, 20, 30);
		//shape [Rectangle, Rectangle, Circle]

		for(Shape s: shapes) {
			System.out.printf("Area: %.1f\n", s.getArea());
			System.out.printf("Length: %.1f\n", s.getLength());
			// print shapes[0~2] Area, Length
		}
		
		Drawable[] drawables = new Drawable[4];
		for(int i = 0; i < shapes.length; i++) {
			drawables[i] = (Drawable) shapes[i];
		}
		drawables[3] = new Text("Sample Text");
		// shape [Rectangle, Rectangle, Circle, Sample Text]
		for(Drawable d: drawables) {
			d.draw();
			// draw()
		}
	}

}
