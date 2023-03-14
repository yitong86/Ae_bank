package org.yitongJiang.Ae_bank.repositories;


import jakarta.transaction.Transactional;
import org.hibernate.sql.ast.tree.expression.Over;
import org.springframework.data.jpa.repository.JpaRepository;
import org.yitongJiang.Ae_bank.model.Overview;

import java.util.List;

@Transactional
public interface OverviewRepository extends JpaRepository<Overview,Long> {
List<Overview> findAll();
//    List<Overview> findBySymbol(String symbol);
//    List<Overview> findById(long id);
//    List<Overview> findBySector(String sector);
//    List<Overview> findByName(String name);
//    List<Overview> findByExchange(String exchange);
//    List<Overview> findByAssetType(String assetType);
//    List<Overview> findByCurrency(String currency);
//    List<Overview> findByCountry(String country);
//    List<Overview> findByMarketCapGreaterThanEqual(long marketCap);
//    List<Overview> findByMarketCapLessThanEqual(long marketCap);
//
//    List<Overview> deleteBySymbol(String symbol);
//    List<Overview> deleteById(long id);
//    List<Overview> deleteBySector(String sector);
//    List<Overview> deleteByCurrency(String currency);
//    List<Overview> deleteByCountry(String country);
//    List<Overview> deleteByName(String name);
//    List<Overview> deleteByExchange(String exchange);
//    List<Overview> deleteByAssetType(String assetType);
//    List<Overview> deleteByMarketCapGreaterThanEqual(long marketCap);
//    List<Overview> deleteByMarketCapLessThanEqual(long marketCap);
}
