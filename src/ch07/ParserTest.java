package ch07;

interface Parseable{
    void parse(String fileName);
}

class ParseManager{
}

class XMLParser implements Parseable {
    @Override
    public void parse(String fileName) {
        System.out.println("fileName = " + fileName +"xml 파서");
    }
}

class HTMLParser implements Parseable {
    @Override
    public void parse(String fileName) {
        System.out.println(fileName+"HTML PARSER");
    }
}

public class ParserTest {
}
