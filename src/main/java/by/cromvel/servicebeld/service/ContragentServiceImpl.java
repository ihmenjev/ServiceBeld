package by.cromvel.servicebeld.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import by.cromvel.servicebeld.dao.ContactDao;
import by.cromvel.servicebeld.dao.ContragentDao;
import by.cromvel.servicebeld.model.Contact;
import by.cromvel.servicebeld.model.Contragent;

@Service("contragentService")
@Transactional
public class ContragentServiceImpl implements ContragentService {

	@Autowired
	ContragentDao contragentDao;

	@Autowired
	ContactDao contactDao;

	@Override
	public Contragent getContragentById(int id) {

		return contragentDao.getContragentById(id);
	}

	@Override
	public Contragent getContragentByContact(Contact contact) {

		return contactDao.getContragentByContact(contact);
	}

	@Override
	public Contragent getContragentByContactId(int id) {

		return contactDao.getContragentByContactId(id);
	}

}
