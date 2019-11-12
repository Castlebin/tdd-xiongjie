package task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArgsParserTest {

    @Test
    void parse() {
        System.out.println(new ArgsParser().parse("-l 1,2,3 -t 5 -p 8080"));
    }

}