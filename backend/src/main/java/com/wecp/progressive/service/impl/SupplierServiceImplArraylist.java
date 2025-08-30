package com.wecp.progressive.service.impl;

import java.util.ArrayList;
<<<<<<< HEAD
import java.util.Collections;
=======
>>>>>>> 6efc4e77b2e447b04d8756696bbf495b3d3c85a3
import java.util.List;

import com.wecp.progressive.entity.Supplier;
import com.wecp.progressive.service.SupplierService;

public class SupplierServiceImplArraylist  implements SupplierService{

<<<<<<< HEAD
    private static List<Supplier> suppliers = new ArrayList<>();

    @Override
    public int addSupplier(Supplier supplier) {

        suppliers.add(supplier);
        return suppliers.size();
       
=======
    @Override
    public int addSupplier(Supplier supplier) {
       return -1;
>>>>>>> 6efc4e77b2e447b04d8756696bbf495b3d3c85a3
    }

    @Override
    public void emptyArrayList() {
<<<<<<< HEAD
        suppliers.clear();
=======
        
>>>>>>> 6efc4e77b2e447b04d8756696bbf495b3d3c85a3
    }

    @Override
    public List<Supplier> getAllSuppliers() {
<<<<<<< HEAD
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
=======
       return new ArrayList<>();
>>>>>>> 6efc4e77b2e447b04d8756696bbf495b3d3c85a3
    }

    @Override
    public List<Supplier> getAllSuppliersSortedByName() {
<<<<<<< HEAD
        List<Supplier> supplierSort = new ArrayList<>(suppliers);
        Collections.sort(supplierSort);
        return supplierSort;
=======
        return new ArrayList<>();
>>>>>>> 6efc4e77b2e447b04d8756696bbf495b3d3c85a3
    }

}