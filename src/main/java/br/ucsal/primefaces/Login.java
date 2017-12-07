package br.ucsal.primefaces;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="login")
public class Login {

    private String usuario = "";
    private String senha = "";

    

    public String login() {
        return "Usuario " + " " + usuario + "!";
    }



	public String getSenha() {
		return senha;
	}



	public void setSenha(String senha) {
		this.senha = senha;
	}



	public String getUsuario() {
		return usuario;
	}



	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
}
