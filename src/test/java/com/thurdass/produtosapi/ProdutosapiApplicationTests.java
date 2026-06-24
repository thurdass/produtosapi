package com.thurdass.produtosapi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
class ProdutosapiApplicationTests {

	@GetMapping("/hello-world")
	public  String HelloWorld() {
		return "Hello World";
	}


	public static void main(String[] args) {

	}
	@Test
	void contextLoads() {
	}

}
