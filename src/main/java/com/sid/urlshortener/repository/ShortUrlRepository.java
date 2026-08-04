package com.sid.urlshortener.repository;

import com.sid.urlshortener.model.ShortUrl;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShortUrlRepository extends JpaRepository<ShortUrl,Integer> { // we use Integer as it is Wrapper class of primitive datatype int
}
/*
spring data jpa automatically creates concepts like
save()
findbyId()
deleteById() and all that...
 */