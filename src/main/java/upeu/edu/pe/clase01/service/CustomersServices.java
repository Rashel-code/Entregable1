package upeu.edu.pe.clase01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import upeu.edu.pe.clase01.dao.Operaciones;
import upeu.edu.pe.clase01.daoImpl.CustomersDaoImpl;
import upeu.edu.pe.clase01.entity.customers;

public class CustomersServices implements Operaciones<customers> {

	@Autowired
	private CustomersDaoImpl daoImpl;
	
	@Override
	public int create(customers t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(customers t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public customers read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<customers> readAll() {
		// TODO Auto-generated method stub
		return daoImpl.readAll();
	}

	
	
	
}
