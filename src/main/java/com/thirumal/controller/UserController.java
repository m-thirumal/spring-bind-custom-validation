/**
 * 
 */
package com.thirumal.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thirumal.model.User;

import jakarta.validation.Valid;

/**
 * @author ThirumalM
 */
@RestController
@RequestMapping("user")
@Validated
public class UserController {

	@PostMapping
	public User createUser(@RequestBody @Valid User user) {
		return user;
	}
}
