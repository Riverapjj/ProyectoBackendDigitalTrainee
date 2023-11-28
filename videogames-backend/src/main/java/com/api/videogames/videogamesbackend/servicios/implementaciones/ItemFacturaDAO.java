package com.api.videogames.videogamesbackend.servicios.implementaciones;

import com.api.videogames.videogamesbackend.models.entities.ItemFactura;
import com.api.videogames.videogamesbackend.repositorios.ItemFacturaRepository;
import org.springframework.stereotype.Service;

@Service
public class ItemFacturaDAO extends GenericoDAOImpl<ItemFactura, ItemFacturaRepository> implements com.api.videogames.videogamesbackend.servicios.dao.ItemFacturaDAO {
    public ItemFacturaDAO(ItemFacturaRepository repository) {
        super(repository);
    }
}
