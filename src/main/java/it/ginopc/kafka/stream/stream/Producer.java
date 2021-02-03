package it.ginopc.kafka.stream.stream;

import it.ginopc.kafka.stream.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.function.Supplier;

/**
 * <pre>
 *
 * Title: Producer class
 * Description: class Producer description and scope
 *
 * Copyright: Copyright (c) 2021 by M. Aru
 * </pre>
 *
 * @author Maurizio Aru (https://github.com/ginopc)
 * @version 1.0
 */
@Component
public class Producer {

    private Logger logger = LoggerFactory.getLogger (this.getClass ());
    private List<String> names = List.of("Jamie", "Stephie", "Marcus");
    private List<String> phones = List.of("12345", "456789", "789123", "159753", "794613");

    @Bean
    public Supplier<Person> produce(){
        return () -> {
            String name = names.get(new Random ().nextInt (names.size ()));
            String email = String.format("%s@example.ext", name.toLowerCase(Locale.ROOT));
            Person payload = Person.builder ()
                    .name (name)
                    .email (email)
                    .phone(phones.get (new Random ().nextInt (phones.size ())))
                    .build ();
            logger.info("Send new message with payload {}", payload);
            return payload;
        };
    }
}
