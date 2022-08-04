package com.example.demo.initial.project

import com.example.demo.base.property.SystemConst
import com.example.demo.base.restful.AppResponse
import com.example.demo.base.restful.successResult
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(SystemConst.API_PREFIX + "/project")
class ProjectController(
  private val service: ProjectService,
) {

  @GetMapping("/all")
  fun getDogs(): AppResponse<List<ProjectEntity>> {
    return service.findAll().successResult()
  }

  @PostMapping("/create")
  fun createDog(@RequestBody req: UpdateProjectReq): AppResponse<ProjectEntity> {
    return ProjectEntity().updateFrom(req).let { service.save(it) }.successResult()
  }

  @PutMapping("/update")
  fun updateDog(id: Long, @RequestBody req: UpdateProjectReq): AppResponse<ProjectEntity?> {
    return service.findById(id)?.updateFrom(req)?.let { service.save(it) }.successResult()
  }

  @DeleteMapping("/delete")
  fun deleteDog(id: Long): AppResponse<Unit> {
    return service.deleteById(id).successResult()
  }
}