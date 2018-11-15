package main;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Katsiaryna Stalchanka
 * @since 06.11.2018
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileReader = new FileInputStream("E:\\Dev\\Java\\config.xml");
        XmlMapper xmlMapper = new XmlMapper();
        String xml = inputStreamToString(fileReader);
        Configuration configuration = xmlMapper.readValue(xml, Configuration.class);

        fileReader = new FileInputStream("E:\\Dev\\Java\\message.xml");
        String xmlMessage = inputStreamToString(fileReader);
        ArrayList<Message> messages = new ArrayList<>();
        messages = xmlMapper.readValue(xmlMessage, messages.getClass());

        fileReader = new FileInputStream("E:\\Dev\\Java\\persons.xml");
        String xmlPersons = inputStreamToString(fileReader);
        List<Person> persons = xmlMapper.reader().forType(new TypeReference<List<Person>>() {
        }).readValue(xmlPersons);

        Friends pe = xmlMapper.reader().forType(new TypeReference<Friends>() {
        }).readValue(xmlPersons);

        System.out.println(" ");
    }

    public static String inputStreamToString(InputStream is) throws IOException {
        StringBuilder sb = new StringBuilder();
        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        br.close();
        return sb.toString();
    }
}
