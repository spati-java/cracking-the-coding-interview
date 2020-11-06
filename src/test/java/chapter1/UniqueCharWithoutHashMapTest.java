package chapter1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueCharWithoutHashMapTest {

    UniqueCharWithoutHashMap uc;
    @BeforeEach
    public void init(){
        uc = new UniqueCharWithoutHashMap();
    }
    @Test
    void isUniqueChar() {


        assertEquals(true , uc.isUniqueChar("lycmtbngbizvvclcrswjopkppuhqxoho"));

    }
}