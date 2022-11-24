package com.example.demo.Models;

import com.example.demo.Enums.ObraRisco;
import com.example.demo.Enums.ObraTipo;

public class ObraDetalheTecnicos {
    int Id;
    ObraTipo ObraTipo;
    ObraRisco ObraRisco;
    Obra Obra;

    public ObraTipo getObraTipo() {
        return ObraTipo;
    }

    public void setObraTipo(ObraTipo obraTipo) {
        ObraTipo = obraTipo;
    }

    public ObraRisco getObraRisco() {
        return ObraRisco;
    }

    public void setObraRisco(ObraRisco obraRisco) {
        ObraRisco = obraRisco;
    }
}
