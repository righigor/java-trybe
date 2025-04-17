package com.betrybe.meuprojetospring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ola")
public class Controller {
  @GetMapping
  public String dizOla() {
    return "Hello World";
  }
}