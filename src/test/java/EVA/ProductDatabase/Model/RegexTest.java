package EVA.ProductDatabase.Model;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
class RegexTest {
    @Autowired
    Regex regex;

    @Test
    void checkRegexNotNull() {
        assertNotNull(regex);
    }

    @Test
    void checkRegex() {
        List<Products> expected = regex.checkRegex("^[\\p{L} .'-]+$");
        List<Products> actual = regex.checkRegex("eva");
        Assert.assertTrue(expected.isEmpty());
        Assert.assertFalse(actual.isEmpty());
    }

}