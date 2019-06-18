package com.isoft.dao.impl;

import com.isoft.dao.IEquipmentDAO;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Repository("equipmentDAO")
public class EquipmentDAOImpl implements IEquipmentDAO {

    @Autowired
    SqlSessionFactory sessionFactoryBean;

    @Override
    public List<Map<String, Object>> findAllEquipment(int page, int pageSize) {
        SqlSession sqlSession = sessionFactoryBean.openSession(true);
        String statement = "com.isoft.mapping.equipmentMapper.findAllEquipment";
        Map map = new HashMap();
        map.put("page", (page-1) * pageSize);
        map.put("pageSize", pageSize);
        List<Map<String, Object>> list = sqlSession.selectList(statement, map);
        return list;
    }

    @Override
    public List<Map<String, Object>> equipmentTotal() {
        SqlSession sqlSession = sessionFactoryBean.openSession(true);
        String statement = "com.isoft.mapping.equipmentMapper.equipmentTotal";
        List<Map<String, Object>> list = sqlSession.selectList(statement);
        return list;
    }

    @Override
    public List<Map<String, Object>> equipmentTotal2() {
        SqlSession sqlSession = sessionFactoryBean.openSession(true);
        String statement = "com.isoft.mapping.equipmentMapper.equipmentTotal2";
        List<Map<String, Object>> list = sqlSession.selectList(statement);
        return list;
    }

    @Override
    public Map<String, Object> findEquipmentCount() {
        try {
            SqlSession sqlSession = sessionFactoryBean.openSession(true);
            String statement = "com.isoft.mapping.equipmentMapper.findEquipmentCount";
            Map map = sqlSession.selectOne(statement);
            System.out.println(map);
            return map;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int deleteEquipmentInfoById(int id) {
        try {
            SqlSession sqlSession = sessionFactoryBean.openSession(true);
            String statement = "com.isoft.mapping.equipmentMapper.deleteEquipmentInfoById";
            int i = sqlSession.delete(statement,id);
            return i;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public List<Map<String, Object>> findinfo(int id) {
        SqlSession sqlSession = sessionFactoryBean.openSession(true);
        String statement = "com.isoft.mapping.equipmentMapper.findinfo";
        List<Map<String, Object>> list = sqlSession.selectList(statement,id);
        return list;
    }

    @Override
    public boolean addinfo(String name,String local){
        SqlSession sqlSession = sessionFactoryBean.openSession(true);
        String statement = "com.isoft.mapping.equipmentMapper.addinfo";
        Map map = new HashMap();
        map.put("name",name);
        map.put("local",local);
        int i = sqlSession.insert(statement, map);
        if (i > 0)
            return true;
        else
            return false;
    }



}
