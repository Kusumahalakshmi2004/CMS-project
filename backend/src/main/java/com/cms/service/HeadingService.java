package com.cms.service;

import com.cms.model.Heading;
import com.cms.repository.HeadingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeadingService {

    @Autowired
    private HeadingRepository repository;

    public Heading getLatestHeading() {
        List<Heading> allHeadings = repository.findAll();
        return allHeadings.isEmpty() ? new Heading("Default Heading") : allHeadings.get(allHeadings.size() - 1);
    }

    public Heading updateHeading(String newHeading) {
        Heading heading = new Heading(newHeading);
        return repository.save(heading);
    }
}
