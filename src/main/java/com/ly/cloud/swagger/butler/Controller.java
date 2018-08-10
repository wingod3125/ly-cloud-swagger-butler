package com.ly.cloud.swagger.butler;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Class Name:
 * Description:
 *
 * @author: wanggang
 * @mail: wanggang@ly-sky.com
 * @date: 8/10 0010 17:00
 * @version: 1.0
 */
@RestController
public class Controller {
    @RequestMapping("hello/{name}")
    public String hello(@PathVariable String name) {
        return name + " say hello";
    }

}
