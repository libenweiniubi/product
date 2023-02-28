package com.calb.es.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author pandeng.li
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable
{
    private int id;
    private String name;
    private String pwd;
    private String perms;
    private String role;
}
