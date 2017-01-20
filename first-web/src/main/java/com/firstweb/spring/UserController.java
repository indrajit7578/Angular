package com.firstweb.spring;



import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
	
	@RequestMapping(value = "/userpage",method = RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<User> process(@RequestBody User user) {
		System.out.println(user.getFirstName());
		System.out.println(user.getLastName());
		System.out.println(user.getPassword());
		/*User user1 = new User();
		user1.setFirstName("indra");
		user1.setLastName("das");
		user1.setPassword("check");*/
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
}
