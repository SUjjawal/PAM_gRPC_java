//import com.adventnet.passtrix.pmpserver.PMPGrpcClient;
import com.manageengine.pam360.grpc.client.Resource;


import java.util.HashMap;
import java.util.*;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONObject;

public class CreateResource {
		
	public static void main(String[] args) throws Exception {
        System.out.println("inside Create Resource..");
        String name = "Jerald";
        for(int i = 0; i < 1000; i++){
          System.out.println("inside name.."+name+i);
        
          JSONObject inputData = new JSONObject();
          JSONObject operation = new JSONObject();
          JSONObject details = new JSONObject();
          details.put("RESOURCENAME",name+i);
          details.put("RESOURCETYPE","Windows");
          details.put("ACCOUNTNAME","Sonali");
          details.put("PASSWORD","Sonu!23423");
          details.put("NOTES","testing.. abcbb");
          details.put("LOCATION","Kolkata");
          details.put("DNSNAME","ujjawal-0600");
          details.put("DOMAINNAME","zoho");
          details.put("ISOWNER",true);
        // details.put("RESOURCEURL","Created.zoho.com");
          details.put("DEPARTMENT","zohopmp");
          details.put("RESOURCEDESCRIPTION","Created from GRPC...");
          details.put("ISPRIVATEKEYENABLED",true);
          details.put("RESOURCEPASSWORDPOLICY","Strong");

          JSONArray resourceCustomField = new JSONArray();

          JSONObject customField6 = new JSONObject();
          customField6.put("CUSTOMLABEL", "Date A");
          customField6.put("CUSTOMVALUE", "16/04/2022");
          resourceCustomField.put(customField6);

          operation.put("RESOURCECUSTOMFIELD",resourceCustomField);
          JSONArray accountCustomField = new JSONArray();

          
          JSONObject accountField2 = new JSONObject();
          accountField2.put("CUSTOMLABEL", "UserAge");
          accountField2.put("CUSTOMVALUE", "38");
          accountCustomField.put(accountField2);

          operation.put("ACCOUNTCUSTOMFIELD",accountCustomField);
          operation.put("Details",details);
          inputData.put("operation",operation);

          System.out.println("Response:: "+Resource.createResource(inputData));
        }
    }

}
