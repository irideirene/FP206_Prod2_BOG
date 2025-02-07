package bog_modelo;

import java.time.LocalDateTime;
import java.time.LocalDate;

public class Order {
    private String orderID;
    private Product product; 
    private Customer customer;
    private int product_qty;
    private double subtotal;
    private double shipingFee;
    private LocalDateTime creationDataTime;
    private int handlingTime;
    private boolean isSent;

    // CONSTRUCTOR
    public Order(String orderID, Product product, Customer customer, int product_qty, double subtotal, double shipingFee,
            LocalDateTime creationDataTime, int handlingTime) {
        this.orderID = orderID;
        this.product = product;
        this.customer = customer;
        this.product_qty = product_qty;
        this.subtotal = subtotal;
        this.shipingFee = shipingFee;
        this.creationDataTime = creationDataTime;
        this.handlingTime = handlingTime;
    }

    // CHECKERS - Comprueban las políticas de negocio y calculan resultados

    public boolean isCancellable(){

        return !isSent; //Si esta enviado, no se puede cancelar. Así de simple

    }

    public boolean clientExists(){

       return false; 
    }

    public double calculateShipping(){
        double ret;
        ret = this.shipingFee;

        return ret;
    }

    public double calculateOrderTotal(){
        double orderTotal;
        //El total del pedido es el precio del pedido segun las veces que se haya pedido + los gastos de envio, aplicando el descuento (puede ser descuento = 0)
        orderTotal = product_qty * this.product.getPrice() + (shipingFee -((shipingFee * customer.getCustomerDiscount())/100)) ;

        return orderTotal;

    }
    public boolean orderSent(){
        //Primero convertimos el handlingTime a LocalDateTime. NO SE COMOOO
        //LocalDateTime 
        if(LocalDateTime.now().compareTo(creationDataTime ) > 0){
            isSent = true;
        }
        else{
            isSent = false;
        }
        return isSent;
    }
//************************************************************************************
 /*
 Según demanda del producto faltarían los métodos:
        

 */





    // GETTERS & SETTERS

    public String getorderID() {
        return orderID;
    }




    public void setorderID(String orderID) {
        this.orderID = orderID;
    }




    public Product getProduct() {
        return product;
    }




    public void setProduct(Product product) {
        this.product = product;
    }




    public Customer getCustomer() {
        return customer;
    }




    public void setCustomer(Customer customer) {
        this.customer = customer;
    }




    public int getProduct_qty() {
        return product_qty;
    }




    public void setProduct_qty(int product_qty) {
        this.product_qty = product_qty;
    }




    public double getSubtotal() {
        return subtotal;
    }




    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }




    public double getShipingFee() {
        return shipingFee;
    }




    public void setShipingFee(double shipingFee) {
        this.shipingFee = shipingFee;
    }




    public LocalDateTime getcreationDataTime() {
        return creationDataTime;
    }




    public void setcreationDataTime(LocalDateTime creationDataTime) {
        this.creationDataTime = creationDataTime;
    }




    public int gethandlingTime() {
        return handlingTime;
    }




    public void sethandlingTime(int handlingTime) {
        this.handlingTime = handlingTime;
    }

    public boolean getIsSended() {
        return isSent;
    }


    @Override
    public String toString() {
        return "Order [creationDataTime=" + creationDataTime + ", customer=" + customer + ", handlingTime=" + handlingTime + ", product="
                + product + ", product_qty=" + product_qty + ", shipingFee=" + shipingFee + ", orderID=" + orderID
                + ", subtotal=" + subtotal + ", sended= " + isSent + "]";
    }



    
    

    


    
}
