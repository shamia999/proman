package com.upgrad.proman.api.Controller;

import com.model.SignupUserRequest;
import com.model.SignupUserResponse;
import com.upgrad.proman.service.business.SignupBusinessService;
import com.upgrad.proman.service.entity.UserEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;
import java.util.UUID;

@RestController      //combination of controller and responsebody
@RequestMapping("/")
public class SignupController {
@Autowired
private SignupBusinessService signupBusinessService;
    @RequestMapping(value="RequestMethod.POST",path="/signup",consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<SignupUserResponse>Signup( final SignupUserRequest signupUserRequest)
    {
       final UserEntity userEntity=new UserEntity();
        userEntity.setUuid(UUID.randomUUID().toString());
        userEntity.setFirstName(signupUserRequest.getFirstName());
        userEntity.setLastName(signupUserRequest.getLastName());
        userEntity.setEmail(signupUserRequest.getEmailAddress());
        userEntity.setPassword(signupUserRequest.getPassword());
        userEntity.setSalt("1234abc");
        userEntity.setStatus(4);
        userEntity.setCreatedAt(ZonedDateTime.now());
        userEntity.setCreatedBy("api-backend");
      final UserEntity createdUserEntity = signupBusinessService.signup(userEntity);
       SignupUserResponse userResponse  =  new SignupUserResponse().id(createdUserEntity.getUuid()).status("REGISTERED");
      return new ResponseEntity<SignupUserResponse>(userResponse, HttpStatus.CREATED);
    }
}
