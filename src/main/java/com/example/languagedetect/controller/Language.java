package com.example.languagedetect.controller;

import com.example.languagedetect.service.LangService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Language {
    public LangService langService;

    public Language(LangService langService) {
        this.langService = langService;
    }

    @GetMapping("/language")
    public String lang() { return langService.language();}
}
