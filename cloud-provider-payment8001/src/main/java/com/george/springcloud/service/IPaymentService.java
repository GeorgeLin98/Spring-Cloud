package com.george.springcloud.service;

import com.george.springcloud.entities.Payment;

public interface IPaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
