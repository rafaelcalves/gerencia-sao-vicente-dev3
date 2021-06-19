package com.unisinos.gerenciarsaofrancisco.forms;

import javax.validation.constraints.NotNull;


public class MedicalPrescriptionForm {
	private int id;
	@NotNull
	private Integer doctorId;
	@NotNull
	private Integer patientId;
	@NotNull
	private Integer medicineId;
	@NotNull
	private String description;
	@NotNull
	private String startDate;
	@NotNull
	private String endDate;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public Integer getDoctorId()
	{
		return doctorId;
	}

	public void setDoctorId(Integer doctorId)
	{
		this.doctorId = doctorId;
	}

	public Integer getPatientId()
	{
		return patientId;
	}

	public void setPatientId(Integer patientId)
	{
		this.patientId = patientId;
	}

	public Integer getMedicineId()
	{
		return medicineId;
	}

	public void setMedicineId(Integer medicineId)
	{
		this.medicineId = medicineId;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getStartDate()
	{
		return startDate;
	}

	public void setStartDate(String startDate)
	{
		this.startDate = startDate;
	}

	public String getEndDate()
	{
		return endDate;
	}

	public void setEndDate(String endDate)
	{
		this.endDate = endDate;
	}
}
