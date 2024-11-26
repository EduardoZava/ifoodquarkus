package com.ezava.ifood.cadastro.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
//import com.ezava.ifood.cadastro.entity.Restaurante;
import java.time.LocalDateTime;

@Entity
@Table(name = "prato")
public class Prato extends PanacheEntityBase{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String nome;
    public String descricao;

    @ManyToOne
    public Restaurante restaurante;
    public BigDecimal preco;
    @CreationTimestamp
    public LocalDateTime dtCriacao;
    @UpdateTimestamp
    public LocalDateTime dtAtualizacao;

    public static Prato findByRestaurante(Long idRestaurante) {
        return find("restaurante.id", idRestaurante).firstResult();
    }
}
