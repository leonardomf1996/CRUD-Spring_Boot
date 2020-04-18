package com.spring.codeblog.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodeBlogRepository;

//import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData {

    @Autowired
    CodeBlogRepository codeblogRepository;

    //@PostConstruct
    public void savePosts(){

        List<Post> postList = new ArrayList<>();
        Post post1 = new Post();
        post1.setAutor("Leonardo Furtado");
        post1.setData(LocalDate.now());
        post1.setTitulo("Top 1 NBA Player of all time");
        post1.setTexto("Lebron James é moda, mas Michael Jordan é foda!");

        Post post2 = new Post();
        post2.setAutor("Leonardo Mendes");
        post2.setData(LocalDate.now());
        post2.setTitulo("Saudade de você, Corinthians");
        post2.setTexto("Sinto falta do meu Timão, de xingar Vagner Love perdendo gol na cara, de Vital perdendo a bola toda hora, de Luan que tomou chá de lombriga do craque Neto... Saudades");

        postList.add(post1);
        postList.add(post2);

        for(Post post: postList){
            Post postSaved = codeblogRepository.save(post);
            System.out.println(postSaved.getId());
        }
    }
}
