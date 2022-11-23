package Models;

import java.util.Date;

public class Inspecao {
    int Id;
    Date Data;
    String Observacoes;
    ObraInspecao ObraInspecao;

    public Date getData() {
        return Data;
    }

    public void setData(Date data) {
        Data = data;
    }

    public String getObservacoes() {
        return Observacoes;
    }

    public void setObservacoes(String observacoes) {
        Observacoes = observacoes;
    }
}
