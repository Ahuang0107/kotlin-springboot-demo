package com.example.demo.initial

import com.example.demo.base.property.SystemConst
import com.example.demo.base.restful.AppResponse
import com.example.demo.base.restful.successResult
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(SystemConst.API_PREFIX + "/dog")
class DogController(
  private val service: DogService,
) {

  @GetMapping("/public")
  fun public(): AppResponse<String> = "Hello World".successResult()

  @GetMapping("/all")
  fun getDogs(): AppResponse<List<DogEntity>> {
    return service.findAll().successResult()
  }

  @PostMapping("/create")
  fun createDog(@RequestBody req: UpdateDogReq): AppResponse<DogEntity> {
    return DogEntity().updateFrom(req).let { service.save(it) }.successResult()
  }

  @PutMapping("/update")
  fun updateDog(id: Long, @RequestBody req: UpdateDogReq): AppResponse<DogEntity?> {
    return service.findById(id)?.updateFrom(req)?.let { service.save(it) }.successResult()
  }

  @DeleteMapping("/delete")
  fun deleteDog(id: Long): AppResponse<Unit> {
    return service.deleteById(id).successResult()
  }
}