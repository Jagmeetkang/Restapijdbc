package org.example.restapijdbc.services;


import org.example.restapijdbc.dao.ProductDAO;
import org.example.restapijdbc.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductDAO productDAO;

    public List<Product> getAllProduct() {
        return productDAO.getAllProducts();


    }

    public boolean addProduct(Product product){
        return productDAO.addProduct(product);
    }
}
