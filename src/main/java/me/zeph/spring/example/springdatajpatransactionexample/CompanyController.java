package me.zeph.spring.example.springdatajpatransactionexample;

import me.zeph.spring.example.springdatajpatransactionexample.model.CompanyDTO;
import me.zeph.spring.example.springdatajpatransactionexample.model.ISmallCompany;
import me.zeph.spring.example.springdatajpatransactionexample.model.SmallCompany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CompanyController {

  @Autowired
  private CompanyService companyService;

  @Autowired
  private CompanyRepository companyRepository;

  @PostMapping(value = "/companies")
  public ResponseEntity<CompanyDTO> createCompany(@RequestBody CompanyDTO companyDTO) {
    return new ResponseEntity<>(companyService.createCompany(companyDTO), HttpStatus.CREATED);
  }

  @GetMapping(value = "/small-companies")
  public ResponseEntity<List<ISmallCompany>> getSmallCompany(@RequestParam(value = "name", required = false) String name) {
    List<ISmallCompany> allSmallCompany = companyRepository.findAllSmallCompany(name);
    return new ResponseEntity<>(allSmallCompany, HttpStatus.OK);
  }
}
