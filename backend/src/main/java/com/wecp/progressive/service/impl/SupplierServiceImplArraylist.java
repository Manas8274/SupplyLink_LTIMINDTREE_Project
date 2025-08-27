package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.wecp.progressive.entity.Supplier;
import com.wecp.progressive.service.SupplierService;

public class SupplierServiceImplArraylist  implements SupplierService{

    @Override
    public int addSupplier(Supplier supplier) {
       return -1;
    }

    @Override
    public void emptyArrayList() {
        
    }

    @Override
    public List<Supplier> getAllSuppliers() {
       return new ArrayList<>();
    }

    @Override
    public List<Supplier> getAllSuppliersSortedByName() {
        return new ArrayList<>();
    }

}