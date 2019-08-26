package com.mytasksql.entity;

import lombok.Data;

public @Data class UserAddress extends EntityBase {
	
//	  Exemplo:
//    "cep": "01001-000",
//    "logradouro": "Praça da Sé",
//    "complemento": "lado ímpar",
//    "bairro": "Sé",
//    "localidade": "São Paulo",
//    "uf": "SP",
//    "unidade": "",
//    "ibge": "3550308",
//    "gia": "1004"
	
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String unidade;
    private String ibge;
    private String gia;

}
