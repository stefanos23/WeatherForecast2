package com.example.scanner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.scanner.temperatureController.TemperatureController;


@RunWith(SpringRunner.class)
@SpringBootTest
public class RestControllerTest {

	
    @Autowired
    private TemperatureController controller;
        
    @Test
    public void contexLoads() throws Exception {
        assertThat(controller).isNotNull();
    }
    
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
    public void greetingShouldReturnDefaultMessage2() throws Exception {
        assertThat(this.controller.greeting4("GR")).isNotNull();;
    }
	


}
