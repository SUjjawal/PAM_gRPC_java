//import com.adventnet.passtrix.pmpserver.PMPGrpcClient;
import com.manageengine.pam360.grpc.client.Resource;


import java.util.HashMap;
import java.util.*;
import java.io.File;

public class GetResourceID {
	
		
	public static void main(String[] args) throws Exception {

        
        System.out.println("");
        System.out.println("getResourceID...:: "+Resource.getResourceID(args[0]));
    }

}
