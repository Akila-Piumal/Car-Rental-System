package lk.ijse.easyCarRental.config;

import lk.ijse.easyCarRental.advicer.AppWideExceptionHandler;
import lk.ijse.easyCarRental.controller.LoginController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = {LoginController.class, AppWideExceptionHandler.class})
public class WebAppConfig {
}
