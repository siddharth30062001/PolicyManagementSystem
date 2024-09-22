package PolicyManagementSystem;
import java.util.Date;

public class Policy {

    private String policyID;
    private String type;
    private double premium;
    private double coverageAmount;
    private Date expiryDate;

    Policy(String policyID, String type, double premium, double coverageAmount, Date expiryDate){
        this.policyID=policyID;
        this.type=type;
        this.premium=premium;
        this.coverageAmount=coverageAmount;
        this.expiryDate=expiryDate;
    }
    
    public String getID(){   
        return policyID;
    }

    public String getType(){   
        return type;
    }

    public double getPremium(){   
        return premium;
    }


    public double getCoverageAmount(){   
        return coverageAmount;
    }


    public Date getExpiryDate(){   
        return expiryDate;
    }

    @Override
    public String toString() {
        return "Policy ID: " + policyID + ", Type: " + type + ", Premium: $" + premium + 
                ", Coverage: $" + coverageAmount + ", Expiry: " + expiryDate;
    }
}
