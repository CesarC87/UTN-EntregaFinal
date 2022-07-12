/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.UTNCarabetta.Service;

import com.example.UTNCarabetta.Model.Answer;
import java.util.List;

public interface IAnswerService {
    public List<Answer> verAnswers();    
    public void crearAnswer (Answer ans);     
    public Answer buscarAnswer (Long id);
}
