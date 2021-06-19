package com.unisinos.gerenciarsaofrancisco.service.impls;

import com.unisinos.gerenciarsaofrancisco.service.MedicationService;
import org.springframework.stereotype.Component;

@Component
public class DefaultMedicationService implements MedicationService
{
	@Override public String findById(int id)
	{
		switch (id)
		{
			case 0:
				return "Aspirina";
			case 1:
				return "Dipirona";
			case 2:
				return "Paracetamol";
			case 3:
				return "Diclofenaco";
			default:
				return "";
		}
	}
}
