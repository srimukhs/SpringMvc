package sample;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController

public class SampleController {

    @RequestMapping("/sample")

    
        public String concat(String s1, String s2) {
s1= "sri";
s2="mukh";
            String c=s1 + s2;
System.out.println("Result"+c);
    	return c;

    }
    }

