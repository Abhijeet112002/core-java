package com.tutorsdude.shopping.service;

import com.tutorsdude.shopping.dto.ProductDto;
import com.tutorsdude.shopping.repository.ProductRepository;

public class ProductService {

    public static boolean saveProduct(ProductDto dto){
        if (dto != null){
            if (dto.getName() != null && dto.getName().length()>=5) {
                if (dto.getPrice() != 0){
                    if (dto.getType()!=null){
                        ProductRepository.saveProduct(dto);
                        System.out.println("validation is successful,saving success");
                        return true;

                    }else{
                        System.out.println("product type is invalid");
                        return false;
                    }

                }else{
                    System.out.println("invalid price");
                    return false;
                }

            }else{
                System.out.println("product name is invalid");
                return false;
            }

        }else{
            System.out.println("invalid dto");
            return false;
        }

    }
}
