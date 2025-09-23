package com.universidade.aluguelcarros.model;

import java.io.Serializable;

public abstract class Entidade implements Serializable {
    protected Long id;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
}