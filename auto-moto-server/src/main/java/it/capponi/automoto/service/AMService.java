package it.capponi.automoto.service;

import it.capponi.automoto.model.Auto;
import it.capponi.automoto.model.Moto;
import java.util.List;

public interface AMService {

    //********************
    //Metodi auto
    //********************
    void svuotaAuto();

    void inserisciAuto(Auto a);

    List<Auto> visualizzaTutteAuto();

    void eliminaAuto(Auto a);

    //********************
    //Metodi moto
    //********************
    void svuotaMoto();

    void inserisciMoto(Moto m);

    List<Moto> visualizzaTutteMoto();

    void eliminaMoto(Moto m);
}
