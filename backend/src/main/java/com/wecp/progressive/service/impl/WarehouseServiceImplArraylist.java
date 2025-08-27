package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.wecp.progressive.entity.Warehouse;
import com.wecp.progressive.service.WarehouseService;

public class WarehouseServiceImplArraylist  implements WarehouseService{

    @Override
    public int addWarehouse(Warehouse warehouse) {
        return -1;
    }

    @Override
    public void emptyArrayList() {
        
    }

    @Override
    public List<Warehouse> getAllWarehouses() {
        return new ArrayList<>();
    }

    @Override
    public List<Warehouse> getWarehousesSortedByCapacity() {
        return new ArrayList<>();
    }
    
}