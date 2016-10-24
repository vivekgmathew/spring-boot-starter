package com.cof.dot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cof.dot.models.Score;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class ScoreCardController {

    @RequestMapping(value = "scores", method = RequestMethod.GET)
    public List<Score> list() {
        List l = new ArrayList<Score>();
        l.add(new Score());
        return l;
    }

    @RequestMapping(value="score/{id}", method = RequestMethod.GET)
    public Score get() {
        return new Score();
    }

}
