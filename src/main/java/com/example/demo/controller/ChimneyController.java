package com.example.demo.controller;

import com.example.demo.model.Staff;
import com.example.demo.service.StaffService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class ChimneyController {

    private static final Logger log = LoggerFactory.getLogger(ChimneyController.class);

    private final StaffService staffService;

    @Autowired
    public ChimneyController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping("/{branch_name}/staffs")
    public List<String> getAllStaffs(@PathVariable("branch_name") String branchName) {
        log.info("Branch name in param: {}", branchName);
        return staffService.getAllStaffs(branchName);
    }

    @PostMapping("/staffs")
    public void createStaff(
//            @RequestBody String staffName
    ) {
        staffService.createStaff(null);
    }
}
