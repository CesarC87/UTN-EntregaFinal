/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.UTNCarabetta.Service;

import com.example.UTNCarabetta.Model.Category;
import com.example.UTNCarabetta.Repository.CategoryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService implements ICategoryService{
    @Autowired
    public CategoryRepository catRepo;
    
    @Override
    public List<Category> verCategories() {
    return catRepo.findAll();
    }
    
    @Override
    public Category buscarCategory(Long id) {
    return catRepo.findById(id).orElse(null);
    }  

    @Override
    public void crearCategory(Category cat) {
    catRepo.save(cat);
    }

    @Override
    public void borrarCategory(Long id) {
        catRepo.deleteById(id);
    }
      
    
}

