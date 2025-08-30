package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.wecp.progressive.dao.SupplierDAO;
import com.wecp.progressive.entity.Supplier;
import com.wecp.progressive.service.SupplierService;

public class SupplierServiceImplJdbc  implements SupplierService{

    private SupplierDAO supplierDAO;

    


    public SupplierServiceImplJdbc(SupplierDAO supplierDAO) {
        this.supplierDAO = supplierDAO;
    }

    @Override
    public int addSupplier(Supplier supplier) {
        return -1;
    }

    @Override
    public void deleteSupplier(int supplierId) {
        
    }

    @Override
    public List<Supplier> getAllSuppliers() {
       return new ArrayList<>();
    }

    @Override
    public List<Supplier> getAllSuppliersSortedByName() {
       return new ArrayList<>();
    }

    @Override
    public Supplier getSupplierById(int supplierId) {
        return null;
    }

    @Override
    public void updateSupplier(Supplier supplier) {
       
    }
    
}