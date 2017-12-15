package jdbc;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;


 class Ssss{

	public static void main(String args[])throws Exception
	{
		main123();
	}
        public  static void main123()throws Exception
    	{
            //Your authentication key
            String authkey = "7095019947";
            //Multiple mobiles numbers separated by comma
            String mobiles = "7095019947";
            //Sender ID,While using route4 sender id should be 6 characters long.
            String senderId = "102234";
            //Your message to send, Add URL encoding here.
            String message = "Test message";
            //define route
            String route="default";

            //Prepare Url
            URLConnection myURLConnection=null;
            URL myURL=null;
            BufferedReader reader=null;

            //encoding message
            String encoded_message=URLEncoder.encode(message);

            //Send SMS API
            String mainUrl="http://site21.way2sms.com/main.action";

            //Prepare parameter string
            StringBuilder sbPostData= new StringBuilder(mainUrl);
            sbPostData.append("authkey="+authkey);
            sbPostData.append("&mobiles="+mobiles);
            sbPostData.append("&message="+encoded_message);
            sbPostData.append("&route="+route);
            sbPostData.append("&sender="+senderId);

            //final string
            mainUrl = sbPostData.toString();
            try
            {
                //prepare connection
                myURL = new URL(mainUrl);
                myURLConnection = myURL.openConnection();
                myURLConnection.connect();
                reader= new BufferedReader(new InputStreamReader(myURLConnection.getInputStream()));
                //reading response
                String response;
                while ((response = reader.readLine()) != null)
                //print response
                System.out.println(response);

                //finally close connection
                reader.close();
            }
            catch (IOException e)
            {
                    e.printStackTrace();
            }
        }
}