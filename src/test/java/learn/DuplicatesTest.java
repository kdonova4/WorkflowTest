package learn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicatesTest {

    @Test
    void hasDuplicates() {

        assertEquals(2, Duplicates.findDuplicates(new int[]{1,2,3,4,4,3}).size());
    }

}