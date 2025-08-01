package com.tutorsdude.shopping.repository;

import com.tutorsdude.shopping.dto.ProductDto;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    private static List<ProductDto> repository = new ArrayList<ProductDto>();

    public static boolean saveProduct(ProductDto dto){
        if(dto != null){
            repository.add(dto);
            return true;
        }else{
            System.out.println("dto is invalid");
            return false;
        }

    }
}
