package ro.sda.javaRo39.task3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SecondComponent implements DummyLogger{
    @Override
    public void sayHello() {
        log.info("Second component");
    }
}
