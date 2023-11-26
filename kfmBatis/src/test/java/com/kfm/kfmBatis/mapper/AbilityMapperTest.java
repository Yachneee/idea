package com.kfm.kfmBatis.mapper;

import com.kfm.kfmBatis.entity.Ability;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class AbilityMapperTest {
    @Resource
private AbilityMapper abilityMapper;
    @Test
    void selectByRoleId() {
        List<Ability> abilities = abilityMapper.selectByRoleId(1);
        for (Ability ability : abilities) {
            System.out.println(ability);
        }
    }
}