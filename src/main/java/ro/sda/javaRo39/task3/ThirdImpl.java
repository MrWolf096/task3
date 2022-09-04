package ro.sda.javaRo39.task3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ThirdImpl implements CommandLineRunner {

    List<DummyLogger> dummyLoggers;

    public ThirdImpl(List<DummyLogger> dummyLoggers) {
        this.dummyLoggers = dummyLoggers;
    }

    @Override
    public void run(String... args) throws Exception {
        for (DummyLogger dummyLogger : dummyLoggers) {
            dummyLogger.sayHello();
        }

    }
}
