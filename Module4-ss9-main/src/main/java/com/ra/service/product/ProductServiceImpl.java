package com.ra.service.product;

import com.ra.model.Customer;
import com.ra.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ProductServiceImpl implements IProductService{

    private static Map<Integer, Product> products;

    static{
        products = new HashMap();
        products.put(1, new Product(1, "pro1", "pro1", true, 5, 10009));
        products.put(2, new Product(2, "pro2", "proo1", true, 6, 10002));
        products.put(3, new Product(3, "pro3", "prol1", true, 7, 10007));
        products.put(4, new Product(4, "pro4", "pro1k", true, 2, 10005));
        products.put(5, new Product(5, "pro5", "pro1g", true, 1, 10001));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
