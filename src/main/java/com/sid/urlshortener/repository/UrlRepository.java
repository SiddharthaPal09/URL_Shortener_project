package com.sid.urlshortener.repository;

import com.sid.urlshortener.entity.Url;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UrlRepository extends JpaRepository<Url,Long> { // we use Integer as it is Wrapper class of primitive datatype int


    Optional<Url> findByShortCode(String shortCode);

    Boolean existByShortCode(String shortCode);

    List<Url>findAllByUserIdOrderCreatedtDesc(Long userId);

    // Query ?



}
/*
spring data jpa automatically creates concepts like
save()
findbyId()
deleteById() and all that...
 */