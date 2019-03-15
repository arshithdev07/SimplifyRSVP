package com.tamu.rsvp.config.dozer;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bgowda on 23/01/17.
 */
@Configuration
public class DozerConfig {

    @Value("${dozer.mapping.xml:dozer/mapping.xml}" )
    private String dozerMappingXml;

    @Bean
    public DozerBeanMapper getMapper() {

        List<String> myMappingFiles = new ArrayList<>();
        myMappingFiles.add(dozerMappingXml);

        DozerBeanMapper mapper = new DozerBeanMapper();

        mapper.setMappingFiles(myMappingFiles);

        return mapper;

    }

}
