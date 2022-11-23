package Models;

import Enums.InspecaoFrequencia;
import Enums.InspecaoStatus;

public class ObraInspecao {
    int Id;
    InspecaoFrequencia Frequencia;
    int Mes;
    InspecaoStatus Status;
    int Prioridade;
    Obra Obra;

    public InspecaoFrequencia getFrequencia() {
        return Frequencia;
    }

    public void setFrequencia(InspecaoFrequencia frequencia) {
        Frequencia = frequencia;
    }

    public int getMes() {
        return Mes;
    }

    public void setMes(int mes) {
        Mes = mes;
    }

    public InspecaoStatus getStatus() {
        return Status;
    }

    public void setStatus(InspecaoStatus status) {
        Status = status;
    }

    public int getPrioridade() {
        return Prioridade;
    }

    public void setPrioridade(int prioridade) {
        Prioridade = prioridade;
    }
}
