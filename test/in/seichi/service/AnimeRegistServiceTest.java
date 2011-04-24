package in.seichi.service;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class AnimeRegistServiceTest extends AppEngineTestCase {

    private AnimeRegistService service = new AnimeRegistService();

    @Test
    public void test() throws Exception {
        assertThat(service, is(notNullValue()));
    }
}
