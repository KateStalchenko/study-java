package main;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;

/**
 * @author Katsiaryna Stalchanka
 * @since 06.11.2018
 */
public class Friends {
    @JacksonXmlProperty(localName = "person")
    @JacksonXmlElementWrapper(useWrapping = false)
    public ArrayList<Person> friends = new ArrayList<>();

    public ArrayList<Person> getPersons() {
        return friends;
    }
}
