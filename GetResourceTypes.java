//import com.adventnet.passtrix.pmpserver.PMPGrpcClient;
import com.manageengine.pam360.grpc.client.Resource;


import java.util.HashMap;
import java.util.*;
import java.io.File;

import org.json.JSONArray;
import org.json.JSONObject;

public class GetResourceTypes {
	
		
	public static void main(String[] args) throws Exception {

        System.out.println("inside GetResourceTypes");
        JSONObject inputData = new JSONObject();
        JSONObject operation = new JSONObject();
        JSONObject resourceMap = new JSONObject();
        JSONArray resTypeNames = new JSONArray();
        resTypeNames.put("brocade");
        resourceMap.put("RESOURCETYPE_CONTAINING",resTypeNames);
        operation.put("Details",resourceMap);
        inputData.put("operation",operation);
        System.out.println("Response:: "+Resource.getResourceTypes(inputData,"MSP"));
     
    }

}
