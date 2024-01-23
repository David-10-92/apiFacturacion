package com.david.apiDemo.repository;

import com.david.apiDemo.model.Articulo;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;


@Repository
public class ArticuloDAOImpl implements ArticuloDAO {

    private final EntityManager entityManager;

    @Autowired
    public ArticuloDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Collection<Articulo> findArticulos() {
        return entityManager.createQuery("from Articulo").getResultList();
    }
}
