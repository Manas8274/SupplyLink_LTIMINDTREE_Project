package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.wecp.progressive.entity.Supplier;
import com.wecp.progressive.service.SupplierService;

public class SupplierServiceImplArraylist  implements SupplierService{

    private static List<Supplier> suppliers = new ArrayList<>();

    @Override
    public int addSupplier(Supplier supplier) {

        suppliers.add(supplier);
        return suppliers.size();
       
    }

    @Override
    public void emptyArrayList() {
        suppliers.clear();
    }

    @Override
    public List<Supplier> getAllSuppliers() {
        return suppliers;
    }

    @Override
    public void updateSupplier(Supplier supplier) {
    }

    @Override
    public  void deleteSupplier(int supplierId) {
    }

    @Override
    public Supplier getSupplierById(int supplierId) {
        return null;
    }

    @Override
    public List<Supplier> getAllSuppliersSortedByName() {
        List<Supplier> supplierSort = new ArrayList<>(suppliers);
        Collections.sort(supplierSort);
        return supplierSort;
    }

}