package com.atguigu.jpa.helloworld;

import javax.persistence.*;

/**
 * @author hhd
 * @date 2020/10/3121:23
 */
@Table(name = "JPA_CUSTOMER")
@Entity
public class Customer {
    private Integer id;
    private String lastName;
    private String email;
    private int age;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
