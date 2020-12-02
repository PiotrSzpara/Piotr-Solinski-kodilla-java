package com.kodilla.good.patterns.challenges.foodshop;

import java.util.Objects;

public class Producer {
    private String producerName;

    public Producer(String producerName) {
        this.producerName = producerName;
    }

    public String getProducerName() {
        return producerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Producer producer = (Producer) o;

        return Objects.equals(producerName, producer.producerName);
    }

    @Override
    public int hashCode() {
        return producerName != null ? producerName.hashCode() : 0;
    }
}
