package com.backend.evaluacion.Dao.Imp;

import com.backend.evaluacion.Dao.Imp.Override;
import com.backend.evaluacion.Dao.IDao;
import com.backend.evaluacion.Entity.odontologo;

import java.util.List;


public class OdontologoDaoEnMemoria implements IDao<odontologo> {

    private List<odontologo> odontologoRepositorio;

    public OdontologoDaoEnMemoria(List<odontologo> odontologoRepositorio){

        this.odontologoRepositorio=odontologoRepositorio;
    }


    @Override
    public odontologo guardar(odontologo odontologo) {

        odontologoRepositorio.add(odontologo);
        return odontologo;
    }

    @Override
    public List<odontologo> listarTodos() {
        return odontologoRepositorio;
    }
}