package inherit.model2;

import inherit.model2.vo.Point;

public class Circle extends Point{
	
	private int radius;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	/**
	 * @return the radius
	 */
	public int getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(int radius) {
		this.radius = radius;
	}


	public void draw() {
		super.draw(); 
		System.out.printf("면적 : %.1f \n" , (Math.PI* radius * radius));
		System.out.printf("둘레 : %.1f \n" , (Math.PI* radius * 2));
	}
	
	
	
	
	
}
