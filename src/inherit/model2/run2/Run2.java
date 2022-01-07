package inherit.model2.run2;


import inherit.model2.Circle;
import inherit.model2.Rectangle;

public class Run2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle[] c = new Circle[2];
		Rectangle[] r = new Rectangle[2];
		
		c[0] = new Circle(1, 2, 3);
		c[1] = new Circle(3, 3, 4);
		
		r[0] = new Rectangle(-1, -2, 5, 2);
		r[1] = new Rectangle(-2, 5, 2, 8);
		
		System.out.println("======== circle =========");
		for(Circle cir : c) {
			cir.draw();
		}
		
		System.out.println("======== rectangle =========");
		for(Rectangle re : r) {
			re.draw();
			
		}
		}
	}

