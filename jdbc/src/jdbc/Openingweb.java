package jdbc;

public class Openingweb {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		String url_open ="https://www.google.co.in/";
		java.awt.Desktop.getDesktop().browse(java.net.URI.create(url_open));
	}

}
