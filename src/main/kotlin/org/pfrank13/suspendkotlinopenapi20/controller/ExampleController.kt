package org.pfrank13.suspendkotlinopenapi20.controller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

data class ExampleRequest(val message: String)

data class ExampleResponse(val message: String)

@RestController
class ExampleController {
  @PostMapping("/message")
  fun postMessage(exampleRequest: ExampleRequest): ExampleResponse {
    return ExampleResponse("Message '${exampleRequest.message}' has been received")
  }

  @PostMapping("/suspend/message")
  suspend fun suspendPostMessage(exampleRequest: ExampleRequest): ExampleResponse {
    return ExampleResponse("Message '${exampleRequest.message}' has been received")
  }
}
