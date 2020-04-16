package me.zeph.spring.example.springdatajpatransactionexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

  @Autowired
  private CompanyRepository companyRepository;

  public CompanyDTO createCompany(CompanyDTO companyDTO) {
    Company company = Company.builder().name(companyDTO.getName()).build();
    Company saveCompany = companyRepository.saveAndFlush(company);
    return CompanyDTO.builder().id(saveCompany.getId()).name(saveCompany.getName()).build();
  }

}
