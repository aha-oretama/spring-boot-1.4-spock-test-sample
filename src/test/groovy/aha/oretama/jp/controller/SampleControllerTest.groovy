package aha.oretama.jp.controller

import aha.oretama.jp.service.SampleService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.web.servlet.MockMvc
import spock.lang.Specification

import static org.mockito.Mockito.*
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*

/**
 * @author aha-oretama
 */
@WebMvcTest(SampleController)
class SampleControllerTest extends Specification {

  @Autowired
  MockMvc mvc

  @MockBean
  SampleService sampleService

  def "GetHello"() {
    setup:
    def name = "aha-oretama"
    when(sampleService.getHello(name)).thenReturn("Hello aha-oretama")

    expect:
    mvc.perform(get("/hello").param("name", name))
            .andExpect(status().isOk())
            .andExpect(content().string("Hello aha-oretama"))
  }
}
