package inherit.model2;

import inherit.model2.vo.Point;

public class Rectangle extends Point{
	private int width;
	private int height;
	
	 public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	public void draw() {
		super.draw(); 
		System.out.println("면적 : " +(int)(width * height));
		System.out.println("둘레 : " + (int)(2*(width + height)));
				
	}
}
