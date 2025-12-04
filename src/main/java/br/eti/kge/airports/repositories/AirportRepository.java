/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.eti.kge.airports.repositories;

import br.eti.kge.airports.entities.Airport;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author DIT2A
 */
public interface AirportRepository  extends JpaRepository<Airport, Long> {
    List<Airport> findByCityIgnoreCase(String city);

    public List<Airport> findByCountryIgnoreCase(String country);

    public Airport findByIataCode(String iataCode);
    @Service
    public class AirportService {
        
        @Autowired
        private AirportRepository airportRepository;
        
        public List<Airport> findAll() {
            
            List<Airport> result = airportRepository.findAll();
            return result;
            
        }
    }
    
}
