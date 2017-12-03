// 60171672
// »≤¡ÿ«œ
public class Text implements Drawable {
	private String string;
	// private
	
	public Text() {}
	// Default Constructor
	public Text(String string) {setString(string);}
	// Constructor
	
	public String getString() {return string;}
	public void setString(String string) {this.string = string;}
	// getter setter
	
	public void draw() {
	// implements Drawable
		System.out.println(getString());
	}
}
