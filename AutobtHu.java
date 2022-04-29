package bytyp.pack;


public class AutobtHu {
	
		private AutobtHu heart;

		
		
		public AutobtHu getHeart() {
			return heart;
		}



		public void setHeart(AutobtHu heart) {
			this.heart = heart;
		}



		public void hufunc() {
			System.out.println("human function calling heart");
			heart.heartfunc1();
		}
}
