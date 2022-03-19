/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bog_modelo;

import java.util.Iterator;
/**
 *
 * @author irene
 */
public class ProductList extends List<Product>  {
    
    public void añadir(Product product) throws Exception {
        if (contains(product.getproductID())){
            throw new Exception("El articulo ya existe");
        }
        else this.list.add(product);
    }
           
    public boolean contains(String productID) {
        for(Iterator iter = this.list.iterator(); iter.hasNext();) {
            Product p = (Product) iter.next();
            if(p.getproductID().equals(productID)){
               return true;
            }
        }       
        return false;
    }
}
