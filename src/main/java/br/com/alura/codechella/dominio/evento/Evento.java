package br.com.alura.codechella.dominio.evento;

import br.com.alura.codechella.aplicacao.evento.DadosEndereco;
import br.com.alura.codechella.dominio.ingresso.TipoIngresso;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Evento {

    private Categoria categoria;
    private String descricao;
    private DadosEndereco endereco;
    private LocalDateTime data;
    private List<TipoIngresso> tipoIngressos = new ArrayList<>();

    public Categoria getCategoria() {
        return categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public DadosEndereco getEndereco() {
        return endereco;
    }

    public LocalDateTime getData() {
        return data;
    }

    public List<TipoIngresso> getTipoIngressos() {
        return tipoIngressos;
    }

    public void incluiNovoTipoDeIngresso(TipoIngresso tipoIngresso){
        this.tipoIngressos.add(tipoIngresso);
    }

}
