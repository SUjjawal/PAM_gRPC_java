import com.manageengine.pam360.grpc.client.User;
import com.manageengine.pam360.grpc.client.Resource;


import java.util.HashMap;
import java.util.*;
import java.io.File;

public class GetUserID {
	
		
	public static void main(String[] args) throws Exception {

        System.out.println("GetResourceIdAccountId...");
        String userName = "Sonali";
        
        
        System.out.println("Response:: "+User.getUserId(userName));
        //System.out.println("Response:: "+User.testing("hari-1111"));
    }

}
