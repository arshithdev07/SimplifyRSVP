package com.tamu.rsvp.config.dozer;

import java.util.Collection;
import java.util.List;

/**
 * Created by bgowda on 26/02/17.
 */
public interface DozerMappingService {

    public <T> T map(Object source, Class<T> destinationClass);

    public <T> T map(Object source, T destination);

    public <T, S> List<T> mapCollection(Collection<S> source,
                                                 Class<T> destinationElementClass);

}

