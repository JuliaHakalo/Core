package less10;

public class Main {

	public static void main(String[] args) {
		Header header = new SimpleHeader();
		Body body = new SimpleBody();
		Footer footer = new SimpleFooter();
		Page page = new Page(header,body,footer);
		page.printPage();
		System.out.println();
		Body leftBody = new LeftBody();
		Page leftPage = new Page(header,body,footer);
		leftPage.printPage();
		System.out.println();
		Page leftPageNoFooter = new Page(header,body,null);
		leftPageNoFooter.printPage();

	}

}
