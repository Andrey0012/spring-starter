package com.dmdev.spring.integration.service;

import com.dmdev.spring.ApplicationRunner;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.ConfigDataApplicationContextInitializer;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = ApplicationRunner.class, initializers = ConfigDataApplicationContextInitializer.class)
public class CompanyServiceIT {
    @Test
    void findById() {}
}
