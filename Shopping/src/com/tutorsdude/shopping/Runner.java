package com.tutorsdude.shopping;

import com.tutorsdude.shopping.dto.ProductDto;
import com.tutorsdude.shopping.service.ProductService;

public class Runner {
    public static void main(String[] args) {

        ProductDto mobile = new ProductDto("Redmi",12000,2,"android");

        ProductService service = new ProductService();
        service.saveProduct(mobile);
    }
}
