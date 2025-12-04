
import br.eti.kge.airports.projections.AirportNearMeProjection;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DIT2A
 */
public class AirportNearMeDTO {
    
    
    private long id;
    private String name;
    private String city;
    private String iataCode;
    private double latitude;
    private double longitude;
    private double distanciaKM;

    public AirportNearMeDTO() {
    }
    
    
    

    public AirportNearMeDTO(AirportNearMeProjection airportProjection) {
        this.id = airportProjection.getId();
        this.name = airportProjection.getName();
        this.city = airportProjection.getCity();
        this.iataCode = airportProjection.getIataCode();
        this.latitude = airportProjection.getLatitude();
        this.longitude = airportProjection.getAltitude();
        this.distanciaKM = airportProjection.getDistanciaKM();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getIataCode() {
        return iataCode;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getDistanciaKM() {
        return distanciaKM;
    }
    
    
    
    
}
