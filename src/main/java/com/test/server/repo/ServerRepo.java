package com.test.server.repo;

import com.test.server.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepo extends JpaRepository<Server, Long> {
    Server findByipAddress(String ipAddress);
}
