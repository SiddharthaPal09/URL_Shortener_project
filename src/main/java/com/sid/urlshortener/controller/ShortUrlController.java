package com.sid.urlshortener.controller;

import com.sid.urlshortener.entity.Url;
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
    public List<Url> getAllShortUrls(){
        return shortUrlService.getAllShortUrls();
    }

    @PostMapping
    public Url createShortUrl(@RequestBody Url shortUrl){
        return shortUrlService.createShortUrl(shortUrl);
    }

    @GetMapping("/{id}")
    public Optional<Url> getShortUrlById(@PathVariable Long id){
        return shortUrlService.getShortUrlById(id);
    }

    @PutMapping("/{id}")
    public Url updateShortUrl(@PathVariable Long id, @RequestBody Url shortUrl){
        return shortUrlService.updateShortUrlById(id , shortUrl);
    }

    @DeleteMapping("/{id}")
    public void deleteShortUrlById(@PathVariable Long id){
        shortUrlService.deleteShortUrlById(id);
    }

}
