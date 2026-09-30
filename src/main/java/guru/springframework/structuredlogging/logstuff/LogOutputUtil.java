package guru.springframework.structuredlogging.logstuff;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class LogOutputUtil implements CommandLineRunner {

    @Override
    public void run(String... args) {
        log.trace("Trace log");
        log.debug("Debug log");
        log.info("Info log");
        log.warn("Warn log");
        log.error("Error log");
    }
}
