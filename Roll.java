package m;


public class Roll {
	private int rollnum;
	public Roll(){
		rollnum = -1;
	}
	public int rollStave() {
		rollnum = (int)Math.random()*2+35;
		return rollnum;
		
	}
}
