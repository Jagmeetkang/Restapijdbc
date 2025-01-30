package org.example.restapijdbc.dao;

public interface SQLQueries {
    String addProduct = "INSERT INTO PRODUCT VALUES (?,?,?,?,?)";
    String fetchAllProducts = "SELECT * FROM PRODUCT";
}
