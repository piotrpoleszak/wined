package com.application.wined.service.impl;

import com.application.wined.entity.Wine;
import com.application.wined.repository.WineRepository;
import com.application.wined.service.WineService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WineServiceImpl implements WineService
{
    private WineRepository wineRepository;

    public WineServiceImpl(WineRepository wineRepository)
    {
        super();
        this.wineRepository = wineRepository;
    }

    @Override
    public List<Wine> getAllWines()
    {
        return wineRepository.findAll();
    }

    @Override
    public Wine saveWine(Wine wine)
    {
        return wineRepository.save(wine);
    }

    @Override
    public Wine getWineById(Long id)
    {
        return wineRepository.findById(id).get();
    }

    @Override
    public Wine updateWine(Wine wine)
    {
        return wineRepository.save(wine);
    }

    @Override
    public void deleteWineById(Long id)
    {
        wineRepository.deleteById(id);
    }

}
