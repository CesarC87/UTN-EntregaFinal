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
    
    @Override
    public List<Answer> verAnswers() {
    return ansRepo.findAll();
    }
    
    @Override
    public Answer buscarAnswer(Long id) {
    return ansRepo.findById(id).orElse(null);
    }  

    @Override
    public void crearAnswer(Answer ans) {
    ansRepo.save(ans);
    }

    @Override
    public void borrarAnswer(Long id) {
        ansRepo.deleteById(id);
    }
}
