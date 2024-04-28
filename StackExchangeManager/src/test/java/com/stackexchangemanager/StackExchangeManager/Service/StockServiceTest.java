package com.stackexchangemanager.StackExchangeManager.Service;

import com.stackexchangemanager.StackExchangeManager.model.StockWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.math.BigDecimal;

@SpringBootTest
public class StockServiceTest {
    @Autowired
    private StackService stackService; // Corrected the variable name to match the class name

    @Test
    void invoke() throws IOException {
        final StockWrapper stock = stackService.findStock("UU.L"); // Corrected the variable name to match the class name
        System.out.println(stock.getStock());

        final BigDecimal price = stackService.findPrice(stock); // Corrected the variable name to match the class name
        System.out.println(price);

        final BigDecimal change = stackService.findLastChangePercent(stock);
        System.out.println(change);

        final BigDecimal mean200DayPercent = stackService.findChangeFrom200MeanPercent(stock);
        System.out.println(mean200DayPercent);
    }
}
