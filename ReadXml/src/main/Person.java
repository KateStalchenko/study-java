package main;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Katsiaryna Stalchanka
 * @since 06.11.2018
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Person {
    @JsonProperty("userID")
    public String userID;
    @JsonProperty("firstName")
    public String firstName;
    @JsonProperty("lastName")
    public String lastName;
}
