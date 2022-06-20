package com.marketkutty.marketkutty.service;


import com.marketkutty.marketkutty.model.dto.responseDto.ProductDto;
import com.marketkutty.marketkutty.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<ProductDto> getProductList(String categoryCode){
        return productRepository.findAll(categoryCode);
    }
}
