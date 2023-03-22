import com.manageengine.pam360.grpc.client.User;
import com.manageengine.pam360.grpc.client.Resource;


import java.util.HashMap;
import java.util.*;
import java.io.File;

public class DeleteUser {
	
		
	public static void main(String[] args) throws Exception {

        System.out.println("DeleteUser...");
        Long userId = 10L;
        
        
        System.out.println("Response:: "+User.deleteUser(userId));
        //System.out.println("Response:: "+User.testing("hari-1111"));
    }

}
