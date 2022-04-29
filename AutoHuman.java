package auto.cool;

public class AutoHuman {
	private AutoHeart heart;

	public AutoHeart getHeart() {
		return heart;
	}

	public void setHeart(AutoHeart heart) {
		this.heart = heart;
	}
	
	public void hufunc() {
		System.out.println("human function calling heart");
		heart.heartfunc1();
	}
}
