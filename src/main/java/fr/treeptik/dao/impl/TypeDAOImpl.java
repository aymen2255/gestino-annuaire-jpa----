package fr.treeptik.dao.impl;

import fr.treeptik.dao.TypeDAO;
import fr.treeptik.jpaUtil.JPAUtil;
import fr.treeptik.pojo.Type;

public class TypeDAOImpl implements TypeDAO {

	@Override
	public Type create(Type type) {
		JPAUtil.getEntityManager().persist(type);
		return type;
	}

	@Override
	public Type update(Type obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Type obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Type find(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}



	
}








