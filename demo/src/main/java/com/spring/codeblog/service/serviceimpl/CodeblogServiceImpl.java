package com.spring.codeblog.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodeBlogRepository;
import com.spring.codeblog.service.CodeblogService;

@Service
public class CodeblogServiceImpl implements CodeblogService {

	@Autowired
	CodeBlogRepository codeblogRepository;

	@Override
	public List<Post> fildAll() {
		// TODO Auto-generated method stub
		return codeblogRepository.findAll();
	}

	@Override
	public Post findById(long id) {
		// TODO Auto-generated method stub
		return codeblogRepository.findById(id).get();
	}

	@Override
	public Post save(Post post) {
		// TODO Auto-generated method stub
		return codeblogRepository.save(post);
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

	public void deletarPost(Long id) {
		codeblogRepository.deleteById(id);
	}

}
