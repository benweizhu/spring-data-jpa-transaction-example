package me.zeph.spring.example.springdatajpatransactionexample;

import me.zeph.spring.example.springdatajpatransactionexample.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
}
