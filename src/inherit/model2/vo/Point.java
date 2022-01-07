package inherit.model2.vo;

public class Point {
	private int x;
	private int y;

	public Point() {
		// TODO Auto-generated constructor stub
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	public void draw() {
		System.out.println("( x, y ) : " + "(" + x + ", " + y + ")");
	}

	
	
}
