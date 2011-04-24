package in.seichi.model;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class AnimeTest extends AppEngineTestCase {

    private Anime model = new Anime();

    @Test
    public void test() throws Exception {
        assertThat(model, is(notNullValue()));
    }
}
