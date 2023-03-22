//import com.adventnet.passtrix.pmpserver.PMPGrpcClient;
import com.manageengine.pam360.grpc.client.Resource;


import java.util.HashMap;
import java.util.*;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONObject;

public class EditResource {
	
		
	public static void main(String[] args) throws Exception {

      JSONObject inputData = new JSONObject();
        JSONObject operation = new JSONObject();
        JSONObject resourceMap = new JSONObject();
        Long resourceID = 2L;
        resourceMap.put("RESOURCENAME",args[0]);
        resourceMap.put("RESOURCETYPE","Windows");
        resourceMap.put("LOCATION","Kolkata");
        resourceMap.put("DNSNAME","ujjawal-0600");
        resourceMap.put("DOMAINNAME","zoho");
      //  resourceMap.put("RESOURCEURL","updated.zoho.com");
      resourceMap.put("OWNERNAME","Hari");  
        resourceMap.put("DEPARTMENT","zohopmp");
        resourceMap.put("RESOURCEDESCRIPTION","Agaiin Updated from GRPC...");
     //   Nov 15, 2022
     JSONArray resourceCustomFieldL = new JSONArray();
        JSONObject customField1 = new JSONObject();
				customField1.put("CUSTOMLABEL", "CompanyCode");
				customField1.put("CUSTOMVALUE", "COM_Google");
        resourceCustomFieldL.put(customField1);

        JSONObject customField2 = new JSONObject();
				customField2.put("CUSTOMLABEL", "ResourceCodeU");
				customField2.put("CUSTOMVALUE", "Res_44444");
        resourceCustomFieldL.put(customField2);

        JSONObject customField3 = new JSONObject();
        customField3.put("CUSTOMLABEL", "Name");
        customField3.put("CUSTOMVALUE", "Kishore");
        resourceCustomFieldL.put(customField3);

        JSONObject customField4 = new JSONObject();
        customField4.put("CUSTOMLABEL", "Team");
        customField4.put("CUSTOMVALUE", "ENtertainment");
        resourceCustomFieldL.put(customField4);

        JSONObject customField5 = new JSONObject();
        customField5.put("CUSTOMLABEL", "Date1");
        customField5.put("CUSTOMVALUE", "19/02/1786");
        resourceCustomFieldL.put(customField5);

        JSONObject customField6 = new JSONObject();
        customField6.put("CUSTOMLABEL", "Date A");
        customField6.put("CUSTOMVALUE", "16/04/1237");
        resourceCustomFieldL.put(customField6);
    
    
        resourceMap.put("RESOURCECUSTOMFIELD",resourceCustomFieldL);

        operation.put("Details",resourceMap);
        inputData.put("operation",operation);
        System.out.println("resourceMap:: "+inputData.toString());
        System.out.println("");
     
      	System.out.println("Response:: "+Resource.editResource(resourceID,inputData));
         
    }

}
