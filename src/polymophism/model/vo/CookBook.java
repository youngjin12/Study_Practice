package polymophism.model.vo;

public class CookBook extends Book{

private boolean coupon;

public CookBook() {
	// TODO Auto-generated constructor stub
}

public CookBook(String title, String author, String publisher, boolean coupon) {
	super(title, author, publisher);
	this.coupon = coupon;
}

/**
 * @return the coupon
 */
public boolean isCoupon() {
	return coupon;
}

/**
 * @param coupon the coupon to set
 */
public void setCoupon(boolean coupon) {
	this.coupon = coupon;
}

@Override
public String toString() {
	return super.toString() + coupon;
}



}
