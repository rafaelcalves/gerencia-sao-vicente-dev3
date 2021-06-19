package com.unisinos.gerenciarsaofrancisco.service.impls;

import com.unisinos.gerenciarsaofrancisco.service.MedicationService;
import com.unisinos.gerenciarsaofrancisco.service.PatientService;
import org.springframework.stereotype.Component;

@Component
public class DefaultPatientService implements PatientService
{
	@Override public String findById(int id)
	{
		switch (id)
		{
			case 0:
				return "John Doe";
			case 1:
				return "José da Silva";
			case 2:
				return "Maria José";
			case 3:
				return "Eduardo Paulo";
			default:
				return "";
		}
	}
}
