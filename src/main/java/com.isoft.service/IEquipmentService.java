package com.isoft.service;

import java.util.List;
import java.util.Map;

public interface IEquipmentService {
    List<Map<String,Object>> findAllEquipment(int page, int pageSize);
    Map<String,Object> findEquipmentCount();
    int deleteEquipmentInfoById(int id);
    List<Map<String,Object>> equipmentTotal();
    List<Map<String,Object>> equipmentTotal2();
    List<Map<String,Object>> findinfo(int id);
    boolean addinfo(String name,String local);
}
