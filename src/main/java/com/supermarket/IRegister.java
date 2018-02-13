package com.supermarket;

import java.util.ArrayList;

public interface IRegister {
    /**
     * The implementation to enter the amount that the customer adds, the price of the promotion
     * and the amount of promotion for that promotion price
     *
     * @param amountOfCustomer
     * @param pricePromotion
     * @param amountOfPromotionForThatPrice
     * @return promotion price to the total
     */
    int promotionPrice(int amountOfCustomer, int pricePromotion, int amountOfPromotionForThatPrice);

    /**
     * The implementation to enter the the number of the promotion with after the new price
     *
     * @param fullPrice
     * @return the total fullPrice
     */
    int fullPrice(int amountOfCustomer, int fullPrice);

    /**
     * The implementation to enter fullPrice and promotionPrice to have the total amount of that product as a retrun
     *
     * @param fullPrice
     * @param promotionPrice
     * @return total price of the item
     */
    int sum(int fullPrice, int promotionPrice);

    /**
     * * The implementation has to calculate the total price
     *
     * @param a
     * @param b
     * @param c
     * @param d
     * @return
     */
    int totalPrice(int a, int b, int c, int d);
}
