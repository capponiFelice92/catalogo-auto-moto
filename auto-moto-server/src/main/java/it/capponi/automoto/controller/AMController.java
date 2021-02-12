package it.capponi.automoto.controller;

import it.capponi.automoto.model.Auto;
import it.capponi.automoto.service.AMService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class AMController {

    @Autowired
    AMService aMService;

    @RequestMapping("/autoinit")
    public List<Auto> autoInit() {
        aMService.svuotaAuto();
        
        aMService.inserisciAuto(new Auto("Panda", "Fiat", 3400));
        aMService.inserisciAuto(new Auto("Punto", "Fiat", 2000));
        aMService.inserisciAuto(new Auto("Bravo", "Fiat", 5000));
        aMService.inserisciAuto(new Auto("Meriva", "Opel", 2500));

        return aMService.visualizzaTutteAuto();
    }
}
