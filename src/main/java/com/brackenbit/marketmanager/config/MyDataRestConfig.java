/*
 * Market Manager
 * (C) Brackenbit 2023
 */

package com.brackenbit.marketmanager.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.brackenbit.marketmanager.entity.MarketEvent;
import com.brackenbit.marketmanager.entity.Stallholder;
import com.brackenbit.marketmanager.entity.StallholderCategory;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {

    private String allowedOrigins = "http://localhost:3000";

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {

        HttpMethod[] unsupportedActions = { HttpMethod.POST, HttpMethod.PATCH, HttpMethod.DELETE, HttpMethod.PUT };

        // Allow exposing primary IDs over API
        // (Disabled by default for Spring Boot)
        config.exposeIdsFor(Stallholder.class);
        config.exposeIdsFor(StallholderCategory.class);
        config.exposeIdsFor(MarketEvent.class);

        // Make automagic API read-only
        disableHttpMethods(Stallholder.class, config, unsupportedActions);
        disableHttpMethods(StallholderCategory.class, config, unsupportedActions);
        disableHttpMethods(MarketEvent.class, config, unsupportedActions);

        // Configure CORS mapping
        cors.addMapping(config.getBasePath() + "/**").allowedOrigins(allowedOrigins);
    }

    private void disableHttpMethods(Class theClass, RepositoryRestConfiguration config,
            HttpMethod[] unsupportedActions) {
        config.getExposureConfiguration().forDomainType(theClass)
                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(unsupportedActions))
                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(unsupportedActions));
    }

}
