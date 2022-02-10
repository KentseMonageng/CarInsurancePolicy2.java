public class CarInsurancePolicy {
    // Set Data to private because it is sensitive data
    private int policyNumber;
    private int numPayments;
    private String residentCity;


    public CarInsurancePolicy(int num, int payments, String city) {
        policyNumber = num;
        numPayments = payments;
        residentCity = city;
    }

    public CarInsurancePolicy(int num, int payments) {
        policyNumber = num;
        numPayments = payments;
        residentCity = "Mayfield";
    }

    public CarInsurancePolicy(int num) {
        policyNumber = num;
        numPayments = 2;
        residentCity = "Mayfield";
    }

    public void display() {
        System.out.println("Policy number " + policyNumber + numPayments + "payments anually. Driver Resides in "
                + residentCity);
    }
}
