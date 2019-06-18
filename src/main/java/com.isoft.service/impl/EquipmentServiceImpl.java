package com.isoft.service.impl;

import com.isoft.dao.IEquipmentDAO;
import com.isoft.service.IEquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service("equipmentService")
public class EquipmentServiceImpl implements IEquipmentService {
    @Autowired
    IEquipmentDAO equipmentDAO;

    @Override
    public List<Map<String, Object>> findAllEquipment(int page, int pageSize) {
        return equipmentDAO.findAllEquipment(page,pageSize);
    }

    @Override
    public Map<String, Object> findEquipmentCount() {
        return equipmentDAO.findEquipmentCount();
    }

    @Override
    public int deleteEquipmentInfoById(int id) {
        return equipmentDAO.deleteEquipmentInfoById(id);
    }

    @Override
    public List<Map<String, Object>> equipmentTotal() {
        return equipmentDAO.equipmentTotal();
    }
    @Override
    public List<Map<String, Object>> equipmentTotal2() {
        return equipmentDAO.equipmentTotal2();
    }

    @Override
    public List<Map<String, Object>> findinfo(int id) {
        return equipmentDAO.findinfo(id);
    }

    @Override
    public boolean addinfo(String name, String local) {
        boolean temp=equipmentDAO.addinfo(name,local);
        return temp;
    }

}
