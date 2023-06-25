package io.security.corespringsecurity.config;

import io.security.corespringsecurity.repository.ResourcesRepository;
import io.security.corespringsecurity.service.SecurityResourcesService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class AppConfig {
    @Bean
    public SecurityResourcesService securityResourceService(ResourcesRepository resourcesRepository) {
        SecurityResourcesService securityResourcesService = new SecurityResourcesService(resourcesRepository);
        return securityResourcesService;
    }
}
