/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.UTNCarabetta.Service;

import com.example.UTNCarabetta.Model.Answer;
import com.example.UTNCarabetta.Repository.AnswerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerService implements IAnswerService{
    @Autowired
    public AnswerRepository ansRepo;

    public List<Answer> verAnswers() {
    return ansRepo.findAll();
    }
    
    public Answer buscarAnswer(Long id) {
    return ansRepo.findById(id).orElse(null);
    }  

    public void crearAnswer(Answer ans) {
    ansRepo.save(ans);
    }    
}
