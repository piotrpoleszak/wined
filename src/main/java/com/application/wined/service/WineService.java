package com.application.wined.service;

import com.application.wined.entity.Wine;

import java.util.List;

public interface WineService
{
    List<Wine> getAllWines();

    Wine saveWine(Wine wine);

    Wine getWineById(Long id);

    Wine updateWine(Wine wine);

    void deleteWineById(Long id);
}
