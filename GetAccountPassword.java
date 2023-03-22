//import com.adventnet.passtrix.pmpserver.PMPGrpcClient;
import com.manageengine.pam360.grpc.client.Resource;


import java.util.HashMap;
import java.util.*;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONObject;

public class GetAccountPassword {
	//D:\PMP\Oct7\APITests>echo %classpath%
//C:\Program Files\Java\jre1.8.0_321\lib;E:\GRPC\GRPC\lib\failureaccess-1.0.1.jar;E:\GRPC\GRPC\lib\grpc-api-1.47.0.jar;E:\GRPC\GRPC\lib\grpc-context-1.47.0.jar;E:\GRPC\GRPC\lib\grpc-core-1.47.0.jar;E:\GRPC\GRPC\lib\grpc-netty-shaded-1.47.0.jar;E:\GRPC\GRPC\lib\grpc-protobuf-1.47.0.jar;E:\GRPC\GRPC\lib\grpc-protobuf-lite-1.47.0.jar;E:\GRPC\GRPC\lib\grpc-stub-1.47.0.jar;E:\GRPC\GRPC\lib\guava-31.0.1-android.jar;E:\GRPC\GRPC\lib\perfmark-api-0.25.0.jar;E:\GRPC\GRPC\lib\protobuf-java-3.19.2.jar;E:\GRPC\GRPC\lib\proto-google-common-protos-2.0.1.jar;E:\GRPC\GRPC\pmpgrpc-0.1.jar;;D:\PMP\Oct7\;;E:\GRPC\GRPC\GRPCClient.jar;;E:\GRPC\GRPC\lib\json.jar;
		
	public static void main(String[] args) throws Exception {

    
      
    Long resourceID = 2L;
    Long accountID = 2L;
        System.out.println("");
        JSONObject inputdate = new JSONObject();
            JSONObject operation = new JSONObject();
                JSONObject details = new JSONObject();
                details.put("REASON","Need the password to Login Windows Server");
                details.put("TICKETID",7);

                operation.put("Details",details);
            inputdate.put("operation",operation);
     
      	System.out.println("Response:: "+Resource.getAccountPassword(resourceID,accountID, "test",inputdate));
         
    }

}
