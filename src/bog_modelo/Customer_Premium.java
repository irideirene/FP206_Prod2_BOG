package bog_modelo;

public class Customer_Premium extends Customer {
   // private double customerFee;
    //private int customerDiscount;

    // CONSTRUCTOR
    public Customer_Premium(String firstname, String lastname, String email, String address, String idCardNumbber,
        double customerFee, int customerDiscount) {
        super(firstname, lastname, email, address, idCardNumbber, type, customerFee, customerDiscount);
        type = CustomerType.PREMIUM;

    }
    @Override
    public CustomerType getCustomerType() {
        
        return CustomerType.PREMIUM;
    }

    @Override
    public double calcAnual() {
        return customerFee;
    }

    @Override
    public float shippingDiscuount() {

        return customerDiscount;
    }

    // GETTERS & SETTERS
    public double getCustomerFee() {
        return customerFee;
    }


    public void setCustomerFee(double customerFee) {
        this.customerFee = customerFee;
    }


    public int getCustomerDiscount() {
        return customerDiscount;
    }


    public void setCustomerDiscount(int customerDiscount) {
        this.customerDiscount = customerDiscount;
    }
  
    @Override
    public String toString() {
        // Aqui no se si hacerle algun cambio, creo que el fee y el descuento deberia estar en la clase padre.
        return super.toString();
    }
}

