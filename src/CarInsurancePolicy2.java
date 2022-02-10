public class CarInsurancePolicy2 {
    // Set Data to private because it is sensitive data
    private int policyNumber;
    private int numPayments;
    private String residentCity;


    public CarInsurancePolicy2(int num, int payments, String city)
    {
        policyNumber = num;
        numPayments = payments;
        residentCity = city;
    }

    public CarInsurancePolicy2(int num, int payments)
    {
        this(num,payments,"Mayfied");
    }

    public CarInsurancePolicy2(int num)
    {
        this(num,2,"MayField");
    }

    public void display() {
        System.out.println("Policy number " + policyNumber + numPayments + "payments anually. Driver Resides in "
                + residentCity);
    }
}
