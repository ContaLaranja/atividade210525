package com.example.aula.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table (name = "tab_jogadores")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome é obrigatório.")
    private String nome;

    @NotBlank(message = "Sexo é obrigatório.")
    private String sexo;

    @NotNull(message = "Idade é obrigatória.")
    private Integer idade;

    @NotNull(message = "Altura é obrigatória.")
    private Double altura;

    @NotNull(message = "Peso é obrigatório.")
    private Double peso;

    @NotBlank(message = "Posição é obrigatória.")
    private String posicao;

    @NotNull(message = "Número da camisa é obrigatório.")
    private Integer numeroCamisa;

    public Usuario() {}

    // Getters e setters para todos os campos

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getSexo() { return sexo; }
    public void setSexo(String sexo) { this.sexo = sexo; }

    public Integer getIdade() { return idade; }
    public void setIdade(Integer idade) { this.idade = idade; }

    public Double getAltura() { return altura; }
    public void setAltura(Double altura) { this.altura = altura; }

    public Double getPeso() { return peso; }
    public void setPeso(Double peso) { this.peso = peso; }

    public String getPosicao() { return posicao; }
    public void setPosicao(String posicao) { this.posicao = posicao; }

    public Integer getNumeroCamisa() { return numeroCamisa; }
    public void setNumeroCamisa(Integer numeroCamisa) { this.numeroCamisa = numeroCamisa; }
}