package net.aimeizi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Autowired
    private FeignService feignService;

    @RequestMapping("/int")
    public Integer showRandomInteger() {
        return feignService.getInteger();
    }

}
