package com.capg.otms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;

import com.capg.otms.question.model.Question;
import com.capg.otms.question.repository.QuestionRepository;
import com.capg.otms.question.service.QuestionServiceImpl;



@RunWith(SpringRunner.class)
@SpringBootTest(classes=QuestionControllerTest.class)
public class QuestionControllerTest {
	
	
	@Autowired
	private QuestionServiceImpl service;
	
	@MockBean
	private QuestionRepository repo;
			
		@Test
		public void addTest() {
			Question testbean=new Question(2,null,"Which is good ?",1,2.0,2,0.0);
			when(repo.save(testbean)).thenReturn(testbean);
			assertEquals(testbean,service.addQuestion(testbean));
		}
		
		@Test
		void contextLoads() {
		}

}
