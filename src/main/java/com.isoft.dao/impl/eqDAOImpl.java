package com.isoft.dao.impl;

import com.isoft.dao.IeqDAO;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository("eqDAO")
public class eqDAOImpl implements IeqDAO {
    @Autowired
    SqlSessionFactory sessionFactoryBean;
    @Override
    public Map<String, Object> findeqCount() {
        try {
            SqlSession sqlSession = sessionFactoryBean.openSession(true);
            String statement = "com.isoft.mapping.eqMapper.findeqCount";
            Map map = sqlSession.selectOne(statement);
            System.out.println(map);
            return map;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }



    @Override
    public List<Map<String, Object>> findAlleq(int page, int pageSize) {
        SqlSession sqlSession = sessionFactoryBean.openSession(true);
        String statement = "com.isoft.mapping.eqMapper.findAlleq";
        Map map = new HashMap();
        map.put("page", (page-1) * pageSize);
        map.put("pageSize", pageSize);
        List<Map<String, Object>> list = sqlSession.selectList(statement, map);
        return list;
    }

    @Override
    public List<Map<String, Object>> findproeq(int page, int pageSize) {
        SqlSession sqlSession = sessionFactoryBean.openSession(true);
        String statement = "com.isoft.mapping.eqMapper.findproeq";
        Map map = new HashMap();
        map.put("page", (page-1) * pageSize);
        map.put("pageSize", pageSize);
        List<Map<String, Object>> list = sqlSession.selectList(statement, map);
        return list;
    }

    @Override
    public int eqInfoById(int id) {
        try {
            SqlSession sqlSession = sessionFactoryBean.openSession(true);
            String statement = "com.isoft.mapping.eqMapper.eqInfoById";
            int i = sqlSession.update(statement,id);
            return i;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public List<Map<String, Object>> findAlllog(int page, int pageSize) {
        SqlSession sqlSession = sessionFactoryBean.openSession(true);
        String statement = "com.isoft.mapping.eqMapper.findAlllog";
        Map map = new HashMap();
        map.put("page", (page-1) * pageSize);
        map.put("pageSize", pageSize);
        List<Map<String, Object>> list = sqlSession.selectList(statement, map);
        return list;
    }

    @Override
    public int dellogById(int id) {
        try {
            SqlSession sqlSession = sessionFactoryBean.openSession(true);
            String statement = "com.isoft.mapping.eqMapper.dellogById";
            int i = sqlSession.update(statement,id);
            return i;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }


}
