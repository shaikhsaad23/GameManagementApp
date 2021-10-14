package com.example.demo;

import java.io.FileInputStream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File;

@SpringBootApplication
public class GameManagementAppApplication {

	public static void main(String[] args) {
		ClassLoader classloader = GameManagementAppApplication.class,getClassLoader();
		
		File file = new File(classLoader.getResource(name:"gamemanagementapp-47faa-firebase-adminsdk-o1qs4-0d24731349.json")).getfile();
		
		FileInputStream fis=new FileInputStream(file.getAbsolutePath());
		

				FirebaseOptions options = new FirebaseOptions.Builder()
				  .setCredentials(GoogleCredentials.fromStream(fis))
				  .build();

				FirebaseApp.initializeApp(options);
		
		SpringApplication.run(GameManagementAppApplication.class, args);
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}


}
