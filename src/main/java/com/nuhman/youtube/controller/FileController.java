package com.nuhman.youtube.controller;

import com.nuhman.youtube.service.FileStorageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/file")
public class FileController {

    @Autowired
    FileStorageService fileStorageService;

    Logger logger = LoggerFactory.getLogger(FileController.class);


    @PostMapping("/upload")
    public String addPost(@RequestParam("file") MultipartFile file) {
        logger.info("File received: "+file.getOriginalFilename());
        return fileStorageService.storeFile(file);
    }



}
