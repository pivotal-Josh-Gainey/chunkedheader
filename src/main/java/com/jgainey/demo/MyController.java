package com.jgainey.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class MyController {

    @RequestMapping(method = RequestMethod.GET, value = "/chunk", produces = "application/json")
    public ResponseEntity<String> getIP(HttpServletRequest request, HttpServletResponse response) {

        response.addHeader("Transfer-Encoding", "chunked");

        return new ResponseEntity<>("ok", HttpStatus.OK);
    }

}
