package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@RestController
public class AirportsAPI {

    @GetMapping(value = {"/globalDirectory"})
    public String globalDirectory() {
        return ("hello from spring boot");
    }

    @GetMapping("/airports")
    public String getAirports() {
        return ("Airport created");
    }

    @PostMapping(value = {"/airports"})
    public String newAirport() {
        return ("Airport created");
    }

   // @PostMapping(value = {"/airports/{id}"})
   // public String newUser() {
    //    return ("New user created");
    //}



    @GetMapping("/airports/{id}")
    public String getSingleAirport() {
        return ("All Airports");
    }

    @DeleteMapping(value = {"/airports"})
    public String deleteAirport() {
        return ("Airport deleted");
    }


    /*@PatchMapping(value={"/updateAirports"})
    public String updateAirport() {
        return("Hello from spring boot");
    }

    @PatchMapping(value={"/updateAirport"})
    public String updateAirports() {
        return("Airports updated");
    }*/


    @PutMapping(value = {"/airports{id}"})
    public String replaceAirport() {
        return ("Airports updated");
    }

}
