package com.sina.necomaker.gilgamesh.client.kubo.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable{

    private static final long serialVersionUID = 6629277628633382861L;
    private String name;
    private Integer age;
}
