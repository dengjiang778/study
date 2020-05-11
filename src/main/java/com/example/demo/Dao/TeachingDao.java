package com.example.demo.Dao;

import com.example.demo.model.Teaching;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TeachingDao extends BaseDao<Teaching> {

    public List<Teaching> find() {
        StringBuilder hql = new StringBuilder("From Teaching");
        return super.findAll(hql.toString());
    }

    public List<Teaching> find(Teaching teaching) {
        StringBuilder hql = new StringBuilder("From Teaching");
        List<Object> paras = new ArrayList<>();
        hql.append(" where id = ?0 ");
        paras.add(teaching.getId());
        return super.find(hql.toString(), paras.toArray());
    }

    public Long create(Teaching teaching) {
        return super.create(teaching);
    }


    public void update(Teaching teaching) {
        super.update(teaching);
    }
}
