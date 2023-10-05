package java_remember.Model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



/**
 * ModelTest
 */
public class ModelTest {
    @Test
    void TestModelBuild(){
        WorkerBuilder builder = new WorkerBuilder();
        try {
            assertNotNull(builder.newWorker(0));
            assertEquals(builder.newWorker(0).getClass(),Apprentice.class);
        } catch (Exception e) {
            // TODO: handle exception
        }
        
    }
}