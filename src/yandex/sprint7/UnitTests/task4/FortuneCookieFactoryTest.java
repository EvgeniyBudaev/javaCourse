//package yandex.sprint7.UnitTests.task4;
//
//import org.junit.jupiter.api.*;
//
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class FortuneCookieFactoryTest {
//    FortuneCookieFactory fortuneCookieFactory;
//
//    @BeforeEach
//    public void beforeEach() {
//        fortuneCookieFactory = new FortuneCookieFactory(
//                new FortuneConfig(true),
//                List.of("positive"),
//                List.of("negative"));
//    }
//
//    @Test
//    public void shouldIncrementCountByOneAfterOneCookieBaked() {
//        fortuneCookieFactory.bakeFortuneCookie();
//        assertEquals(1, fortuneCookieFactory.getCookiesBaked());
//    }
//
//    @Test
//    public void shouldIncrementCountByTwoAfterTwoCookiesBaked() {
//        fortuneCookieFactory.bakeFortuneCookie();
//        fortuneCookieFactory.bakeFortuneCookie();
//        assertEquals(2, fortuneCookieFactory.getCookiesBaked());
//    }
//
//    @Test
//    public void shouldSetCounterToZeroAfterResetCookieCreatedCall() {
//        fortuneCookieFactory.bakeFortuneCookie();
//        fortuneCookieFactory.resetCookiesCreated();
//        assertEquals(0, fortuneCookieFactory.getCookiesBaked());
//    }
//}