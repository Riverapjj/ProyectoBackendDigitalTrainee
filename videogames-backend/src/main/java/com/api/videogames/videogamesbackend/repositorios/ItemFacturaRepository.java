package com.api.videogames.videogamesbackend.repositorios;

import com.api.videogames.videogamesbackend.models.entities.Factura;
import com.api.videogames.videogamesbackend.models.entities.ItemFactura;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ItemFacturaRepository extends CrudRepository<ItemFactura,Integer> {
    @Query("select d from ItemFactura d where d.id = ?1")
    Iterable<ItemFactura> findById(String ItemFacturaId);
}
