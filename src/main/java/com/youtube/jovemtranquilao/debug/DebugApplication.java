package com.youtube.jovemtranquilao.debug;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DebugApplication {

	public static void main(String[] args) {
		SpringApplication.run(DebugApplication.class, args);
		Long l = null;
		try {
			l.toString(0);
		} catch (Exception e) {

		}
	}

	public void teste() {
		Long l = null;
		try {
			l.toString(0);
		} catch (Exception e) {

		}
	}
}
