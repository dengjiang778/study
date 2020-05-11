package com.example.demo.Dao;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import java.util.List;

@Transactional
public class BaseDao<T> implements Serializable {

    @PersistenceContext
    private EntityManager entityManager;
    protected Class<T> clz = (Class) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];

    private Session getSession() {
        return (Session) this.entityManager.unwrap(Session.class);
    }

    public List<T> findAll(String hql) {
        Query query = getSession().createQuery(hql);
        return query.list();
    }

    public Long create(T t) {
        return (Long) getSession().save(t);
    }

    public void update(T t) {
        getSession().update(t);
    }

    public T load(Long id) {
        return this.getSession().load(this.clz, id);
    }

    public List<T> find(String hql, Object[] paras) {
        Query<T> query = getSession().createQuery(hql);
        if (paras == null) {
            paras = new Object[0];
        }
        this.setQueryParameters(paras, query);
        return query.list();
    }

    private void setQueryParameters(Object[] paras, Query query) {
        if (paras != null) {
            for(int i = 0; i < paras.length; ++i) {
                if (paras[i] instanceof Collection) {
                    query.setParameterList("list", (Collection)paras[i]);
                } else if (query instanceof NativeQuery) {
                    query.setParameter(i + 1, paras[i]);
                } else {
                    query.setParameter(i, paras[i]);
                }
            }

        }
    }
}
