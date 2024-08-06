package insurancepolicydatamanagement.com;

public class Policy
{
    String policy_Id, policy_holder_name;
    int policy_amount;

    public Policy(String policy_Id, String policy_holder_name, int policy_amount) {
        this.policy_Id = policy_Id;
        this.policy_holder_name = policy_holder_name;
        this.policy_amount = policy_amount;
    }

    public String getPolicy_Id() {
        return policy_Id;
    }

    public void setPolicy_Id(String policy_Id) {
        this.policy_Id = policy_Id;
    }

    public String getPolicy_holder_name() {
        return policy_holder_name;
    }

    public void setPolicy_holder_name(String policy_holder_name) {
        this.policy_holder_name = policy_holder_name;
    }

    public int getPolicy_amount() {
        return policy_amount;
    }

    public void setPolicy_amount(int policy_amount) {
        this.policy_amount = policy_amount;
    }
}
