package com.zerobase.consumer.config

import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.*

@Configuration
@EnableJpaAuditing
@EnableJpaRepositories(basePackages = ["com.zerobase.domain"])
class JpaAuditingConfiguration