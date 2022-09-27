//package yandex.sprint7.UnitTests.task4;
//
//import org.junit.jupiter.api.*;
//
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class FortuneCookieControllerTest {
//    static FortuneCookieController positiveFactoryController;
//    static FortuneCookieController negativeFactoryController;
//
//    private static FortuneCookieController createController(boolean isPositive) {
//        FortuneCookieFactory fortuneCookieFactory = new FortuneCookieFactory(
//                new FortuneConfig(isPositive),
//                List.of("positive"),
//                List.of("negative")
//        );
//
//        return new FortuneCookieController(fortuneCookieFactory);
//    }
//
//    @BeforeAll
//    public static void beforeAll() {
//        positiveFactoryController = createController(true);
//        negativeFactoryController = createController(false);
//    }
//
//    @Test
//    public void shouldReturnPositiveFortune() {
//        FortuneCookie cookie = positiveFactoryController.tellFortune();
//        assertEquals("positive", cookie.getFortuneText());
//    }
//
//    @Test
//    public void shouldReturnNegativeFortune() {
//        FortuneCookie cookie = negativeFactoryController.tellFortune();
//        assertEquals("negative", cookie.getFortuneText());
//    }
//}