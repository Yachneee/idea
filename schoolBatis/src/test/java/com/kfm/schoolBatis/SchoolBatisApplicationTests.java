package com.kfm.schoolBatis;

import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.kfm.schoolBatis.entity.Person;
import com.kfm.schoolBatis.entity.SerConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SchoolBatisApplicationTests {

    @Test
    void contextLoads() {
    }
    @Autowired
    Person person;
    @Test
    void person(){
        System.out.println(person);
    }
    @Autowired
    SerConfig serConfig;
    @Test
    void Ser(){
        System.out.println(serConfig);
    }
    @Test
    void send(){
        String ak="ctLqofKaogdovQfKmoP83sBARDHOfFOE";
        String url="https://api.map.baidu.com/location/ip?ak="+ak+"&ip=36.44.163.230";
        String body= HttpRequest.post(url).execute().body();
        JSONObject entries = JSONUtil.parseObj(body);
        System.out.println(entries);
    }
}
