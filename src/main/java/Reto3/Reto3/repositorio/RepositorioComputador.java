/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3.Reto3.repositorio;

import Reto3.Reto3.interfaces.interfaceComputador;
import Reto3.Reto3.modelo.Computador;
import Reto3.Reto3.modelo.Mensaje;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author lauraBarrios
 */
@Repository
public class RepositorioComputador {

    @Autowired
    private interfaceComputador crud;

    public List<Computador> getAll() {
        return (List<Computador>) crud.findAll();
    }

    public Optional<Computador> getComputador(int id) {
        return crud.findById(id);
    }

    public Computador save(Computador computador) {
        return crud.save(computador);
    }

    public void delete(Computador computador) {
        crud.delete(computador);
    }

}
