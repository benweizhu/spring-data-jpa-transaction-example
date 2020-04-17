### Without directly use @Transactional on service level
2020-04-17 10:49:37.671 DEBUG 56489 --- [nio-8080-exec-2] o.j.s.OpenEntityManagerInViewInterceptor : Opening JPA EntityManager in OpenEntityManagerInViewInterceptor
2020-04-17 10:49:37.750 DEBUG 56489 --- [nio-8080-exec-2] o.s.orm.jpa.JpaTransactionManager        : Found thread-bound EntityManager [SessionImpl(1813341176<open>)] for JPA transaction
2020-04-17 10:49:37.751 DEBUG 56489 --- [nio-8080-exec-2] o.s.orm.jpa.JpaTransactionManager        : Creating new transaction with name [org.springframework.data.jpa.repository.support.SimpleJpaRepository.saveAndFlush]: PROPAGATION_REQUIRED,ISOLATION_DEFAULT
2020-04-17 10:49:37.756 DEBUG 56489 --- [nio-8080-exec-2] o.s.orm.jpa.JpaTransactionManager        : Exposing JPA transaction as JDBC [org.springframework.orm.jpa.vendor.HibernateJpaDialect$HibernateConnectionHandle@597809cf]
Hibernate: insert into company_address (id, address) values (null, ?)
Hibernate: insert into company (id, company_address_id, name) values (null, ?, ?)
2020-04-17 10:49:37.795 DEBUG 56489 --- [nio-8080-exec-2] o.s.orm.jpa.JpaTransactionManager        : Initiating transaction commit
2020-04-17 10:49:37.795 DEBUG 56489 --- [nio-8080-exec-2] o.s.orm.jpa.JpaTransactionManager        : Committing JPA transaction on EntityManager [SessionImpl(1813341176<open>)]
2020-04-17 10:49:37.796 DEBUG 56489 --- [nio-8080-exec-2] o.s.orm.jpa.JpaTransactionManager        : Not closing pre-bound JPA EntityManager after transaction
2020-04-17 10:49:37.826 DEBUG 56489 --- [nio-8080-exec-2] o.j.s.OpenEntityManagerInViewInterceptor : Closing JPA EntityManager in OpenEntityManagerInViewInterceptor

### With @Transactional on service method
2020-04-17 10:48:16.533 DEBUG 56482 --- [nio-8080-exec-2] o.j.s.OpenEntityManagerInViewInterceptor : Opening JPA EntityManager in OpenEntityManagerInViewInterceptor
2020-04-17 10:48:16.604 DEBUG 56482 --- [nio-8080-exec-2] o.s.orm.jpa.JpaTransactionManager        : Found thread-bound EntityManager [SessionImpl(2019971425<open>)] for JPA transaction
2020-04-17 10:48:16.604 DEBUG 56482 --- [nio-8080-exec-2] o.s.orm.jpa.JpaTransactionManager        : Creating new transaction with name [me.zeph.spring.example.springdatajpatransactionexample.CompanyService.createCompany]: PROPAGATION_REQUIRED,ISOLATION_DEFAULT
2020-04-17 10:48:16.608 DEBUG 56482 --- [nio-8080-exec-2] o.s.orm.jpa.JpaTransactionManager        : Exposing JPA transaction as JDBC [org.springframework.orm.jpa.vendor.HibernateJpaDialect$HibernateConnectionHandle@4597cbf2]
2020-04-17 10:48:16.615 DEBUG 56482 --- [nio-8080-exec-2] o.s.orm.jpa.JpaTransactionManager        : Found thread-bound EntityManager [SessionImpl(2019971425<open>)] for JPA transaction
2020-04-17 10:48:16.615 DEBUG 56482 --- [nio-8080-exec-2] o.s.orm.jpa.JpaTransactionManager        : Participating in existing transaction
Hibernate: insert into company_address (id, address) values (null, ?)
Hibernate: insert into company (id, company_address_id, name) values (null, ?, ?)
2020-04-17 10:48:16.654 DEBUG 56482 --- [nio-8080-exec-2] o.s.orm.jpa.JpaTransactionManager        : Initiating transaction commit
2020-04-17 10:48:16.655 DEBUG 56482 --- [nio-8080-exec-2] o.s.orm.jpa.JpaTransactionManager        : Committing JPA transaction on EntityManager [SessionImpl(2019971425<open>)]
2020-04-17 10:48:16.655 DEBUG 56482 --- [nio-8080-exec-2] o.s.orm.jpa.JpaTransactionManager        : Not closing pre-bound JPA EntityManager after transaction
2020-04-17 10:48:16.683 DEBUG 56482 --- [nio-8080-exec-2] o.j.s.OpenEntityManagerInViewInterceptor : Closing JPA EntityManager in OpenEntityManagerInViewInterceptor
