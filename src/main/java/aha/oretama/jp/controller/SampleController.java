package aha.oretama.jp.controller;

import aha.oretama.jp.service.SampleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author aha-oretama
 */
@RestController
public class SampleController {

  @Autowired
  private SampleService sampleService;

  @GetMapping("hello")
  public String getHello(@RequestParam String name) {
    return sampleService.getHello(name);
  }
}
