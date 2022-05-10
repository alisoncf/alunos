/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

/**
 *
 * @author Administrador
 */

@Data  @AllArgsConstructor @NoArgsConstructor
public class Aluno implements Serializable {
    private Long id;
    private String nome;
    private String email;
    private String senha;

    
    
    
}
