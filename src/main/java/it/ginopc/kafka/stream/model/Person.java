package it.ginopc.kafka.stream.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

/**
 * <pre>
 *
 * Title: Item class
 * Description: class Item
 *
 * Copyright: Copyright (c) 2021 by M. Aru
 * </pre>
 *
 * @author Maurizio Aru (https://github.com/ginopc)
 * @version 1.0
 */
@Data
@ToString
@Builder(toBuilder = true)
public class Person {

    private String name;
    private String email;
    private String phone;
}
