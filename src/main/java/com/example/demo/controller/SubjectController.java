package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Subjects;
import com.example.demo.model.Subtopic;
import com.example.demo.model.Topic;
import com.example.demo.model.Unit;
import com.example.demo.repository.SubjectsRepository;
import com.example.demo.repository.SubtopicRepository;
import com.example.demo.repository.TopicRepository;
import com.example.demo.repository.UnitRepository;

@RestController
public class SubjectController {
	
	@SuppressWarnings("unused")
	@Autowired
	private SubjectsRepository subjectsRepository;
	
	@Autowired
	private TopicRepository topicsRepository;
	
	@Autowired
	private UnitRepository unitRepository;
	
	@Autowired
	private SubtopicRepository subtopicRepository;
	
	public SubjectController(SubjectsRepository subjectsRepository) {
		this.subjectsRepository = subjectsRepository;
	}
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		System.out.println("welcome");
		return "index";
	}
	
	@GetMapping("/subjectAll")
    public List<Subjects> getAllPosts() {
        return subjectsRepository.findAll();
    }
	
	@GetMapping("/topicAll")
	public List<Topic> getAllTopic()
	{
		return topicsRepository.findAll();
	}
	
	@GetMapping("/unitAll")
	public List<Unit> getAllUnit()
	{
		return unitRepository.findAll();
	}
	
	@GetMapping("/subtopicAll")
	public List<Subtopic> getAllsubTopic()
	{
		return subtopicRepository.findAll();
	}
	
	
}
