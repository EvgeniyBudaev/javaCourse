package yandex.sprint7.ZonedDateTime.task3;

class AirportDatabase {
    private static Airport vnukovo = new Airport(
            "Внуково",
            "Москва",
            "MOSCOW          ",
            "Europe/Moscow"
    );

    private static Airport pulkovo = new Airport(
            "Пулково",
            "Санкт-Петербург",
            "SAINT-PETERSBURG",
            "Europe/Moscow"
    );

    private static Airport vladivostok = new Airport(
            "Владивосток",
            "Владивосток",
            "VLADIVOSTOK     ",
            "Asia/Vladivostok"
    );

    private static Airport koltsovo = new Airport(
            "Кольцово",
            "Екатеринбург",
            "YEKATERINBURG   ",
            "Asia/Yekaterinburg"
    );

    public static Airport getAirportByCode(String airportCode) {
        /* С помощью оператора switch case верните правильный аэропорт по его коду:
         * VKO - vnukovo
         * LED - pulkovo
         * SVX - koltsovo
         * VVO - vladivostok
         * Для неверного кода пробросьте исключение.
         */
        Airport airport;
        switch (airportCode) {
            case "VKO":
                airport = vnukovo;
                break;
            case "LED":
                airport = pulkovo;
                break;
            case "SVX":
                airport = koltsovo;
                break;
            case "VVO":
                airport = vladivostok;
                break;
            default:
                throw new IllegalStateException("Неизвестный код аэропорта: " + airportCode);
        }
        return airport;
//        return switch (airportCode) {
//            case "VKO" -> vnukovo;
//            case "LED" -> pulkovo;
//            case "SVX" -> koltsovo;
//            case "VVO" -> vladivostok;
//            default -> throw new IllegalStateException("Неизвестный код аэропорта: " + airportCode);
//        };
    }
}
