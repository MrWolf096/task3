package ro.sda.javaRo39.task3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SecondImpl implements CommandLineRunner {
    @Autowired
    @Qualifier("secondComponent")
    private DummyLogger dummyLogger;

    @Override
    public void run(String... args) throws Exception {
        dummyLogger.sayHello();
    }


}
