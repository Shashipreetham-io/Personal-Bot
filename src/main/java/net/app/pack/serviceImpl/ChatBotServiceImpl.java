package net.app.pack.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.app.pack.entity.Question;
import net.app.pack.repository.QuestionRepository;
import net.app.pack.service.ChatbotService;

@Service
public class ChatBotServiceImpl implements ChatbotService {

	
	@Autowired
	private QuestionRepository questionRepository;
	
	@Override
	public List<Question> getAllQuestions() {
		// TODO Auto-generated method stub
		return questionRepository.findAll();
	}

	@Override
	public Question getQuestionById(Long id) {
		// TODO Auto-generated method stub
		return questionRepository.findById(id).orElse(null);
	}
	
	
	
	
	

}
