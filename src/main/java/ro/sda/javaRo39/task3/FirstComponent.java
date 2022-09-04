package ro.sda.javaRo39.task3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
@Slf4j
public class FirstComponent implements DummyLogger{
    @Override
    public void sayHello() {
        log.info("First component");
    }
}
