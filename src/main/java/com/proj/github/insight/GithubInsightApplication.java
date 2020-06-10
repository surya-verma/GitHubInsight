package com.proj.github.insight;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

/**
*
* GithubInsightApplication
*
* @author  Surya Verma
* @version 1.0
* @since   2020-06-08
*/

@SpringBootApplication
@EntityScan(basePackageClasses = {
		GithubInsightApplication.class,
})
public class GithubInsightApplication {

	@PostConstruct
	void init() {
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
	}

	public static void main(String[] args) {
		SpringApplication.run(GithubInsightApplication.class, args);
	}

}
