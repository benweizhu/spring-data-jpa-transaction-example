package me.zeph.spring.example.springdatajpatransactionexample.model;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
public class CompanyDTO {
  private long id;
  private String name;
  private String address;
}
