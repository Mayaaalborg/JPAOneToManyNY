package org.example.jpaonetomanyf25b.repository;

import org.example.jpaonetomanyf25b.model.Region;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RegionRepositoryTest {

    @Autowired
    RegionRepository regionRepository;

    @Test
    void test6Regioner(){
        assertEquals(6, regionRepository.findAll().size());
    }

    @Test
    void testRegioner(){
        List<Region> list = regionRepository.findAll();
        assertEquals(5, list.size());
    }

}