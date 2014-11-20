package fr.treeptik.serviceImpl;

import fr.treeptik.dao.DAOFactory;
import fr.treeptik.jpaUtil.JPAUtil;
import fr.treeptik.pojo.Type;
import fr.treeptik.service.TypeService;

public class TypeServiceImpl implements TypeService{

	@Override
	public Type create(Type type) {
		JPAUtil.beginTX();
		DAOFactory.getTypeDAO().create(type);
		JPAUtil.commitTX();
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
