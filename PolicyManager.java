package PolicyManagementSystem;

import java.util.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class PolicyManager {

    private HashMap<String,Policy> policyByID;
    private TreeMap<Date,Policy> policyByExpiryDate;
    private LinkedHashMap<String, Policy> insertionOrderPolicies;

    public PolicyManager() {
        policyByID = new HashMap<>();
        policyByExpiryDate = new TreeMap<>();
        insertionOrderPolicies = new LinkedHashMap<>();
    }

    public void addPolicy(Policy policy){
        policyByID.put(policy.getID(), policy);
        policyByExpiryDate.put(policy.getExpiryDate(), policy);
        insertionOrderPolicies.put(policy.getID(), policy);
    }

    public void removePolicy(String policyId) {
        Policy policy = policyByID.get(policyId);
        if (policy != null) {
            policyByID.remove(policyId);
            policyByExpiryDate.remove(policy.getExpiryDate());
            insertionOrderPolicies.remove(policyId);
        }
    }

    
    public void displayPoliciesById() {
        System.out.println("Policies stored by ID (HashMap):");
        for (Policy policy : policyByID.values()) {
            System.out.println(policy);
        }
    }

    
    public void displayPoliciesByExpiryDate() {
        System.out.println("Policies sorted by expiry date (TreeMap):");
        for (Policy policy : policyByExpiryDate.values()) {
            System.out.println(policy);
        }
    }

    
    public void displayPoliciesInOrder() {
        System.out.println("Policies in insertion order (LinkedHashMap):");
        for (Policy policy : insertionOrderPolicies.values()) {
            System.out.println(policy);
        }
    }


    
}
