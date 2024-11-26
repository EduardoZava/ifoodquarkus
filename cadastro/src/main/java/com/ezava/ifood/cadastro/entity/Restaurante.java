package com.ezava.ifood.cadastro.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;

import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.CascadeType;
import java.util.Date;
import java.util.List;
import java.time.LocalDateTime;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;


@Entity
@Table(name = "restaurante")
public class Restaurante extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String nome;
    public String proprietario;
    public String cnpj;
    @OneToOne(cascade = CascadeType.ALL)
    public Localizacao localizacao;

    //public List<Prato>  pratos;
    @CreationTimestamp
    public LocalDateTime dtCriacao;
    @UpdateTimestamp
    public LocalDateTime dtAtualizacao;

    public static Restaurante findByCnpj(String cnpj) {
        return find("cnpj", cnpj).firstResult();
    }
}
