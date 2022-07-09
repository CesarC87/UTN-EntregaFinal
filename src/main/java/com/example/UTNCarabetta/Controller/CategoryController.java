/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.UTNCarabetta.Controller;

import com.example.UTNCarabetta.Model.Category;
import com.example.UTNCarabetta.Service.ICategoryService;
import java.util.List;
import static org.hibernate.criterion.Projections.id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    @Autowired
    private ICategoryService catServ;
    
    @GetMapping
    @ResponseBody
    public List<Category> verCategories(){
           return catServ.verCategories();
    }
    @GetMapping("/{id}")
    @ResponseBody
    public List<Category> buscarCategory(Long id){
           return (List<Category>) catServ.buscarCategory(id);
    }
    @PostMapping
    public void crearCategory(@RequestBody Category cat){
        catServ.crearCategory(cat);
    }
    @DeleteMapping("/{id}")
    public void borrarCategory(Long id){
        catServ.borrarCategory(id);
    }
    
}
