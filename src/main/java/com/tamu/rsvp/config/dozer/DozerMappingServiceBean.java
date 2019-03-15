package com.tamu.rsvp.config.dozer;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by bgowda on 26/02/17.
 */
@Service
public class DozerMappingServiceBean implements DozerMappingService {


    private DozerBeanMapper dozerBeanMapper;

    @Autowired
    public void setDozerBeanMapper(DozerBeanMapper dozerBeanMapper) {
        this.dozerBeanMapper = dozerBeanMapper;
    }


    @Override
    public <T> T map(Object source, Class<T> destinationClass) {

        if(source == null) return null;
        return dozerBeanMapper.map(source, destinationClass);

    }

    @Override
    public <T> T map(Object source, T destination) {
        if(source == null) return null;
        dozerBeanMapper.map(source, destination);
        return destination;
    }

    @Override
    public <T,S> List<T> mapCollection(Collection<S> source, Class<T> destinationElementClass) {

        if(source == null) return null;

        List<T> transformedList = new ArrayList<T>();

        for(Object element: source)
        {
            transformedList.add(this.map(element, destinationElementClass));
        }

        return transformedList;

    }
}