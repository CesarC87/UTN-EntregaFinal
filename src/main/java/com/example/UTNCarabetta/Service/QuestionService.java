/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.UTNCarabetta.Service;

import com.example.UTNCarabetta.Model.Question;
import com.example.UTNCarabetta.Repository.QuestionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService implements IQuestionService{
    @Autowired
    public QuestionRepository quesRepo;
    
    @Override
    public List<Question> verQuestions() {
    return quesRepo.findAll();
    }
    
    @Override
    public Question buscarQuestion(Long id) {
    return quesRepo.findById(id).orElse(null);
    }  

    @Override
    public void crearQuestion(Question ques) {
    quesRepo.save(ques);
    }

    @Override
    public void borrarQuestion(Long id) {
        quesRepo.deleteById(id);
    }
}
