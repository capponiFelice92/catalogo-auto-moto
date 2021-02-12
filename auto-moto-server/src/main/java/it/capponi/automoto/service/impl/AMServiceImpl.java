package it.capponi.automoto.service.impl;

import it.capponi.automoto.model.Auto;
import it.capponi.automoto.model.Moto;
import it.capponi.automoto.repository.AutoRepository;
import it.capponi.automoto.repository.MotoRepository;
import it.capponi.automoto.service.AMService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AMServiceImpl implements AMService {

    @Autowired
    AutoRepository autoRepository;

    @Autowired
    MotoRepository motoRepository;

    //****************************
    //Metodi auto
    //****************************
    @Override
    public void svuotaAuto() {
        autoRepository.deleteAllInBatch();
    }

    @Override
    public void inserisciAuto(Auto a) {
        autoRepository.save(a);
    }

    @Override
    public List<Auto> visualizzaTutteAuto() {
        return autoRepository.findAll();
    }

    @Override
    public void eliminaAuto(Auto a) {
        autoRepository.delete(a);
    }

    //****************************
    //Metodi Moto
    //****************************
    @Override
    public void svuotaMoto() {
        motoRepository.deleteAllInBatch();
    }

    @Override
    public void inserisciMoto(Moto m) {
        motoRepository.save(m);
    }

    @Override
    public List<Moto> visualizzaTutteMoto() {
        return motoRepository.findAll();
    }

    @Override
    public void eliminaMoto(Moto m) {
        motoRepository.delete(m);
    }

}
