package com.ayanda.driverhire;

import com.ayanda.driverhire.service.userService;
import com.ayanda.driverhire.user.SystemUser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DriverHireApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(DriverHireApplication.class, args);
		userService userSvs  = context.getBean(userService.class);

		SystemUser newUser = new SystemUser("Driver","ayanda@gmail.com","khumalo","Ayanda");
		userSvs.addNewUser(newUser);

	}

}
