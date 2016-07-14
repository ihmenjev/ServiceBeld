package by.cromvel.servicebeld.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractDao<PK extends Serializable, T> {

	private final Class<T> persistentClass;

	@SuppressWarnings("unchecked")
	public AbstractDao() {
		this.persistentClass = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass())
				.getActualTypeArguments()[1];
	}

	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	public T getByKey(PK key) {
		return (T) getSession().get(persistentClass, key);
	}

	public void insertPersist(T entity) {
		getSession().persist(entity);
	}

	public void deletePersist(T entity) {
		getSession().delete(entity);
	}

	public Criteria createEntityCriteria() {

		return getSession().createCriteria(persistentClass);

	}

	@SuppressWarnings("unchecked")
	public List<T> LoadList() {
		return (List<T>) getSession().createQuery("from " + persistentClass.getName()).list();
	}

	public void update(T entity) {
		getSession().saveOrUpdate(entity);
	}

}
