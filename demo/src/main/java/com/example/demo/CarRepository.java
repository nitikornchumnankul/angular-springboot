package com.example.demo;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.jpa.repository.JpaRepository;

@RepositoryRestResource
interface CarRepository extends JpaRepository<Car, Long> {
    
}
