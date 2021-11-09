//Categorias, Mensajes, Reservaciones, Clientes, Computadores
//1.Modelo o entidad
//2.Interfaces
//3.Repositorio
//4.Servicios
//5.Controlador o web

//Reporte Estatus, Fechas, Clientes

package Reto3.Reto3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"Reto3.Reto3.modelo"})
public class Reto3Application {

    public static void main(String[] args) {
        SpringApplication.run(Reto3Application.class, args);
    }

}
