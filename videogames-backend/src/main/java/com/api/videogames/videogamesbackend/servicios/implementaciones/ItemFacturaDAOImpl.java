package com.api.videogames.videogamesbackend.servicios.implementaciones;

import com.api.videogames.videogamesbackend.models.entities.ItemFactura;
import com.api.videogames.videogamesbackend.repositorios.ItemFacturaRepository;
import org.springframework.stereotype.Service;

@Service
public class ItemFacturaDAOImpl extends GenericoDAOImpl<ItemFactura, ItemFacturaRepository> implements com.api.videogames.videogamesbackend.servicios.dao.ItemFacturaDAO {
    public ItemFacturaDAOImpl(ItemFacturaRepository repository) {
        super(repository);
    }
}
