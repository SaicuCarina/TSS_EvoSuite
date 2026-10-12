
package demo;

public class DiscountCalculator {

    public double calculatePrice(
            double price,
            boolean premium,
            boolean hasCoupon) {

        if (price < 0) {
            throw new IllegalArgumentException(
                    "Pretul nu poate fi negativ");
        }

        if (price == 0) {
            return 0;
        }

        double discount = 0;

        if (premium) {
            discount = 0.10;

            if (price >= 500) {
                discount = 0.20;
            }
        } else {
            if (price >= 1000) {
                discount = 0.05;
            }
        }

        if (hasCoupon) {
            discount += 0.05;
        }

        if (discount > 0.20) {
            discount = 0.20;
        }

        return price * (1 - discount);
    }
}
