package Models;

import Enums.ObraRisco;
import Enums.ObraTipo;

public class ObraDetalheTecnicos {
    int Id;
    ObraTipo ObraTipo;
    ObraRisco ObraRisco;
    Obra Obra;

    public Enums.ObraTipo getObraTipo() {

        return ObraTipo;
    }

    public void setObraTipo(Enums.ObraTipo obraTipo) {
        ObraTipo = obraTipo;
    }

    public Enums.ObraRisco getObraRisco() {
        return ObraRisco;
    }

    public void setObraRisco(Enums.ObraRisco obraRisco) {
        ObraRisco = obraRisco;
    }
}
