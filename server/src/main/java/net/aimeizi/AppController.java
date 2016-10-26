package net.aimeizi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class AppController {

    @RequestMapping(value = "/int", method = RequestMethod.GET)
    public Integer integer() {
        Integer n = new Random().nextInt();
        System.out.println(n);
        return n;
    }

}
