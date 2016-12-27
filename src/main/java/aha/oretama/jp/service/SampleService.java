package aha.oretama.jp.service;

import org.springframework.stereotype.Service;

/**
 * @author aha-oretama
 */
@Service
public class SampleService {

  public String getHello(String name) {
    return "Hello " + name;
  }
}
