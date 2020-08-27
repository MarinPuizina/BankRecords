package com.marin.bankrecords.ui.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank/records")
public class BankRecordController {

    @GetMapping("/status/check")
    public String statusCheck() {
        return "The Bank Records system is operational.";
    }

}
