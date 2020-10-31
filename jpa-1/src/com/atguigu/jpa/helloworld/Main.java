package com.atguigu.jpa.helloworld;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * @author hhd
 * @date 2020/10/3121:28
 */
public class Main {
    public static void main(String[] args) {
//        1、创建EntityManagerFactory
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("jpa-1");
//        2、创建EntityManager
        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        3、开启事务
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
//        4、进行持久化操作
        Customer customer = new Customer();
        customer.setAge(12);
        customer.setEmail("tom@qq.com");
        customer.setLastName("Tom");
        //保存
        entityManager.persist(customer);
//        5、提交事务
        transaction.commit();
//        6、关闭EntityManager
        entityManager.close();
//        7、关闭EntityManagerFactory
        entityManagerFactory.close();
    }
}
