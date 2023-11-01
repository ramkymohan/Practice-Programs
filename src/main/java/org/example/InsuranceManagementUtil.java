package org.example;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class InsuranceManagementUtil {


    public static void registerCustomer(String customerName, String email, String address, String contact, String nomineeName, String relationship,String password,String username) {
        String sql = "INSERT INTO Customer (customer_name, email, address, contact, nominee_name, relationship,username,password) VALUES (?,?,?,?,?,?,?,?)";

        try (Connection connection = DataBaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, customerName);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, address);
            preparedStatement.setString(4, contact);
            preparedStatement.setString(5, nomineeName);
            preparedStatement.setString(6, relationship);
            preparedStatement.setString(7,username);
            preparedStatement.setString(8,password);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Customer registered successfully...");
            } else {
                System.out.println("Failed to register customer.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void customerLogin(String username, String password) {
        String sql = "SELECT customer_id,customer_name, email FROM Customer WHERE username = ? AND password = ?";

        try (Connection connection = DataBaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3));

            }
            if(resultSet!=null){
                System.out.println("Login successfully.....");
                //System.out.println(query2);
            }else{
                System.out.println("    ");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void selectPolicy() {
        Scanner scanner = new Scanner(System.in);

        // Display policy types to the user
        System.out.println("Select a Policy Type:");
        System.out.println("1. General Insurance");
        System.out.println("2. Health Insurance");
        System.out.println("3. Motor Insurance");

        int policyTypeChoice = scanner.nextInt();

        if (policyTypeChoice < 1 || policyTypeChoice > 3) {
            System.out.println("Invalid choice. Please select a valid policy type.");
            return;
        }

        // Retrieve policy details for the selected policy type
        String policyTypeName = getPolicyTypeName(policyTypeChoice);
        Policy selectedPolicy = getPolicyDetailsForType(policyTypeName);

        if (selectedPolicy != null) {
            // Display policy details to the user
            System.out.println("Selected Policy Details:");
            System.out.println("Policy Number: "+selectedPolicy.getPolicy_number());
            System.out.println("Policy Type: " + selectedPolicy.getPolicy_type());
            System.out.println("Sum Assured: " + selectedPolicy.getSum_assured());
            System.out.println("Premium Amount: " + selectedPolicy.getPremium_amount());
            System.out.println("Term: " + selectedPolicy.getTerm());
            System.out.println("Maturity Age: " + selectedPolicy.getMaturiry_age());

            System.out.print("Do you want to register this policy? (yes/no): ");
            String registerChoice = scanner.next();

            if ("yes".equalsIgnoreCase(registerChoice)) {
                // Ask for customer ID
                System.out.print("Enter your Customer ID: ");
                int customerId = scanner.nextInt();

                // Register the policy for the customer
                registerPolicyForCustomer(customerId, selectedPolicy.getPolicy_id());
            }
        } else {
            System.out.println("Policy not found for the selected type.");
        }
    }

    public static String getPolicyTypeName(int choice) {
        switch (choice) {
            case 1:
                return "General Insurance";
            case 2:
                return "Health Insurance";
            case 3:
                return "Motor Insurance";
            default:
                return null;
        }
    }

    public static Policy getPolicyDetailsForType(String policyTypeName) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = DataBaseConnection.getConnection();
            String query = "SELECT policy_id,policy_number, sum_assured, premium_amount, term, maturity_age FROM Policy WHERE policy_type = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, policyTypeName);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                Policy policy = new Policy();
                policy.setPolicy_type(policyTypeName);
                policy.setPolicy_id(resultSet.getInt("policy_id"));
                policy.setPolicy_number(resultSet.getInt("policy_number"));
                policy.setSum_assured(resultSet.getDouble("sum_assured"));
                policy.setPremium_amount(resultSet.getDouble("premium_amount"));
                policy.setTerm(resultSet.getInt("term"));
                policy.setMaturiry_age(resultSet.getInt("maturity_age"));
                return policy;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return null; // Policy not found for the given type
    }
    public static void registerPolicyForCustomer(int customerId, int policyId) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DataBaseConnection.getConnection();
            String query = "INSERT INTO Customer_Policy (customer_id, policy_id) VALUES (?, ?)";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, customerId);
            preparedStatement.setInt(2, policyId);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Policy registered for the customer.");
            } else {
                System.out.println("Failed to register the policy for the customer.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void viewPolicies() {
        String sql = "SELECT policy_id, policy_type, sum_assured, premium_amount, term, maturity_age FROM Policy";

        try (Connection connection = DataBaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int policyId = resultSet.getInt("policy_id");
                String policyType = resultSet.getString("policy_type");
                double sumAssured = resultSet.getDouble("sum_assured");
                double premiumAmount = resultSet.getDouble("premium_amount");
                int term = resultSet.getInt("term");
                int maturityAge = resultSet.getInt("maturity_age");

                System.out.println("Policy ID: " + policyId);
                System.out.println("Policy Type: " + policyType);
                System.out.println("Sum Assured: " + sumAssured);
                System.out.println("Premium Amount: " + premiumAmount);
                System.out.println("Term: " + term);
                System.out.println("Maturity Age: " + maturityAge);
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
