/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3.Reto3.servicios;

import Reto3.Reto3.modelo.Computador;
import Reto3.Reto3.repositorio.RepositorioComputador;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author lauraBarrios
 */
@Service
public class ServiciosComputador {

    @Autowired
    private RepositorioComputador metodosCrud;

    public List<Computador> getAll() {
        return metodosCrud.getAll();
    }

    public Optional<Computador> getComputador(int idComputador) {
        return metodosCrud.getComputador(idComputador);
    }

    public Computador save(Computador computador) {
        if (computador.getId() == null) {
            return metodosCrud.save(computador);
        } else {
            Optional<Computador> evt = metodosCrud.getComputador(computador.getId());
            if (evt.isEmpty()) {
                return metodosCrud.save(computador);
            } else {
                return computador;
            }
        }
    }

    public Computador update(Computador computador) {
        if (computador.getId() != null) {
            Optional<Computador> e = metodosCrud.getComputador(computador.getId());
            if (!e.isEmpty()) {
                if (computador.getName() != null) {
                    e.get().setName(computador.getName());
                }
                if (computador.getBrand() != null) {
                    e.get().setBrand(computador.getBrand());
                }
                if (computador.getYear() != null) {
                    e.get().setYear(computador.getYear());
                }
                if (computador.getDescription() != null) {
                    e.get().setDescription(computador.getDescription());
                }
                if (computador.getCategory() != null) {
                    e.get().setCategory(computador.getCategory());
                }
                metodosCrud.save(e.get());
                return e.get();
            } else {
                return computador;
            }
        } else {
            return computador;
        }
    }

    public boolean deleteComputador(int computadorId) {
        Boolean aBoolean = getComputador(computadorId).map(computador -> {
            metodosCrud.delete(computador);
            return true;
        }).orElse(false);
        return aBoolean;
    }
}
