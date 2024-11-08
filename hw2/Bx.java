package l1;

public class Bx {

	public static void main(String[] args) {
		
		
		Box obj = new Box();
		obj.setItem("mowz");
		System.out.println(obj.getItem());
		
		Box obj2 = new Box();
		obj2.setItem("khiar");
		System.out.println(obj2.getItem());
		
		Box obj3 = new Box();
		obj3.setItem(2);
		System.out.println(obj3.getItem());
		
		Box obj4 = new Box();
		obj4.setItem(null);
		System.out.println(obj4.getItem());
		
	}

	public static class Box {
		
		private Object item;

		public Object getItem() {
			return item;
		}

		public void setItem(Object item) {
			this.item = item;
		}
		
		
	}
}
