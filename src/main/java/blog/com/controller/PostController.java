package blog.com.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("app")
public class PostController {
	

	  @GetMapping("home")
	    public ResponseEntity<String> showAllPosts() {
	        return new ResponseEntity<>("app running", HttpStatus.OK);
	    }

	

}