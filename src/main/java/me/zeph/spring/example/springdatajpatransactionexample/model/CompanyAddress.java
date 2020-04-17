package me.zeph.spring.example.springdatajpatransactionexample.model;

import lombok.*;

import javax.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
@Entity
@Table
public class CompanyAddress {

  @Id
  @GeneratedValue
  private long id;

  private String address;

  @OneToOne(mappedBy = "companyAddress")
  private Company company;

}
