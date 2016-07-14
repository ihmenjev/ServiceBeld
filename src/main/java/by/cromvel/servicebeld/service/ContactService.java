package by.cromvel.servicebeld.service;

import by.cromvel.servicebeld.model.Contact;

public interface ContactService {

	public Contact getContactByLogin(String login);

	public Contact getContactById(int id);

}
