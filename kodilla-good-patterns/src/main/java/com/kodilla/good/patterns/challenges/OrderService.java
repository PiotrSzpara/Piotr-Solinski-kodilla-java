package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface OrderService {

    boolean executeOrder(User user, String product, LocalDateTime dateOfSale);
}
