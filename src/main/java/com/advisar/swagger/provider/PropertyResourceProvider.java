package com.advisar.swagger.provider;

import com.advisar.swagger.config.SwaggerServicesConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.LinkedList;
import java.util.List;

@Primary
@Configuration
class PropertyResourceProvider implements SwaggerResourcesProvider {

    @Autowired
    private SwaggerServicesConfig config;

    @Override
    public List<SwaggerResource> get() {
        LinkedList<SwaggerResource> resources = new LinkedList<>();
        config.getServices().stream().forEach(service ->
                resources.add(swaggerResource(
                        service.name,
                        service.url,
                        service.version)));
        return resources;
}

    private SwaggerResource swaggerResource(String name, String location, String version) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(location);
        swaggerResource.setSwaggerVersion(version);
        return swaggerResource;
    }
}
