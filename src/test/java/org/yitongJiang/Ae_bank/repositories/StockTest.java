package org.yitongJiang.Ae_bank.repositories;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.yitongJiang.Ae_bank.model.Overview;

import java.util.List;
import java.util.Optional;

@SpringBootTest
public class StockTest {
    @Autowired
    private OverviewRepository repository;



    @Test
    public void getListOfTest(){
        List<Overview> overviews = repository.findAll();
        Assertions.assertThat(overviews.size()).isGreaterThan(0);
    }


}
