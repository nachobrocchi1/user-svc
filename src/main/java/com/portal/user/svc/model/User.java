package com.portal.user.svc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*Modelo de la clase usuario*/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private long id;
    private String name , lastName , email , password ;
    private Boolean isAdm;

}


