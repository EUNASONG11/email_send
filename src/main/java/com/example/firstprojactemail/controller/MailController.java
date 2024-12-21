package com.example.firstprojactemail.controller;

import com.example.firstprojactemail.dto.MailDto;
import com.example.firstprojactemail.service.MailService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@AllArgsConstructor
public class MailController {
    private final MailService mailService;

    @GetMapping("mail")
    public String dispMail() {
        return "mail";
    }

    @PostMapping("mail")
    public void execMail(MailDto mailDto) {
        mailService.mailSend(mailDto);
    }
}
