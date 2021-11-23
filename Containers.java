package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Containers implements Comparable<Containers> {
    private int numId;
    private String descricao;
    private String paisOrigem;
    private boolean materiaisPerigosos;


    public Containers(int numId, String descricao, String paisOrigem,
                      boolean materiaisPerigosos) {
        this.numId = numId;
        this.descricao = descricao;
        this.paisOrigem = paisOrigem;
        this.materiaisPerigosos = materiaisPerigosos;
    }

    public int getNumId() {
        return numId;
    }

    public void setNumId(int numId) {
        this.numId = numId;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public boolean isMateriaisPerigosos() {
        return materiaisPerigosos;
    }

    public void setMateriaisPerigosos(boolean materiaisPerigosos) {
        this.materiaisPerigosos = materiaisPerigosos;
    }


    @Override
    public int compareTo(Containers o) {
        if (o.numId == this.numId) {
            return 0;
        } else if (o.numId < this.numId){
            return 1;
        } else {
            return -1;
        }
    }
}
