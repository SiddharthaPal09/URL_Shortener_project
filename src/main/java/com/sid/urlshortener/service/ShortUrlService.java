package com.sid.urlshortener.service;

import com.sid.urlshortener.entity.ShortUrl;
import com.sid.urlshortener.repository.ShortUrlRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShortUrlService {
    private final ShortUrlRepository shortUrlRepository; // final as in CI,the repo is provided once
                                                       // when service is created once and never changes

    public ShortUrlService(ShortUrlRepository shortUrlRepository) {
        this.shortUrlRepository= shortUrlRepository;
    }

    //CREATE
    public ShortUrl createShortUrl(ShortUrl shortUrl){
         return shortUrlRepository.save(shortUrl);
    }

    //GET URL
    public List<ShortUrl> getAllShortUrls(){
        return shortUrlRepository.findAll();
    }

    //GET URL BY ID
    public Optional<ShortUrl> getShortUrlById(Long id){
        return shortUrlRepository.findById(id);
    }

    //UPDATE URL BY ID
    public ShortUrl updateShortUrlById(Long id,ShortUrl shortUrl){
        return shortUrlRepository.save(shortUrl);
    }

    //DELETE BY ID
    public void deleteShortUrlById(Long id){
        shortUrlRepository.deleteById(id);
    }

}
