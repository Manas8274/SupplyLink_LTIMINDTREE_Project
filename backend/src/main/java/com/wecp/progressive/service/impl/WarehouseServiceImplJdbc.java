package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.wecp.progressive.dao.WarehouseDAO;
import com.wecp.progressive.entity.Warehouse;
import com.wecp.progressive.service.WarehouseService;

public class WarehouseServiceImplJdbc implements WarehouseService {

    private WarehouseDAO warehouseDAO;
    
    public WarehouseServiceImplJdbc(WarehouseDAO warehouseDAO) {
        this.warehouseDAO = warehouseDAO;
    }

    @Override
    public int addWarehouse(Warehouse warehouse) {
        return -1;
    }

    @Override
    public void deleteWarehouse(int warehouseId) {
        
    }

    @Override
    public List<Warehouse> getAllWarehouses() {
        return List.of();
    }

    @Override
    public Warehouse getWarehouseById(int warehouseId) {
       return null;
    }

    @Override
    public List<Warehouse> getWarehouseBySupplier(int supplierId) {
        return null;
    }

    

    @Override
    public void updateWarehouse(Warehouse warehouse) {
        
    }

    @Override
    public List<Warehouse> getWarehousesSortedByCapacity() {
        return new ArrayList<>();
    }

}