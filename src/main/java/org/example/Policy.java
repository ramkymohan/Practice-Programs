package org.example;

public class Policy {
    int policy_id;
    int policy_number;
    String policy_type;
    Double sum_assured;
    Double premium_amount;
    int term;
    int maturiry_age;

    public int getPolicy_id() {
        return policy_id;
    }

    public void setPolicy_id(int policy_id) {
        this.policy_id = policy_id;
    }

    public int getPolicy_number() {
        return policy_number;
    }

    public void setPolicy_number(int policy_number) {
        this.policy_number = policy_number;
    }

    public String getPolicy_type() {
        return policy_type;
    }

    public void setPolicy_type(String policy_type) {
        this.policy_type = policy_type;
    }

    public Double getSum_assured() {
        return sum_assured;
    }

    public void setSum_assured(Double sum_assured) {
        this.sum_assured = sum_assured;
    }

    public Double getPremium_amount() {
        return premium_amount;
    }

    public void setPremium_amount(Double premium_amount) {
        this.premium_amount = premium_amount;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public int getMaturiry_age() {
        return maturiry_age;
    }

    public void setMaturiry_age(int maturiry_age) {
        this.maturiry_age = maturiry_age;
    }
}
