package com.musinsa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Board {

    public Board() {
        System.out.println("smdfklsmdfklsmdfklm");
    }

    @Id
    private Long id;

}
