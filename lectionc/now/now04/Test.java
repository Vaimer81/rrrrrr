public class Test {
    public static void main(String[] args) {
        double[] prices = {20.1, 32.4, -34.2, 45.1, -45.1};
        double[] result = getWrongPrices(prices);
        printWrongPrices(result);

    }

    // Печатает массив ошибочных цен
    private static void printWrongPrices(double[] result) {
        for (double price : result) {
            System.out.println(price);
        }
    }

    /**
     * Возвращает ошибочные цены (которые меньше нуля)
     *
     * @param prices - массив цен
     * @return только ошибочные цены
     */
    private static double[] getWrongPrices(double[] prices) {
        double[] tmpResult = new double[prices.length];

        int countWrongPrice = 0;
        for (double price : prices) {
            if (price < 0) {
                tmpResult[countWrongPrice] = price;
                countWrongPrice++;
            }
        }
        return getReducedArray(tmpResult, countWrongPrice);
    }

    private static double[] getReducedArray(double[] tmpResult, int countWrongPrice) {
        return tmpResult;
    }


}
