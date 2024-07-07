package net.app.pack.service;

import java.util.List;

import net.app.pack.entity.Question;

public interface ChatbotService {

	
	public List<Question> getAllQuestions();
	public Question getQuestionById(Long id);	
	
}
