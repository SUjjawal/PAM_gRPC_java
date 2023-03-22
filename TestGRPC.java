//import com.adventnet.passtrix.pmpserver.PMPGrpcClient;
import com.manageengine.pam360.grpc.client.Resource;


import java.util.HashMap;
import java.util.*;
import java.io.File;

public class TestGRPC {
	
		
	public static void main(String[] args) throws Exception {

    
        HashMap resourceMap = new HashMap();
        resourceMap.put("RESOURCENAME",args[0]);
        resourceMap.put("RESOURCETYPE","Windows");
        resourceMap.put("ACCOUNTNAME","Sonali");
        resourceMap.put("PASSWORD","Sonu!23423");
        resourceMap.put("NOTES","testing.. abcbb");
        resourceMap.put("LOCATION","Kolkata");
        resourceMap.put("DNSNAME","ujjawal-0600");
        resourceMap.put("DOMAINNAME","zoho");
        resourceMap.put("ISOWNER",true);
        resourceMap.put("RESOURCEURL","updated.zoho.com");
        resourceMap.put("DEPARTMENT","zohopmp");
        resourceMap.put("RESOURCEDESCRIPTION","Updated from GRPC...");
        resourceMap.put("ISPRIVATEKEYENABLED","true");
     //   Nov 15, 2022
        List<HashMap> resourceCustomFieldL = new ArrayList<HashMap>();
        HashMap customField1 = new HashMap();
				customField1.put("CUSTOMLABEL", "CompanyCode");
				customField1.put("CUSTOMVALUE", "COM_zoho");
        resourceCustomFieldL.add(customField1);

		HashMap customField2 = new HashMap();
				customField2.put("CUSTOMLABEL", "ResourceCodeU");
				customField2.put("CUSTOMVALUE", "Res_00011");
        resourceCustomFieldL.add(customField2);

        HashMap customField3 = new HashMap();
        customField3.put("CUSTOMLABEL", "Name");
        customField3.put("CUSTOMVALUE", "Rahul");
        resourceCustomFieldL.add(customField3);

        HashMap customField4 = new HashMap();
        customField4.put("CUSTOMLABEL", "Team");
        customField4.put("CUSTOMVALUE", "API");
        resourceCustomFieldL.add(customField4);

        HashMap customField5 = new HashMap();
        customField5.put("CUSTOMLABEL", "Date1");
        customField5.put("CUSTOMVALUE", "19/02/2022");
        resourceCustomFieldL.add(customField5);

        HashMap customField6 = new HashMap();
        customField6.put("CUSTOMLABEL", "Date A");
        customField6.put("CUSTOMVALUE", "16/04/2022");
        resourceCustomFieldL.add(customField6);
/*
        HashMap customField7 = new HashMap();
        String path = "D:\\Certificate\\root2\\client\\ca.crt";
        File cf = new File(path);
        customField7.put("CUSTOMLABEL", "CertFile");
        customField7.put("CUSTOMVALUE", path);
        resourceCustomFieldL.add(customField7);
     */
    
    
        resourceMap.put("RESOURCECUSTOMFIELDL11",resourceCustomFieldL);

        List<HashMap> accountCustomField = new ArrayList<HashMap>();
        HashMap accountField1 = new HashMap();
				accountField1.put("CUSTOMLABEL", "UserCode");
				accountField1.put("CUSTOMVALUE", "Usr-ujj");
        accountCustomField.add(accountField1);

        HashMap accountField2 = new HashMap();
				accountField2.put("CUSTOMLABEL", "UserAge");
				accountField2.put("CUSTOMVALUE", "38");
        accountCustomField.add(accountField2);

        resourceMap.put("ACCOUNTCUSTOMFIELD11",accountCustomField);

        HashMap osDetails= new HashMap();
        osDetails.put("OLDOSTYPE","windows");
        osDetails.put("SYNCTYPE","windowsdomain");
        osDetails.put("OSTYPE","windows");
        resourceMap.put("OSDETAILS",osDetails);

        System.out.println("resourceMap:: "+resourceMap.toString());
        System.out.println("");
     //   System.out.println("Response:: "+Resource.createResource(resourceMap));
     
      	//System.out.println("Response:: "+Resource.editResource(resourceMap));
         
        //System.out.println("TestGRPC Testing...:: GetResourceIDbyResourceName()");
      //  System.out.println("getResourceID...:: "+Resource.getResourceID(args[0]));
        //System.out.println("TestGRPC Testing..."+PMPGrpcClient.createResource(resourceMap));

    //    System.out.println("TestGRPC Testing..."+PMPGrpcClient.createResource(args[0],"Linux","asdas","asdas","asdas"));
    }

}
