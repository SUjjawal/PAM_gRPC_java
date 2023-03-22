//import com.adventnet.passtrix.pmpserver.PMPGrpcClient;
import com.manageengine.pam360.grpc.client.Resource;


import java.util.HashMap;
import java.util.*;
import java.io.File;

public class DeleteResource {
	//D:\PMP\Oct7\APITests>echo %classpath%
//C:\Program Files\Java\jre1.8.0_321\lib;E:\GRPC\GRPC\lib\failureaccess-1.0.1.jar;E:\GRPC\GRPC\lib\grpc-api-1.47.0.jar;E:\GRPC\GRPC\lib\grpc-context-1.47.0.jar;E:\GRPC\GRPC\lib\grpc-core-1.47.0.jar;E:\GRPC\GRPC\lib\grpc-netty-shaded-1.47.0.jar;E:\GRPC\GRPC\lib\grpc-protobuf-1.47.0.jar;E:\GRPC\GRPC\lib\grpc-protobuf-lite-1.47.0.jar;E:\GRPC\GRPC\lib\grpc-stub-1.47.0.jar;E:\GRPC\GRPC\lib\guava-31.0.1-android.jar;E:\GRPC\GRPC\lib\perfmark-api-0.25.0.jar;E:\GRPC\GRPC\lib\protobuf-java-3.19.2.jar;E:\GRPC\GRPC\lib\proto-google-common-protos-2.0.1.jar;E:\GRPC\GRPC\pmpgrpc-0.1.jar;;D:\PMP\Oct7\;;E:\GRPC\GRPC\GRPCClient.jar;;E:\GRPC\GRPC\lib\json.jar;
		
	public static void main(String[] args) throws Exception {

    
     
        Long resourceID = 1L;
		for(int i= 4000; i< 5000 ; i++){
			Long resId = Long.valueOf(i);
			System.out.println("Response:: "+Resource.deleteResource(resId));
		}
      	
         
    }

}
