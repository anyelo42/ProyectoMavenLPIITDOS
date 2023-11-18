package Interfaces;

import java.util.List;

import model.TblUsuario;

public interface Iusuarioable {
//declaramos los respectios metodos 
	public void RegistrarUsuario(TblUsuario usu);
	public void ActualizarUsuario(TblUsuario usu);
	public void EliminarUsuario(TblUsuario usu );
	public List<TblUsuario> ListadoUsuario();
	public TblUsuario BuscarUsuario(TblUsuario usu);
	public String ValidarUsuario(TblUsuario usu);
}
