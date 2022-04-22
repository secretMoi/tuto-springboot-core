package com.mycompany.invoise;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@Configuration // fichier de config
@ComponentScan(basePackages = { // définit les implémentations à ustiliser
        "com.mycompany.invoise.controller.web",
        "com.mycompany.invoise.service.prefix",
        "com.mycompany.invoise.repository.memory",
})
@PropertySource("application.properties") // charge le fichier de properties
@ImportResource("classpath:applicationContext.xml") // charge la config du fichier XML
public class AppConfig {

}
