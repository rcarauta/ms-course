package com.payroll.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payroll.hrpayroll.entities.Payment;
import com.payroll.hrpayroll.entities.Worker;
import com.payroll.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {

	@Autowired
	private WorkerFeignClient workerFeignClient;

	public Payment getPayment(Long workerId, Integer days) {
		Worker worker = workerFeignClient.findById(workerId).getBody();
		Payment payment = new Payment(worker.getName(), worker.getDailyIncome(), days);
		return payment;
	}

}
