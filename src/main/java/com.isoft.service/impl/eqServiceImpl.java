package com.isoft.service.impl;

import com.isoft.dao.IeqDAO;
import com.isoft.service.IeqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("eqService")
public class eqServiceImpl implements IeqService {
    @Autowired
    IeqDAO eqDAO;


    @Override
    public Map<String, Object> findeqCount() {
        return eqDAO.findeqCount();
    }


    @Override
    public List<Map<String, Object>> findAlleq(int page, int pageSize) {
        return eqDAO.findAlleq(page,pageSize);
    }

    @Override
    public List<Map<String, Object>> findproeq(int page, int pageSize) {
        return eqDAO.findproeq(page,pageSize);
    }

    @Override
    public int eqInfoById(int id) {
        return eqDAO.eqInfoById(id);
    }

    @Override
    public List<Map<String, Object>> findAlllog(int page, int pageSize) {
        return eqDAO.findAlllog(page,pageSize);
    }

    @Override
    public int dellogById(int id) {
        return eqDAO.dellogById(id);
    }
}
