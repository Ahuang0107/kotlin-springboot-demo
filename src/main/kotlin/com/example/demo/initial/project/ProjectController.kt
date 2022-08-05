package com.example.demo.initial.project

import com.example.demo.base.property.SystemConst
import com.example.demo.base.restful.AppResponse
import com.example.demo.base.restful.successResult
import com.example.demo.initial.project.backup.ProjectBackupEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(SystemConst.API_PREFIX + "/project")
class ProjectController(
  private val projectFacade: ProjectFacade,
) {

  @GetMapping("/all")
  fun findAllProjects(): AppResponse<List<ProjectEntity>> {
    return projectFacade.findAllProjects().successResult()
  }

  @GetMapping("/all-backup")
  fun findAllProjectBackups(id: Long): AppResponse<List<ProjectBackupEntity>> {
    return projectFacade.findAllProjectBackups(id).successResult()
  }

  @PostMapping("/create")
  fun createProject(@RequestBody req: UpdateProjectReq): AppResponse<ProjectEntity> {
    return projectFacade.createProject(req).successResult()
  }

  @PutMapping("/update")
  fun updateProject(id: Long, @RequestBody req: UpdateProjectReq): AppResponse<ProjectEntity?> {
    return projectFacade.updateProject(id, req).successResult()
  }

  @PutMapping("/update-stage")
  fun updateProjectStage(id: Long, targetStage: ProjectStage): AppResponse<ProjectEntity?> {
    return projectFacade.changeProjectStage(id, targetStage).successResult()
  }

  @PutMapping("/close")
  fun closeProject(id: Long): AppResponse<ProjectEntity?> {
    return projectFacade.closeProject(id).successResult()
  }

  @DeleteMapping("/delete")
  fun deleteProject(id: Long): AppResponse<Unit> {
    return projectFacade.deleteProject(id).successResult()
  }
}