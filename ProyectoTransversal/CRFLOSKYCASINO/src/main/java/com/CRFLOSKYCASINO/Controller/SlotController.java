package com.CRFLOSKYCASINO.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SlotController{
    
    @GetMapping("/juegoTragaperras/juegoTragaperras")
    public String mostrarJuegoSlot(){

        return "juegoTragaperras/juegoTragaperras";
    }

}