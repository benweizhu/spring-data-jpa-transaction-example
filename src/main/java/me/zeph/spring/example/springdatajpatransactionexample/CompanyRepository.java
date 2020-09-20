package me.zeph.spring.example.springdatajpatransactionexample;

import me.zeph.spring.example.springdatajpatransactionexample.model.Company;
import me.zeph.spring.example.springdatajpatransactionexample.model.ISmallCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
    @Query(value = "SELECT id, name FROM COMPANY where name like %?1%", nativeQuery = true)
    List<ISmallCompany> findAllSmallCompany(String name);
}
