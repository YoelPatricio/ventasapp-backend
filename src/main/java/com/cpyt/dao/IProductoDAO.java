package com.cpyt.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cpyt.model.Producto;

@Repository
public interface IProductoDAO extends JpaRepository<Producto, Integer>{

}
