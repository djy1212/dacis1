package yully.dacis1.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.SimpleDateFormat;

@RequiredArgsConstructor
@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return calcAndOutDate("jinjumungo");
    }
    @GetMapping("/jinjumungo")
    public String jinjumungo() {
        return calcAndOutDate("jinjumungo");
    }
    @GetMapping("/sangbong")
    public String sangbong() {
        return calcAndOutDate("sangbong");
    }

    public String calcAndOutDate(String name){
        SimpleDateFormat dateFormat = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
        String time = dateFormat.format (System.currentTimeMillis());
        System.out.println(time + " " + name);
        return name;
    }
}
