package com.stackexchangemanager.StackExchangeManager;

import com.stackexchangemanager.StackExchangeManager.Service.StackService;
import com.stackexchangemanager.StackExchangeManager.model.StockWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.math.BigDecimal;

@SpringBootTest
public class StackExchangeManagerApplicationTests {
	@Autowired
	private StackService stackService; // Corrected the variable name to match the class name

	@Test
	void invoke() throws IOException {
		final StockWrapper stock = stackService.findStock("UU.L"); // Corrected the variable name to match the class name
		System.out.println(stock.getStock());
		final BigDecimal price = stackService.findPrice(stock); // Corrected the variable name to match the class name
		System.out.println(price);
	}
}
