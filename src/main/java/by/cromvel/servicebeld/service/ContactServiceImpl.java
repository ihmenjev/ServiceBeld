package by.cromvel.servicebeld.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import by.cromvel.servicebeld.dao.ContactDao;
import by.cromvel.servicebeld.model.Contact;

@Service("contactService")
@Transactional
public class ContactServiceImpl implements ContactService {

	@Autowired
	ContactDao contactDao;

	@Override
	public Contact getContactByLogin(String login) {

		return contactDao.getContactByLogin(login);
	}

	@Override
	public Contact getContactById(int id) {

		return contactDao.getContactById(id);
	}

}
