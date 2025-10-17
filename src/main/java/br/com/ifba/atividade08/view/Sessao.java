/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.view;

/**
 *
 * @author Débora Alves
 */
public class Sessao {
   private Long id;
    private Usuario usuario;
    private String token; // Token único da sessão

    // Construtor
    public Sessao(Long id, Usuario usuario, String token) {
        this.id = id;
        this.usuario = usuario;
        this.token = token;
    }

    // Getters e setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }

    public String getToken() { return token; }
    public void setToken(String token) { this.token = token; }

    @Override
    public String toString() {
        return "Sessao{" +
               "id=" + id +
               ", usuario=" + usuario.getNomeUsuario() +
               ", token='" + token + '\'' +
               '}';
    }
}   
