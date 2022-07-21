/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.UTNCarabetta.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.UTNCarabetta.Model.Answer;
import com.example.UTNCarabetta.Service.IAnswerService;

@RestController
@RequestMapping("/api/answers")
public class AnswerController {
    @Autowired
    private IAnswerService ansServ;
    
    @GetMapping
    @ResponseBody
    public List<Answer> verAnswers(){
           return ansServ.verAnswers();
    }
    @GetMapping("/{id}")
    @ResponseBody
    public Answer buscarAnswer(@PathVariable Long id){
           return ansServ.buscarAnswer(id);
    }
    @PostMapping
    public void crearAnswer(@RequestBody Answer ans){
        ansServ.crearAnswer(ans);
    }    
}
