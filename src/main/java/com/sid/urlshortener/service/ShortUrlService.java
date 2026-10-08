package com.sid.urlshortener.service;

import com.sid.urlshortener.entity.Url;
import com.sid.urlshortener.repository.UrlRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShortUrlService {
    private final UrlRepository shortUrlRepository; // final as in CI,the repo is provided once
                                                       // when service is created once and never changes

    public ShortUrlService(UrlRepository shortUrlRepository) {
        this.shortUrlRepository= shortUrlRepository;
    }

    //CREATE
    public Url createShortUrl(Url shortUrl){
         return shortUrlRepository.save(shortUrl);
    }

    //GET URL
    public List<Url> getAllShortUrls(){
        return shortUrlRepository.findAll();
    }

    //GET URL BY ID
    public Optional<Url> getShortUrlById(Long id){
        return shortUrlRepository.findById(id);
    }

    //UPDATE URL BY ID
    public Url updateShortUrlById(Long id, Url shortUrl){
        return shortUrlRepository.save(shortUrl);
    }

    //DELETE BY ID
    public void deleteShortUrlById(Long id){
        shortUrlRepository.deleteById(id);
    }

}
