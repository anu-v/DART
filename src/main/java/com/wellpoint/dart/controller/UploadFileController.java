package com.wellpoint.dart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UploadFileController {

	@GetMapping("/")
	 public String index() {
        return "in Upload File controller";
    }
}
