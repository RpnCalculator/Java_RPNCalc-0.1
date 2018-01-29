package csd.calculator;

import java.io.*;

import org.junit.*;

import csd.calculator.testduplicates.*;

public class StreamTokenizerTest {

    @Test
    public final void constructor_FakeStreamInput() {
        final InputStream is = new InputStreamFake("12 5 9");
        final StreamTokenizer input = new StreamTokenizer(is);

        Assert.assertEquals("12", input.nextToken());
        Assert.assertEquals("5", input.nextToken());
        Assert.assertEquals("9", input.nextToken());
    }

    @Test
    public final void endOfInput_tokenAvailableFalse() {
        final InputStream is = new InputStreamFake("3 5");
        final StreamTokenizer input = new StreamTokenizer(is);

        Assert.assertEquals("3", input.nextToken());
        Assert.assertEquals("5", input.nextToken());
        Assert.assertFalse("empty input should not have available token",
                input.tokenAvailable());
    }

    @Test
    public final void endOfInput_nextTokenEmptyString() {
        final InputStream is = new InputStreamFake("3");
        final StreamTokenizer input = new StreamTokenizer(is);

        Assert.assertEquals("3", input.nextToken());
        Assert.assertEquals("", input.nextToken());
    }

}
