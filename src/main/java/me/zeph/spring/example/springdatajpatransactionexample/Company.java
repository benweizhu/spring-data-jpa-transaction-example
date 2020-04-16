package me.zeph.spring.example.springdatajpatransactionexample;

import lombok.*;

import javax.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
@Entity
@Table(name = "company")
public class Company {

  @Id
  @GeneratedValue
  private long id;

  @Column(name = "name")
  private String name;

}
