package me.zeph.spring.example.springdatajpatransactionexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {

  @Autowired
  private CompanyService companyService;

  @PostMapping(value = "/companies")
  public ResponseEntity<CompanyDTO> createCompany(@RequestBody CompanyDTO companyDTO) {
    return new ResponseEntity<>(companyService.createCompany(companyDTO), HttpStatus.CREATED);
  }
}
