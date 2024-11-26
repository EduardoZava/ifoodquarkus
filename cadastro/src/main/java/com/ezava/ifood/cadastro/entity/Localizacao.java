package com.ezava.ifood.cadastro.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "localizacao")
public class Localizacao extends PanacheEntityBase{

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        public Long id;
        public Double latitude;
        public Double longitude;
}
