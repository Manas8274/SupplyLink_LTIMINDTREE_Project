package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.wecp.progressive.entity.Product;
import com.wecp.progressive.service.ProductService;

public class ProductServiceImplJdbc  implements ProductService{

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