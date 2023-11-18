package Interfaces;

import java.util.List;

import model.TblAuto;

public interface Iautoable {
//declaramos los metodos
	
	public void RegistrarAuto(TblAuto tblauto);
	public void ActualizarAuto(TblAuto tbauto);
	public void EliminarAuto(TblAuto tblauto);
	public TblAuto BuscarAuto(TblAuto tblauto);
	public List<TblAuto> Listado();
	
	
	
	
}//find de a interface
