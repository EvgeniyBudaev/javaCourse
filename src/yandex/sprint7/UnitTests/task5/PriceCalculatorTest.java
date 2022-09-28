//package yandex.sprint7.UnitTests.task5;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.function.Executable;
//
//public class PriceCalculatorTest {
//
//    private final PriceCalculator priceCalculator = new PriceCalculator();
//    private static final int BIKE_PRICE_PER_KM = 10;
//    private static final int CAR_PRICE_PER_KM = 7;
//    private static final int TRUCK_PRICE_PER_KM = 5;
//
//    @Test
//    public void shouldThrowExceptionWhenBikeAndDistanceIs0Km() {
//        IllegalArgumentException ex = Assertions.assertThrows(
//                IllegalArgumentException.class,
//                generateExecutable(TransportType.BIKE, 0)
//        );
//
//        Assertions.assertEquals("Distance should be more than 0 km", ex.getMessage());
//    }
//
//    @Test
//    public void shouldThrowExceptionWhenCarAndDistanceIs0Km() {
//        IllegalArgumentException ex = Assertions.assertThrows(
//                IllegalArgumentException.class,
//                generateExecutable(TransportType.CAR, 0)
//        );
//
//        Assertions.assertEquals("Distance should be more than 0 km", ex.getMessage());
//    }
//
//    @Test
//    public void shouldThrowExceptionWhenTruckAndDistanceIs0Km() {
//        IllegalArgumentException ex = Assertions.assertThrows(
//                IllegalArgumentException.class,
//                generateExecutable(TransportType.TRUCK, 0)
//        );
//
//        Assertions.assertEquals("Distance should be more than 0 km", ex.getMessage());
//    }
//
//    @Test
//    public void shouldReturn200ForBikeAndDistanceIs20Km() {
//        int price = calculate(TransportType.BIKE, 20);
//        Assertions.assertEquals(price, 20 * BIKE_PRICE_PER_KM);
//    }
//
//    @Test
//    public void shouldReturn7000ForCarAndDistanceIs1000Km() {
//        int price = calculate(TransportType.CAR, 1000);
//        Assertions.assertEquals(price, 1000 * CAR_PRICE_PER_KM);
//    }
//
//    @Test
//    public void shouldReturn10000ForTruckAndDistanceIs2000Km() {
//        int price = calculate(TransportType.TRUCK, 2000);
//        Assertions.assertEquals(price, 2000 * TRUCK_PRICE_PER_KM);
//    }
//
//    @Test
//    public void shouldReturn210ForCarAndDistanceIs21Km() {
//        IllegalArgumentException ex = Assertions.assertThrows(
//                IllegalArgumentException.class,
//                generateExecutable(TransportType.BIKE, 21)
//        );
//
//        Assertions.assertEquals("Bike can not go for more than 20 km", ex.getMessage());
//    }
//
//    @Test
//    public void shouldReturn7007ForCarAndDistanceIs1001Km() {
//        IllegalArgumentException ex = Assertions.assertThrows(
//                IllegalArgumentException.class,
//                generateExecutable(TransportType.CAR, 1001)
//        );
//
//        Assertions.assertEquals("Car can not go for more than 1000 km", ex.getMessage());
//    }
//
//    @Test
//    public void shouldReturn3000ForDRONEAndDistanceIs2000Km() {
//        UnsupportedOperationException ex = Assertions.assertThrows(
//                UnsupportedOperationException.class,
//                generateExecutable(TransportType.DRONE, 2000)
//        );
//
//        Assertions.assertEquals("transport type 'DRONE' is not handled correctly", ex.getMessage());
//    }
//
//    private Executable generateExecutable(TransportType type, int distance) {
//        return () -> priceCalculator.calculatePrice(type, distance);
//    }
//
//    private int calculate(TransportType type, int distance) {
//        return priceCalculator.calculatePrice(type, distance);
//    }
//}