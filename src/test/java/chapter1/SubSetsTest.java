package chapter1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubSetsTest {

    @Test
    void createAllPossibleSubsets() {

        SubSets subSets = new SubSets();
        int [] a = {1,2,3};
        subSets.createAllPossibleSubsets(a);
    }
}