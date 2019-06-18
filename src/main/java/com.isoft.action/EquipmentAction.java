package com.isoft.action;

import com.isoft.service.IEquipmentService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/equipment")
public class EquipmentAction {
    @Autowired
    IEquipmentService equipmentService;

    @RequestMapping("/findAllEquipment.do")
    @ResponseBody
    public Map<String, Object> findAllEquipment(int page, int limit) {
        System.out.println(page + "," + limit);
        List<Map<String, Object>> list = equipmentService.findAllEquipment(page, limit);
        Map<String, Object> equipmentCount = equipmentService.findEquipmentCount();
        Map map = new HashMap();
        map.put("code", 0);
        map.put("msg", "设备信息");
        map.put("count", equipmentCount.get("count"));//用户表中的总记录数
        map.put("data", list);
        return map;//返回JSON格式数据，但是不能转换，因为找不到JSON消息转换器
    }
    @RequestMapping("/equipmentTotal.do")
    @ResponseBody
    public Map<String, Object> equipmentTotal() {
        List<Map<String, Object>> list = equipmentService.equipmentTotal();
        Map map = new HashMap();
        List localList=new ArrayList();
        List countList=new ArrayList();
        for (Map mp:list) {
            localList.add(mp.get("local"));
            countList.add(mp.get("count"));
        }
        map.put("localList",localList);
        map.put("countList",countList);
        return map;
    }

    @RequestMapping("/equipmentTotal2.do")
    @ResponseBody
    public Map<String, Object> equipmentTotal2() {
        List<Map<String, Object>> list = equipmentService.equipmentTotal2();
        Map map = new HashMap();
        List nameList=new ArrayList();
        List countList=new ArrayList();
        for (Map mp:list) {
            nameList.add(mp.get("name"));
            countList.add(mp.get("count"));
        }
        map.put("nameList",nameList);
        map.put("countList",countList);
        return map;
    }

    @RequestMapping("/deleteEquipmentInfoById.do")
    @ResponseBody
    public String deleteEquipmentInfoById(String id) {
        System.out.println(id);
        String result = "success";
        int i=0;
        try{
            String  [] arr= id.split(",");
            for (String index:arr) {
                i= equipmentService.deleteEquipmentInfoById(Integer.parseInt(index));
                System.out.println("正在删除第"+index+"条");
            }
        }catch ( Exception e){
            i=0;
            e.printStackTrace();
        }
        if (i == 0)
            result = "fault";
        return result;//返回JSON格式数据，但是不能转换，因为找不到JSON消息转换器
    }

    @RequestMapping("/findinfo.do")
    @ResponseBody
    public Map<String, Object> findinfo(int id) {
        List<Map<String, Object>> list = equipmentService.findinfo(id);
        Map map = new HashMap();
        map.put("data", list);
        return map;//返回JSON格式数据，但是不能转换，因为找不到JSON消息转换器
    }

    @RequestMapping("/addinfo.do")
    @ResponseBody
    public String addDe(String name,String local){
        boolean temp=equipmentService.addinfo(name,local);
        if(temp)
            return "success";
        else
            return "fault";
    }


}
