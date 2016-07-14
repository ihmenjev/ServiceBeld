package by.cromvel.servicebeld.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import by.cromvel.servicebeld.model.Contact;
import by.cromvel.servicebeld.model.Contragent;

@Repository("contactDaoImpl")
public class ContactDaoImpl extends AbstractDao<Integer, Contact> implements ContactDao {

	@Override
	public Contact getContactByLogin(String login) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("login", login));
		return (Contact) crit.uniqueResult();
	}

	@Override
	public Contragent getContragentByContact(Contact contact) {

		return contact.getContragent();
	}

	@Override
	public Contragent getContragentByContactId(int id) {
		// TODO Auto-generated method stub
		return getByKey(id).getContragent();
	}

	@Override
	public Contact getContactById(int id) {
		// TODO Auto-generated method stub
		return getByKey(id);
	}

}
