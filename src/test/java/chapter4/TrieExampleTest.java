package chapter4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrieExampleTest {


    TrieExample te ;

    @BeforeEach
    public  void init(){
        te = new TrieExample();
        te.insert("way");
    }

    @Test
    void insert() {

        te.insert("Programming");
        te.insert("is");
        te.insert("a");
        te.insert("way");
        te.insert("of");
        te.insert("life");
    }

    @Test
    void find() {
        assertEquals(true, te.find("way"));
    }
}