package com.sid.urlshortener.repository;

import com.sid.urlshortener.entity.ShortUrl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ShortUrlRepository extends JpaRepository<ShortUrl,Long> { // we use Integer as it is Wrapper class of primitive datatype int


    Optional<ShortUrl> findByid(Long id);
}
/*
spring data jpa automatically creates concepts like
save()
findbyId()
deleteById() and all that...
 */