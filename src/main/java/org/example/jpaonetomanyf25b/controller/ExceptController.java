package org.example.jpaonetomanyf25b.controller;

import org.springframework.web.bind.annotation.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


@RestController
@RequestMapping("exp/")
public class ExceptController {

    @GetMapping("/")
    public String Hello() {
        return "Hello World";

    }

  /*  @GetMapping("/file/{filename}")
    public String getFile(@RequestBody String filename) {
        String fileContent = "";
        try {
            FileInputStream fs = new FileInputStream("c:AFILE" + filename);
            byte[] bytes = fs.readAllBytes();
            fileContent = io.getMessage();
        } catch (FileNotFoundException e) {
            fileContent = e.getMessage();
        }
        return fileContent;
    }*/

    @GetMapping("/div/{divnum1}/{divnum2}")
    public int getdivnum(@PathVariable int divnum1, @PathVariable int divnum2) {
        int i1 = divnum1 /divnum2;
        return i1;
    }

    @GetMapping("/loop/{loopnum}")
    public int getloopnum(@PathVariable int loopnum) {
        int x = 0;
        for (int i = 0; i < loopnum; i++) {
            x++;
        }
        return x;
    }



}

