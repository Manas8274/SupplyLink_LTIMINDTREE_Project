package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD
import com.wecp.progressive.dao.ProductDAO;
=======
>>>>>>> 6efc4e77b2e447b04d8756696bbf495b3d3c85a3
import com.wecp.progressive.entity.Product;
import com.wecp.progressive.service.ProductService;

public class ProductServiceImplJdbc  implements ProductService{

<<<<<<< HEAD
    private ProductDAO productDAO;

    public ProductServiceImplJdbc( ProductDAO productDAO){
        this.productDAO = productDAO;
    }

=======
>>>>>>> 6efc4e77b2e447b04d8756696bbf495b3d3c85a3
    @Override
    public int addProduct(Product product) {
        
        return 0;
    }

    @Override
    public void deleteProduct(int productId) {
        
        
    }

    @Override
    public List<Product> getAllProducts() {
        return new ArrayList<>();
    }

    @Override
    public Product getProductById(int productId) {
        
        return null;
    }

    @Override
    public void updateProduct(Product product) {
      
        
    }

}