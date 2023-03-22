import com.manageengine.pam360.grpc.client.User;
import com.manageengine.pam360.grpc.client.Resource;


import java.util.HashMap;
import java.util.*;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONObject;

public class EditAccount {
	
		
	public static void main(String[] args) throws Exception {
   //     Long resourceID = Long.parseLong(args[0]);
    //    Long accountID = Long.parseLong(args[1]);
        Long resourceID = 2L;
        Long accountID = 2L;
   // "ACCOUNTCUSTOMFIELD" : [ { "CUSTOMLABEL" : "Secure Account", "CUSTOMVALUE" : "YES" } ]
        JSONObject inputdate = new JSONObject();
            JSONObject operation = new JSONObject();
                JSONObject account = new JSONObject();
                            account.put("ACCOUNTNAME","Sonuuffffff");
                        //    account.put("PASSWORD","Pa$$weeeord@123");
                            account.put("ACCOUNTPASSWORDPOLICY","Strong");
                            account.put("NOTES","Updateinggg- BES PMP API TestUpdate  ");
                            JSONArray ACCOUNTCUSTOMFIELD = new JSONArray();
                                JSONObject customField = new JSONObject();
                                customField.put("CUSTOMLABEL","Secure Account");
                                customField.put("CUSTOMVALUE","YES");
                                ACCOUNTCUSTOMFIELD.put(customField);  
                            account.put("ACCOUNTCUSTOMFIELD",ACCOUNTCUSTOMFIELD);
                   /*    JSONObject account1 = new JSONObject();
                            account1.put("ACCOUNTNAME","Roshni");
                       //     account1.put("PASSWORD","Pa$$WRoshini@123");
                            account1.put("ACCOUNTPASSWORDPOLICY","Strong");
                            account1.put("NOTES","IT Security - BES Roshii..PMP API Test");
                            JSONArray ACCOUNTCUSTOMFIELD = new JSONArray();
                                JSONObject customField = new JSONObject();
                                customField.put("CUSTOMLABEL","Secure Account");
                                customField.put("CUSTOMVALUE","YES");
                                ACCOUNTCUSTOMFIELD.put(customField);  
                                account1.put("ACCOUNTCUSTOMFIELD",ACCOUNTCUSTOMFIELD);
                            ACCOUNTLIST.put(account1);*/
                operation.put("Details",account);
            inputdate.put("operation",operation);
        System.out.println("inputdate::"+inputdate.toString());

        System.out.println("Response:: "+Resource.editAccount(resourceID,accountID,inputdate));
    }

}
