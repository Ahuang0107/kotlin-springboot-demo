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
  fun getProjects(): AppResponse<List<ProjectEntity>> {
    return service.findAll().successResult()
  }

  @PostMapping("/create")
  fun createProject(@RequestBody req: UpdateProjectReq): AppResponse<ProjectEntity> {
    return ProjectEntity().updateFrom(req).let { service.save(it) }.successResult()
  }

  @PutMapping("/update")
  fun updateProject(id: Long, @RequestBody req: UpdateProjectReq): AppResponse<ProjectEntity?> {
    return service.findById(id)?.updateFrom(req)?.let { service.save(it) }.successResult()
  }

  @PutMapping("/start")
  fun startProject(id: Long): AppResponse<ProjectEntity?> {
    return service.findById(id)?.let {
      it.stage = ProjectStage.DRAFT
      service.save(it)
    }.successResult()
  }

  @PutMapping("/submit")
  fun submitProject(id: Long): AppResponse<ProjectEntity?> {
    return service.findById(id)?.let {
      it.stage = ProjectStage.RMA
      service.save(it)
    }.successResult()
  }

  @PutMapping("/pass")
  fun passProject(id: Long): AppResponse<ProjectEntity?> {
    return service.findById(id)?.let {
      it.stage = ProjectStage.PASSED
      service.save(it)
    }.successResult()
  }

  @PutMapping("/reject")
  fun rejectProject(id: Long): AppResponse<ProjectEntity?> {
    return service.findById(id)?.let {
      it.stage = ProjectStage.DRAFT
      service.save(it)
    }.successResult()
  }

  @PutMapping("/close")
  fun closeProject(id: Long): AppResponse<ProjectEntity?> {
    return service.findById(id)?.let {
      it.closed = true
      service.save(it)
    }.successResult()
  }

  @DeleteMapping("/delete")
  fun deleteProject(id: Long): AppResponse<Unit> {
    return service.deleteById(id).successResult()
  }
}