package net.app.pack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

import net.app.pack.entity.Question;
import net.app.pack.service.ChatbotService;

@RestController
@CrossOrigin("http://localhost:3000")
public class ChatbotController {

	@Autowired
	private ChatbotService chatbotService;
	
	@GetMapping("/getAllQuestions")
	public List<Question> getAllQuestions(){
		return chatbotService.getAllQuestions();
	}
	
	@GetMapping("/getQuestionWithId/{id}")
	public Question getQuestionById(@PathVariable Long id) {
		return chatbotService.getQuestionById(id);
	}
	
	
	
}
