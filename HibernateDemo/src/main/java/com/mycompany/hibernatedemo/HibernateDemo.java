/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.hibernatedemo;

import com.mycompany.repositories.impl.CategoryRepositoryImpl;
import com.mycompany.repositories.impl.ProductRepositoryImpl;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author admin
 */
public class HibernateDemo {

    public static void main(String[] args) {
//        CategoryRepositoryImpl s = new CategoryRepositoryImpl();
//        s.getCates().forEach(c -> System.out.println(c.getName()));

        Map<String, String> params = new HashMap<>();
//           params.put("kw", "iphone");
//           params.put("fromPrice","12990000");
        params.put("page", "2");
        ProductRepositoryImpl p = new ProductRepositoryImpl();
        p.getProducts(params).forEach(x -> System.out.printf("%d - %s - %.1f\n", x.getId(), x.getName(), x.getPrice()));

    }
}
