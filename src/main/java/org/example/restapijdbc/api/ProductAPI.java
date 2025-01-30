package org.example.restapijdbc.api;


import org.example.restapijdbc.dao.ProductDAO;
import org.example.restapijdbc.model.Product;
import org.example.restapijdbc.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductAPI {

    @Autowired
    ProductDAO productDAO;

    @Autowired
    ProductService productService;


    @GetMapping("/test")
    public String test(){
        return "testing";
    }

    @GetMapping("/getAll")
    public List<Product> getAllProducts(){
        List<Product> allProducts = productService.getAllProduct();
        return allProducts;


//        Product product1 = new Product(1 ,"sku123","Macbook","a Computer","2000");
//        Product product2 = new Product(2 ,"sku1234","Dell","a Computer","1500");
//        List<Product> products = new ArrayList<>();
//        products.add(product1);
//        products.add(product2);
//        return products;
    }

    @GetMapping("/add")
    public String addProduct(){
        Product product = new Product();
        product.setProductId((4));
        product.setSku(("sku138338"));
        product.setName(("Acer"));
        product.setDesc(("A game computer"));
        product.setPrice(("1800"));
        boolean added = productService.addProduct(product);
        if(added){
            return "Product added successfully";
        }else {
            return "Product not added";
        }

    }


}
