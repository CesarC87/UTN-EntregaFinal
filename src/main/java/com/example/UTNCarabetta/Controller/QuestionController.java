/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.UTNCarabetta.Controller;

import com.example.UTNCarabetta.Model.Question;
import com.example.UTNCarabetta.Service.IQuestionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/questions")
public class QuestionController {
    @Autowired
    private IQuestionService quesServ;
    
    @GetMapping
    @ResponseBody
    public List<Question> verQuestions(){
           return quesServ.verQuestions();
    }
    @GetMapping("/{id}")
    @ResponseBody
    public Question buscarQuestion(@PathVariable Long id){
           return quesServ.buscarQuestion(id);
    }
    @PostMapping
    public void crearQuestion(@RequestBody Question ques){
        quesServ.crearQuestion(ques);
    }
    @DeleteMapping("/{id}")
    public void borrarQuestion(@PathVariable Long id){
        quesServ.borrarQuestion(id);
    }
}
