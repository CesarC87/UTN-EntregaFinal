/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.UTNCarabetta.Service;

import com.example.UTNCarabetta.Model.Category;
import java.util.List;

/**
 *
 * @author carab
 */
public interface ICategoryService {
    public List<Category> verCategories();    
    public void crearCategory (Category cat); 
    public void borrarCategory (Long id);
    public Category buscarCategory (Long id);
}
