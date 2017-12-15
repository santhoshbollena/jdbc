package jdbc;
import com.way2sms.SMS;
public class Sendingsms {

	public static void main(String[] args) {
		String Username,Password,Number,Message,Proxy;
		SMS smsClient=new SMS();
		smsClient.send( Username, Password, Number, Message,Proxy);
		}
}
