package com.tcs.springassesment.service;

import com.tcs.springassesment.entity.Question;

public interface IQuestionService {

	Question saveQuestion(Question ques);

	Iterable<Question> getAll();

	void deleteQuestion(Integer id);

	String updateAnswers(Question ques, Integer id);

	String upvote(Question ques, Integer id);

}