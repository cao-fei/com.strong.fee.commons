package com.strong.fee.service.controller;

import com.strong.fee.service.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

/**
 * author: 小殊
 * create: 2018/9/15 下午11:40
 */
@RestController
public class HelloController {
    private static Logger logger = LoggerFactory.getLogger(HelloController.class);
    ThreadLocal<String> userName = new ThreadLocal<>();

    @RequestMapping(value = "/hello")
    public String hello(User user, Model model) {
        return "hello world," + user.getName();
    }

    @ModelAttribute
    public User requestId() {
        logger.info("requestId");

        return new User() {{
            setName(UUID.randomUUID().toString());
        }};

    }

    @ModelAttribute
    public User getUser(HttpServletRequest request) {

        logger.info("getUser");
        return new User() {{
            setName(request.getAttribute("user").toString());
        }};
    }
}
