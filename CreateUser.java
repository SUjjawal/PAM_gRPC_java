import com.manageengine.pam360.grpc.client.User;
import com.manageengine.pam360.grpc.client.Resource;


import java.util.HashMap;
import java.util.*;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONObject;

public class CreateUser {
	
		
	public static void main(String[] args) throws Exception {

        System.out.println("GetResourceIdAccountId...");
        String userName = "Sonali";
        String firstName ="Sonali";
        String lastName = "Sarkar";
        String fullName= "Sonali Sarkar";
        String email ="Sonali@gmail.com";
        String policy = "Strong";
        String role = "Password User";
        Boolean isSupperAdmin = true;
        String password = "Sonali&Sarkar";
        String department ="PMP";
        String location ="Delhi";
        Boolean isApiUser = true;
        String hostName ="Sonali-3457";
        String expiryDate = "2025-12-14";


        JSONObject inputdate = new JSONObject();
            JSONObject operation = new JSONObject();
                JSONObject user = new JSONObject();

                user.put("USERNAME",userName);
                user.put("FIRSTNAME",firstName);
                user.put("LASTNAME",lastName);
                user.put("FULLNAME",fullName);
                user.put("EMAIL",email);
                user.put("POLICY",policy);
                user.put("ROLE",role);
                user.put("ISSUPERADMIN",isSupperAdmin);
                user.put("PASSWORD",password);
                user.put("DEPARTMENT",department);
                user.put("LOCATION",location);
                user.put("ISAPIUSER",isApiUser);
                user.put("HOSTNAME",hostName);
                user.put("EXPIRYDATE",expiryDate);
                operation.put("Details",user);
            inputdate.put("operation",operation);
        System.out.println("inputdate::"+inputdate.toString());
        
        
        System.out.println("Response:: "+User.createUser(inputdate));
        //System.out.println("Response:: "+User.testing("hari-1111"));
    }

}
