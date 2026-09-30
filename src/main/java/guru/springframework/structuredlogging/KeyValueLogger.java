package guru.springframework.structuredlogging;

import ch.qos.logback.classic.spi.ILoggingEvent;
import org.springframework.boot.logging.structured.StructuredLogFormatter;

public class KeyValueLogger implements StructuredLogFormatter<ILoggingEvent> {

    @Override
    public String format(ILoggingEvent event) {
        return System.lineSeparator() + "level = " + event.getLevel() + ", message = " + event.getMessage();
    }
}
