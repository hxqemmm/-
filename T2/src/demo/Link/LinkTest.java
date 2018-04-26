package demo.Link;

public class LinkTest {
	public static void main(String[] args) {
		LinkStrack ls=new LinkStrack();
		ls.push("ÄÚÒÂ");
		ls.push("ÇïÒÂ");
		ls.push("ÍâÌ×");
		
		//System.out.println(ls.pull());
		ls.pull();
		
		ls.clearStrark();
		ls.seeStrack();
	}
}
