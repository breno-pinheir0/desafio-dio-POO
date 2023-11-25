package br.com.dio.desafio.dominio;

public abstract class Conteudo { // não é possível instanciar o conteúdo por causa da palavra abstract

    protected static final double XP_PADRAO = 10d; //final representa que é constante

    private String titulo;
    private String descricao;

    public abstract double calculaXP();

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }



}
