package com.wecp.progressive.service.impl;

import java.util.ArrayList;
<<<<<<< HEAD
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.wecp.progressive.entity.Supplier;
=======
import java.util.List;

>>>>>>> 6efc4e77b2e447b04d8756696bbf495b3d3c85a3
import com.wecp.progressive.entity.Warehouse;
import com.wecp.progressive.service.WarehouseService;

public class WarehouseServiceImplArraylist  implements WarehouseService{

<<<<<<< HEAD
    private static List<Warehouse> warehouses = new ArrayList<>();

    @Override
    public int addWarehouse(Warehouse warehouse) {
        warehouses.add(warehouse);
        return warehouses.size();
=======
    @Override
    public int addWarehouse(Warehouse warehouse) {
        return -1;
>>>>>>> 6efc4e77b2e447b04d8756696bbf495b3d3c85a3
    }

    @Override
    public void emptyArrayList() {
<<<<<<< HEAD
        warehouses.clear();
=======
        
>>>>>>> 6efc4e77b2e447b04d8756696bbf495b3d3c85a3
    }

    @Override
    public List<Warehouse> getAllWarehouses() {
<<<<<<< HEAD
        return warehouses;
    }


    @Override
    public List<Warehouse> getWarehousesSortedByCapacity() {
        List<Warehouse> sortedWareHouse = new ArrayList<>(warehouses);
        sortedWareHouse.sort(Comparator.comparing(Warehouse::getCapacity));
        return sortedWareHouse;
=======
        return new ArrayList<>();
    }

    @Override
    public List<Warehouse> getWarehousesSortedByCapacity() {
        return new ArrayList<>();
>>>>>>> 6efc4e77b2e447b04d8756696bbf495b3d3c85a3
    }
    
}