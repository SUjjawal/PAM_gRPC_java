import com.manageengine.pam360.grpc.client.User;
import com.manageengine.pam360.grpc.client.Resource;


import java.util.HashMap;
import java.util.*;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONObject;

public class DeleteAccount {
	
		
	public static void main(String[] args) throws Exception {
        Long resourceID = 2L;
        Long accountID = 4L;

        System.out.println("Response:: "+Resource.deleteAccount(resourceID,accountID));
    }

}
