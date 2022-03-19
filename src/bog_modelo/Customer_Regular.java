package bog_modelo;

public class Customer_Regular extends Customer{

    // CONSTRUCTOR
    public Customer_Regular (String firstname, String lastname, String email, String address, String idCardNumbber, double customerFee, int customerDiscount){
        super(firstname, lastname, email, address, idCardNumbber,type, customerFee, customerDiscount);
        type = CustomerType.REGULAR;
        
    }

    @Override
    public CustomerType getCustomerType() {
        
        return CustomerType.REGULAR;
    }

    @Override
    public double calcAnual() {
        return 0.0f;
    }

    @Override
    public float shippingDiscuount() {
        return 0;
    }

    @Override
    public String toString() {
        
        return super.toString();
    }
    
}
