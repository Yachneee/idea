package com.kfm.schoolBatis.entity;

import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Setter
@ToString
@Component
//@ConfigurationProperties(prefix = "person")
public class Person {
    @Value("${person[0].name}")
    public String name;
    @Value("${person[0].age}")
    public int age;
}
