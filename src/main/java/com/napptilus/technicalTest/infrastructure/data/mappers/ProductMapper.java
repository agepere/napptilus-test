package com.napptilus.technicalTest.infrastructure.data.mappers;


import com.napptilus.technicalTest.domain.models.Product;
import com.napptilus.technicalTest.infrastructure.data.dto.ProductDto;

public class ProductMapper {

    public static Product toDomain(ProductDto productDto) {
        return new Product(productDto.id(), productDto.name(), productDto.price(), productDto.availability());
    }

    public static ProductDto fromDomain(Product product) {
        return new ProductDto(product.getId(), product.getName().name(), product.getPrice().value(), product.getAvailability());
    }

}
