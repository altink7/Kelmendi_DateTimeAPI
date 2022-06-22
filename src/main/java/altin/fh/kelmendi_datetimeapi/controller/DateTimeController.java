package altin.fh.kelmendi_datetimeapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalTime;

@RestController
@RequestMapping("api")
public class DateTimeController {

    @GetMapping("/today")
    public String today(){
        LocalDate today = LocalDate.now();
        return today.toString();
    }

    @GetMapping("/now")
    public String now(){
        LocalTime now = LocalTime.now();
        return now.toString().substring(0,8);
    }

    @GetMapping("/now/f")
    public String nowFormat(@RequestParam String format){
        LocalTime now = LocalTime.now();
        if(format.matches("HH:mm")){
            return now.toString().substring(0,5);
        }else{
            return now.toString().substring(0,8);
        }
    }

}
