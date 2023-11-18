package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.Iautoable;
import model.TblAuto;

public class ClassCrudAuto implements Iautoable{

	@Override
	public void RegistrarAuto(TblAuto tblauto) {
		// TODO Auto-generated method stub
		EntityManagerFactory em=Persistence.createEntityManagerFactory("ProyectoMavenLpTDOS");
		//gestionar las entidades
		EntityManager emanager=em.createEntityManager();
		//iniciamos la transaccion
		emanager.getTransaction().begin();
		emanager.persist(tblauto);
		System.out.println("auto registrado en BD");
		
		emanager.getTransaction().commit();
		emanager.close();
		
	}

	@Override
	public void ActualizarAuto(TblAuto tbauto) {
		// TODO Auto-generated method stub
		EntityManagerFactory em=Persistence.createEntityManagerFactory("ProyectoMavenLpTDOS");
		//gestionar las entidades
		EntityManager emanager=em.createEntityManager();
		//iniciamos la transaccion
		emanager.getTransaction().begin();
		//actualizar
		emanager.merge(tbauto);
		System.out.println("auto actualizado en BD");
		
		emanager.getTransaction().commit();
		emanager.close();
		
		
		
		
		
	}

	@Override
	public void EliminarAuto(TblAuto tblauto) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory em=Persistence.createEntityManagerFactory("ProyectoMavenLpTDOS");
		//gestionar las entidades
		EntityManager emanager=em.createEntityManager();
		//iniciamos la transaccion
		emanager.getTransaction().begin();
		//RECUPERAMOS EL CODIGO A ELIMINAR 
		TblAuto elim=emanager.merge(tblauto);
		//eliminamos 
		emanager.remove(elim);
		
		
		System.out.println("auto eliminado en BD");
		
		emanager.getTransaction().commit();
		emanager.close();
		
		
		
	}

	@Override
	public TblAuto BuscarAuto(TblAuto tblauto) {
		// TODO Auto-generated method stub
		EntityManagerFactory em=Persistence.createEntityManagerFactory("ProyectoMavenLpTDOS");
		//gestionar las entidades
		EntityManager emanager=em.createEntityManager();
		//iniciamos la transaccion
		emanager.getTransaction().begin();
		//RECUPERAMOS EL CODIGO A ELIMINAR 
		TblAuto buscar=emanager.find(TblAuto.class,tblauto.getIdauto());
		//eliminamos 
		
		
		
		emanager.getTransaction().commit();
		emanager.close();
		
		
		return buscar;
		
		
		
	}

	@Override
	public List<TblAuto> Listado() {
		// TODO Auto-generated method stub
		
		EntityManagerFactory em=Persistence.createEntityManagerFactory("ProyectoMavenLpTDOS");
		//gestionar las entidades
		EntityManager emanager=em.createEntityManager();
		//iniciamos la transaccion
		emanager.getTransaction().begin();
		//RECUPERAMOS EL CODIGO A ELIMINAR 
		List<TblAuto> listado=emanager.createQuery("select a from TblAuto a ",TblAuto.class).getResultList();
		//eliminamos 
		
		
		
		emanager.getTransaction().commit();
		emanager.close();
		
		
		
		
		
		
		
		return listado;
	}

	
	
	
	
	
}//fin de la clase 
