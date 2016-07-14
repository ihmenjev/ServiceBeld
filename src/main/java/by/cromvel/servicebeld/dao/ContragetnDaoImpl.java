package by.cromvel.servicebeld.dao;

import org.springframework.stereotype.Repository;

import by.cromvel.servicebeld.model.Contragent;

@Repository("contragentDaoImpl")
public class ContragetnDaoImpl extends AbstractDao<Integer, Contragent> implements ContragentDao {

	@Override
	public Contragent getContragentById(int id) {

		return getByKey(id);
	}

}
