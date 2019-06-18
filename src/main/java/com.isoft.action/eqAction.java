package com.isoft.action;

import com.isoft.service.IeqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/eq")
public class eqAction {
    @Autowired
    IeqService eqService;

    @RequestMapping("/findAlleq.do")
    @ResponseBody
    public Map<String, Object> findAlleq(int page, int limit) {
        System.out.println(page + "," + limit);
        List<Map<String, Object>> list = eqService.findAlleq(page, limit);
        Map<String, Object> userCount = eqService.findeqCount();
        Map map = new HashMap();
        map.put("code", 0);
        map.put("msg", "设备信息");
        map.put("count", userCount.get("count"));//用户表中的总记录数
        map.put("data", list);
        return map;//返回JSON格式数据，但是不能转换，因为找不到JSON消息转换器
    }
    @RequestMapping("/findproeq.do")
    @ResponseBody
    public Map<String, Object> findproeq(int page, int limit) {
        System.out.println(page + "," + limit);
        List<Map<String, Object>> list = eqService.findproeq(page, limit);
        Map<String, Object> userCount = eqService.findeqCount();
        Map map = new HashMap();
        map.put("code", 0);
        map.put("msg", "设备信息");
        map.put("count", userCount.get("count"));//用户表中的总记录数
        map.put("data", list);
        return map;//返回JSON格式数据，但是不能转换，因为找不到JSON消息转换器
    }
    @RequestMapping("/eqInfoById.do")
    @ResponseBody
    public String eqInfoById(int id) {
        String result = "success";
        int i = eqService.eqInfoById(id);
        if (i == 0)
            result = "fault";
        return result;//返回JSON格式数据，但是不能转换，因为找不到JSON消息转换器
    }
    @RequestMapping("/findAlllog.do")
    @ResponseBody
    public Map<String, Object> findAlllog(int page, int limit) {
        System.out.println(page + "," + limit);
        List<Map<String, Object>> list = eqService.findAlllog(page, limit);
        Map<String, Object> userCount = eqService.findeqCount();
        Map map = new HashMap();
        map.put("code", 0);
        map.put("msg", "设备信息");
        map.put("count", userCount.get("count"));//用户表中的总记录数
        map.put("data", list);
        return map;//返回JSON格式数据，但是不能转换，因为找不到JSON消息转换器
    }
    @RequestMapping("/dellogById.do")
    @ResponseBody
    public String dellogById(int id) {
        String result = "success";
        int i = eqService.dellogById(id);
        if (i == 0)
            result = "fault";
        return result;//返回JSON格式数据，但是不能转换，因为找不到JSON消息转换器
    }
}
