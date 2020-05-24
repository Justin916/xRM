package com.xrm;

import com.xrm.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

//    private static final Logger logger = LoggerFactory.getLogger(MyRunner.class);

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(String... args) {
        try {
            userRepository.findAll();
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
