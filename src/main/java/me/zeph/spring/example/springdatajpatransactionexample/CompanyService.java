package me.zeph.spring.example.springdatajpatransactionexample;

import me.zeph.spring.example.springdatajpatransactionexample.model.Company;
import me.zeph.spring.example.springdatajpatransactionexample.model.CompanyAddress;
import me.zeph.spring.example.springdatajpatransactionexample.model.CompanyDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

  @Autowired
  private CompanyRepository companyRepository;

  public CompanyDTO createCompany(CompanyDTO companyDTO) {
    CompanyAddress companyAddress = CompanyAddress.builder().address(companyDTO.getAddress()).build();
    Company company = Company.builder().name(companyDTO.getName()).companyAddress(companyAddress).build();

    Company saveCompany = companyRepository.save(company);

    return CompanyDTO.builder()
        .id(saveCompany.getId())
        .name(saveCompany.getName())
        .address(saveCompany.getCompanyAddress().getAddress())
        .build();
  }

}
