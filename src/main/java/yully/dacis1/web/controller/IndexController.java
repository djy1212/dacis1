package yully.dacis1.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.SimpleDateFormat;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private int count = 0;
    private int count2 = 0;
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
    @GetMapping("/namgaram")
    public String namegaram() {
        return calcAndOutDate2("namgaram");
    }
    @GetMapping("/count")
    public String count(Model model) {
        //{{count}}
        model.addAttribute("count1", count);
        model.addAttribute("count2", count2);
        return "count";
    }


    public String calcAndOutDate(String name){
        SimpleDateFormat dateFormat = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
        String time = dateFormat.format (System.currentTimeMillis());
        System.out.println(time + " " + name + " count1:" + ++count);
        return name;
    }
    public String calcAndOutDate2(String name){
        SimpleDateFormat dateFormat = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
        String time = dateFormat.format (System.currentTimeMillis());
        System.out.println(time + " " + name + " count2:" + ++count2);
        return name;
    }
}
