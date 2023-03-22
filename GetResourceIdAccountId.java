//import com.adventnet.passtrix.pmpserver.PMPGrpcClient;
import com.manageengine.pam360.grpc.client.Resource;


import java.util.HashMap;
import java.util.*;
import java.io.File;

public class GetResourceIdAccountId {
	
		
	public static void main(String[] args) throws Exception {

        System.out.println("GetResourceIdAccountId...");
        System.out.println("Response:: "+Resource.getResourceIdAccountId(args[0],args[1]));
        //System.out.println("Response:: "+Resource.getResourceIdAccountId("RahulSonam","Ragini1"));
     
    }

}
