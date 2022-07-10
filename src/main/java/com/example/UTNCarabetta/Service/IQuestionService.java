/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.UTNCarabetta.Service;

import com.example.UTNCarabetta.Model.Question;
import java.util.List;


public interface IQuestionService {
    public List<Question> verQuestions();    
    public void crearQuestion (Question ques); 
    public void borrarQuestion (Long id);
    public Question buscarQuestion (Long id);
}
