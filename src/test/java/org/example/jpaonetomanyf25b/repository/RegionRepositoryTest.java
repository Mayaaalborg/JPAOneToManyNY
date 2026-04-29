package org.example.jpaonetomanyf25b.repository;

import jakarta.transaction.Transactional;
import org.example.jpaonetomanyf25b.model.Kommune;
import org.example.jpaonetomanyf25b.model.Region;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

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

    @Test
    void testRegionNordjylland() {
        Optional<Region> region = regionRepository.findById("1081");
        assertTrue(region.isPresent());

    }

    @Test
    @Transactional //Skal skrives for at testen ikke fejler
    void testAntalKommunerIRegionNordjylland() {
        Optional<Region> region = regionRepository.findById("1081"); //Tager fat i nordjylland
        assertTrue(region.isPresent()); //Er regionen fundet?
        List<Kommune> kommuner = region.get().getKommuner(); //Henter kommuner fra regionen
        assertEquals(11, kommuner.size()); //Er der 10 kommuner i regionen?
    }

}