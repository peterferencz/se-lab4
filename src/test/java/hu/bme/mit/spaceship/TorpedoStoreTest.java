package hu.bme.mit.spaceship;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class TorpedoStoreTest {

    @Test
    void fire_Success() {
        // Arrange
        TorpedoStore store = new TorpedoStore(1);

        // Act
        boolean result = store.fire(1);

        // Assert
        assertEquals(true, result);
    }

    @Test
    void getCountTest(){
        TorpedoStore store =  new TorpedoStore(10);
        assertEquals(10, store.getTorpedoCount());
    }

    @Test
    void fire_Failure(){
        TorpedoStore store = new TorpedoStore(10);
        
        assertThrows(IllegalArgumentException.class, () -> store.fire(0));
        
        assertThrows(IllegalArgumentException.class, () -> store.fire(15));
    }
}
