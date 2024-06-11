package com.example.demo.service;

import com.example.demo.model.Staff;
import com.example.demo.repo.StaffRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StaffService {


    private static final Logger log = LoggerFactory.getLogger(StaffService.class);

    private final StaffRepository staffRepository;

    @Autowired
    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public List<String> getAllStaffs(String branchName) {
        log.info("Branch name received: {}", branchName);
        List<Staff> staffList = staffRepository.findByBranchName(branchName);
        log.info("staffs return from repo: {}", staffList);
        return staffList.stream().map(Staff::getName).collect(Collectors.toList());
    }

    public void createStaff(String staff) {
        log.info("staff is created" + staff);
        try {
            staffRepository.save(new Staff("Mahinam", "Kundan"));
        } catch (Exception e) {
            log.error("The exception occured is "+ e.getMessage());
        }
    }
}
