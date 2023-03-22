import com.manageengine.pam360.grpc.client.Resource;


import java.util.HashMap;
import java.util.*;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONObject;

public class CreateAccount {
	
		
	public static void main(String[] args) throws Exception {
    //    Long resourceID = Long.parseLong(args[0]);
        Long resourceID = 2L;
        JSONObject inputdate = new JSONObject();
            JSONObject operation = new JSONObject();
                JSONObject Details = new JSONObject();
                    JSONArray ACCOUNTLIST = new JSONArray();
                        JSONObject account = new JSONObject();
                            account.put("ACCOUNTNAME","Tanay");
                            account.put("PASSWORD","Pa$$weeeord@123");
                            account.put("ACCOUNTPASSWORDPOLICY","Strong");
                            account.put("NOTES","IT Security - BES PMP API Test");
                            ACCOUNTLIST.put(account);
                        JSONObject account1 = new JSONObject();
                            account1.put("ACCOUNTNAME","Prashant");
                            account1.put("PASSWORD","Pa$$WRoshini@123");
                            account1.put("ACCOUNTPASSWORDPOLICY","Strong");
                            account1.put("NOTES","IT Security - BES Roshii..PMP API Test");
                            ACCOUNTLIST.put(account1);
                    Details.put("ACCOUNTLIST",ACCOUNTLIST);
                operation.put("Details",Details);
            inputdate.put("operation",operation);
        //System.out.println("inputdate::"+inputdate.toString());

System.out.println("Response:: "+Resource.createAccounts(resourceID,inputdate));
        
    
    }

}
