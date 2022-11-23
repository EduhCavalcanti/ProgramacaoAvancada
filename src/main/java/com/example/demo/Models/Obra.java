package Models;

import java.math.BigInteger;

public class Obra {
    int Id;
    String Nome;
    BigInteger AnoConstruicao;
    String Coordenacao;
    String Gerencia;
    String Diretoria;
    String Outorga;
    String Titularidade;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public BigInteger getAnoConstruicao() {
        return AnoConstruicao;
    }

    public void setAnoConstruicao(BigInteger anoConstruicao) {
        AnoConstruicao = anoConstruicao;
    }

    public String getCoordenacao() {
        return Coordenacao;
    }

    public void setCoordenacao(String coordenacao) {
        Coordenacao = coordenacao;
    }

    public String getGerencia() {
        return Gerencia;
    }

    public void setGerencia(String gerencia) {
        Gerencia = gerencia;
    }

    public String getDiretoria() {
        return Diretoria;
    }

    public void setDiretoria(String diretoria) {
        Diretoria = diretoria;
    }

    public String getOutorga() {
        return Outorga;
    }

    public void setOutorga(String outorga) {
        Outorga = outorga;
    }

    public String getTitularidade() {
        return Titularidade;
    }

    public void setTitularidade(String titularidade) {
        Titularidade = titularidade;
    }
}
