package bog_modelo;

import java.util.ArrayList;

public abstract class Customer {
    protected String firstname;
    protected String lastname;
    protected String email;
    protected String address;
    protected String idCardNumbber;
    protected static CustomerType type;
    protected ArrayList<Order> orders;

    protected double customerFee;
    protected int customerDiscount;
    


    // CONSTRUCTOR
    public Customer(String firstname, String lastname, String email, String address, String idCardNumbber, CustomerType type, double customerFee, int customerDiscount) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.address = address;
        this.idCardNumbber = idCardNumbber;
        orders = new ArrayList<Order>();
        
        this.customerFee = customerFee;
        this.customerDiscount = customerDiscount; 
    }


    // CUSTOMER TYPE CHECK
    public abstract CustomerType getCustomerType();
    public abstract double calcAnual();
    public abstract float shippingDiscuount();
//********************************************************************************************************* */
 /*  Según demanda del producto faltarían los métodos:

        
        
        

 */

    // SETTERS & GETTERS
    public String getFirstname() {
        return firstname;
    }


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


    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }


    public String getLastname() {
        return lastname;
    }


    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public String getIdCardNumbber() {
        return idCardNumbber;
    }


    public void setIdCardNumbber(String idCardNumbber) {
        this.idCardNumbber = idCardNumbber;
    }


    @Override
    public String toString() {
        return "Order [firstName=" + firstname + ", lastName=" + lastname + ", email=" + email + ", addres="
                + address + ", idCardNumber=" + idCardNumbber + ", CustomerType=" + type.toString() + "]";
    }
    
}

