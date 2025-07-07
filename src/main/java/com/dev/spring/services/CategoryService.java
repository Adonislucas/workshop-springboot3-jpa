package com.dev.spring.services;

import com.dev.spring.entities.Category;
import com.dev.spring.entities.Order;
import com.dev.spring.repositories.CategoryRepository;
import com.dev.spring.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;


    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category findById (Long id){
       Optional<Category> obj = repository.findById(id);
       return obj.get();
    }




}
