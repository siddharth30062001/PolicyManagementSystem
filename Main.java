package PolicyManagementSystem;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        PolicyManager policyManager = new PolicyManager();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Policy policy1 = new Policy("P001", "Health", 5000, 100000, dateFormat.parse("2024-06-21"));
        Policy policy2 = new Policy("P002", "Life", 3000, 200000, dateFormat.parse("2026-08-2") );
        Policy policy3 = new Policy("P003","Education",9000,500,dateFormat.parse("2025-06-1"));


        policyManager.addPolicy(policy1);
        policyManager.addPolicy(policy2);
        policyManager.addPolicy(policy3);

        // Display policies by ID
        policyManager.displayPoliciesById();
        
        // Display policies by expiry date
        policyManager.displayPoliciesByExpiryDate();
        
        // Display policies in insertion order
        policyManager.displayPoliciesInOrder();
    }
    
}
