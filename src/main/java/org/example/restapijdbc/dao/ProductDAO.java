package org.example.restapijdbc.dao;

import org.example.restapijdbc.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


@Repository
public class ProductDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;

//    public List<Product> getAllProducts(){
//        RowMapper rm = new RowMapper() {
//            @Override
//            public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
//                Product product = new Product();
//                product.setProductId(rs.getInt("PRODUCTID"));
//                product.setSku(rs.getString("SKU"));
//                product.setName(rs.getString("NAME"));
//                product.setDesc(rs.getString("DESC"));
//                product.setPrice(rs.getString("PRICE"));
//                return product;
//            }
//        };
//        return jdbcTemplate.query( SQLQueries.fetchAllProducts , rm );
//    }

    public List<Product> getAllProducts(){

        return jdbcTemplate.query(SQLQueries.fetchAllProducts ,
                new BeanPropertyRowMapper<>(Product.class));
    }

    public boolean addProduct(Product product){
        int numOfRows = jdbcTemplate.update(SQLQueries.addProduct
                , product.getProductId(), product.getSku(), product.getName(), product.getDesc(), product.getPrice());
        return numOfRows > 0;

    }



}

