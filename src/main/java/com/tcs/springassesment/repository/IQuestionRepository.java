package com.tcs.springassesment.repository;

import org.springframework.data.repository.CrudRepository;

import com.tcs.springassesment.entity.Question;


public interface IQuestionRepository extends CrudRepository<Question, Integer> {


}