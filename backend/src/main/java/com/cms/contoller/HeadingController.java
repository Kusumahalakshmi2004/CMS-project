package com.cms.controller;

import com.cms.model.Heading;
import com.cms.service.HeadingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class HeadingController {

    @Autowired
    private HeadingService headingService;

    @GetMapping("/heading")
    public Heading getHeading() {
        return headingService.getLatestHeading();
    }

    @PostMapping("/heading")
    public Heading updateHeading(@RequestBody Heading heading) {
        return headingService.updateHeading(heading.getHeading());
    }
}
