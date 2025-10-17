/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.view;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Débora Alves
 */
public class Usuario {
     private Long id;
    private PerfilUsuario perfil;
    private String nomeUsuario;
    private String email;
    private String senha;
    private LocalDateTime ultimoLogin;
    private boolean ativo;

    private final List<LogAuditoria> logs = new ArrayList<>();
    private final List<Sessao> sessoes = new ArrayList<>();

    private static long logCounter = 0;
    private static long sessionCounter = 0;

    // Construtor completo
    public Usuario(Long id, PerfilUsuario perfil, String nomeUsuario, String email, String senha) {
        this.id = id;
        this.perfil = perfil;
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.senha = senha;
        this.ativo = true;
    }

    // Getters e setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public PerfilUsuario getPerfil() { return perfil; }
    public void setPerfil(PerfilUsuario perfil) { this.perfil = perfil; }

    public String getNomeUsuario() { return nomeUsuario; }
    public void setNomeUsuario(String nomeUsuario) { this.nomeUsuario = nomeUsuario; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }

    public LocalDateTime getUltimoLogin() { return ultimoLogin; }
    public void setUltimoLogin(LocalDateTime ultimoLogin) { this.ultimoLogin = ultimoLogin; }

    public boolean isAtivo() { return ativo; }
    public void setAtivo(boolean ativo) { this.ativo = ativo; }

    public List<LogAuditoria> getLogs() { return logs; }
    public List<Sessao> getSessoes() { return sessoes; }

    public static long getLogCounter() { return logCounter; }
    public static long getSessionCounter() { return sessionCounter; }

    @Override
    public String toString() {
        return "Usuario{" +
               "id=" + id +
               ", nomeUsuario='" + nomeUsuario + '\'' +
               ", email='" + email + '\'' +
               ", ativo=" + ativo +
               ", ultimoLogin=" + ultimoLogin +
               ", #logs=" + logs.size() +
               ", #sessoes=" + sessoes.size() +
               '}';
    }

    // Retorna todos os logs em forma de string
    public String logsToString() {
        StringBuilder sb = new StringBuilder();
        for (LogAuditoria l : logs) {
            sb.append(l).append("\n");
        }
        return sb.toString();
    }

    // Valida login e registra log
    public void logar(String senhaDigitada) {
        if (this.senha.equals(senhaDigitada)) {
            this.ultimoLogin = LocalDateTime.now();
            long newId = ++logCounter;
            LogAuditoria log = new LogAuditoria(newId, this, "Login Feito com sucesso", LocalDateTime.now(), "127.0.0.1");
            logs.add(log);
            System.out.println("Log criado: " + log);
        } else {
            long newId = ++logCounter;
            LogAuditoria log = new LogAuditoria(newId, this, "Falha no login", LocalDateTime.now(), "127.0.0.1");
            logs.add(log);
            System.out.println("Senha incorreta. Log criado: " + log);
        }
    }

    // Cria uma nova sessão com token único
    public Sessao criarSessao() {
        long newId = ++sessionCounter;
        String token = "token_" + this.nomeUsuario + "_" + System.currentTimeMillis();
        Sessao sessao = new Sessao(newId, this, token);
        sessoes.add(sessao);
        System.out.println("Sessão criada: " + sessao);
        return sessao;
    }
}
