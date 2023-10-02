package com.abd.mymasjid;

import com.abd.mymasjid.user.internal.User;
import com.abd.mymasjid.user.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class MyMasjidApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyMasjidApplication.class, args).getBean(UserService.class).addUser();
	}

}
