package com.payroll.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.payroll.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(Long workerId, Integer days) {
		Payment payment = new Payment();
		payment.setName("Teste");
		payment.setDailyIncome(200.0);
		payment.setDays(days);
		return payment;
	}
	
}
