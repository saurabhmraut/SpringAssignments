package com.spring;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Questions {
	private String questionId;
	private String question;
	private List<String> answersInList;
	private Set<String> answersInSet;
	private Map<Integer,String> answerInMap;
	
	// constructor for list
	public Questions(String questionId, String question, List<String> answersInList) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answersInList = answersInList; 
	}
	//method to print
	public void DisplayAnswerInList() {
		System.out.println("\n Id : "+ questionId +"\nQuestion : "+question+"\nAnswers in list : \n" +answersInList);
	} 
	
	//constructor for set
	public Questions(String questionId, String question, Set<String> answersInSet) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answersInSet = answersInSet; 
	}
	public void DisplayAnswerInSet() {
		System.out.println("\n Id : "+ questionId +"\nQuestion : "+question+"\nAnswers in Set : \n" +answersInSet);
	} 

	// constructor for map
	public Questions(String questionId, String question, Map<Integer, String> answerInMap) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answerInMap = answerInMap; 
	}
	public void DisplayAnswerInMap() {
		System.out.println("\n Id : "+ questionId +"\nQuestion : "+question+"\nAnswers in Map : \n" +answerInMap);
	} 



	public List<String> getAnswersInList() {
		return answersInList;
	}
 
	public void setAnswersInList(List<String> answersInList) {
		this.answersInList = answersInList;
	}


	public Set<String> getAnswersInSet() {
		return answersInSet;
	}


	public void setAnswersInSet(Set<String> answersInSet) {
		this.answersInSet = answersInSet;
	}


	public Map<Integer, String> getAnswerInMap() {
		return answerInMap;
	}


	public void setAnswerInMap(Map<Integer, String> answerInMap) {
		this.answerInMap = answerInMap;
	}


	public String getQuestionId() {
		return questionId;
	}


	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}


	public String getQuestion() {
		return question;
	}


	public void setQuestion(String question) {
		this.question = question;
	}




	
}
