package com.sid.urlshortener.controller;

import com.sid.urlshortener.entity.ShortUrl;
import com.sid.urlshortener.service.ShortUrlService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/urls")
public class ShortUrlController {
    private final ShortUrlService shortUrlService;

    public ShortUrlController(ShortUrlService shortUrlService) {
        this.shortUrlService = shortUrlService;
    }

    @GetMapping
    public List<ShortUrl> getAllShortUrls(){
        return shortUrlService.getAllShortUrls();
    }

    @PostMapping
    public ShortUrl createShortUrl(@RequestBody ShortUrl shortUrl){
        return shortUrlService.createShortUrl(shortUrl);
    }

    @GetMapping("/{id}")
    public Optional<ShortUrl> getShortUrlById(@PathVariable Long id){
        return shortUrlService.getShortUrlById(id);
    }

    @PutMapping("/{id}")
    public ShortUrl updateShortUrl(@PathVariable Long id,@RequestBody ShortUrl shortUrl){
        return shortUrlService.updateShortUrlById(id , shortUrl);
    }

    @DeleteMapping("/{id}")
    public void deleteShortUrlById(@PathVariable Long id){
        shortUrlService.deleteShortUrlById(id);
    }

}
