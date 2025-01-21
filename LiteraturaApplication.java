package com.sebasmedina.proyectos.literatura;

import com.sebasmedina.proyectos.literatura.principal.Principal;
import com.sebasmedina.proyectos.literatura.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraturaApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(LiteraturaApplication.class, args);
    }

    @Autowired
    private MenuService menuService;

    @Override
    public void run(String... args) throws Exception {
        Principal principal = new Principal(menuService);
        principal.EjecutarAplicacion();
    }
}
