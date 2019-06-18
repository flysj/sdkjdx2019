package com.isoft.dao;

import java.util.List;
import java.util.Map;

public interface IeqDAO {

    Map<String,Object> findeqCount();

    List<Map<String,Object>> findAlleq(int page, int pageSize);
    List<Map<String,Object>> findproeq(int page, int pageSize);
    int eqInfoById(int id);
    List<Map<String,Object>> findAlllog(int page, int pageSize);
    int dellogById(int id);
}
