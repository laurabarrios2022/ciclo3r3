/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto3.Reto3.interfaces;

import Reto3.Reto3.modelo.Mensaje;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author lauraBarrios
 */
public interface interfaceMensaje extends CrudRepository<Mensaje, Integer> {

}
