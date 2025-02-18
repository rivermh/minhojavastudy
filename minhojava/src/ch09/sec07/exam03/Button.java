package ch09.sec07.exam03;

public class Button {
	//Field
	private ClickListener clickListener;
	//Constructor
	//Method
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	public void click() {
		this.clickListener.onClick();
	}
	//Nested Class
	//Nested Interface
	public static interface ClickListener{
		public void onClick();
	}
}
