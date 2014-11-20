package fr.treeptik.runtime;

import fr.treeptik.pojo.Type;
import fr.treeptik.service.ServiceFactory;

public class Main {

	public static void main(String[] args) {
		Type type = new Type(null,"Domicile");
		ServiceFactory.getTypeService().create(type);

	}

}
