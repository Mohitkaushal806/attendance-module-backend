package com.example.attendancemodule.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("api/v1/")
public class AttendanceController {

    @PostMapping("mark-attendance")
    public ResponseEntity<Object> markAttendance(@RequestBody Map<String,String> data){
        Map<String ,String > responseData = new HashMap<>();
        System.out.println("Attendance Data = " + data);
        responseData.put("msg" , "Attendance marked Successfully");
        responseData.put("status", "true");
        return new ResponseEntity<>(responseData, HttpStatus.OK);
    }

}
