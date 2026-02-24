package com.HospitalEntity.Main;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.HospitalEntity.Appointment;
import com.HospitalEntity.Department;
import com.HospitalEntity.Doctor;
import com.HospitalEntity.MedicalRecord;
import com.HospitalEntity.Patient;
import com.HospitalEntity.Prescription;

import jakarta.persistence.EntityManager;

public class Main {
	public static void main(String[] args) {

        EntityManager em = JpaUtil.getEntityManager();

        try {

            em.getTransaction().begin();

            System.out.println("========== TASK 1 : Patient -> MedicalRecord ==========");

            MedicalRecord record = new MedicalRecord();
            record.setRecordDate(LocalDate.now());
            record.setDiagnosis("Flu");
            record.setNotes("Rest 3 days");

            Patient patient = new Patient();
            patient.setName("Ali");
            patient.setDob(LocalDate.of(2000,1,1));
            patient.setBloodGroup("O+");
            patient.setPhone("9999999999");
            patient.setMedicalRecord(record);

            em.persist(patient);
            System.out.println("Patient saved with MedicalRecord ");


            System.out.println("\n========== TASK 2 : Department <-> Doctor ==========");

            Department cardio = new Department();
            cardio.setName("Cardiology");

            Doctor doc1 = new Doctor();
            doc1.setName("Dr. Mehta");

            cardio.addDoctor(doc1);
            em.persist(cardio);

            System.out.println("Department & Doctor saved ");


            System.out.println("\n========== TASK 3 : Doctor -> Appointment ==========");

            Appointment a1 = new Appointment();
            a1.setAppointDate(LocalDateTime.now());
            a1.setStatus("SCHEDULED");
            a1.setReason("Routine Checkup");

            doc1.getAppointments().add(a1);

            System.out.println("Appointment added to Doctor ");


            System.out.println("\n========== TASK 4 : Appointment -> Prescription ==========");

            Prescription rx = new Prescription();
            rx.setMedicines("Paracetamol");
            rx.setDosage("Twice daily");
            rx.setIssuedDate(LocalDate.now());
            rx.setActive(true);

            a1.setPrescription(rx);

            System.out.println("Prescription linked to Appointment ");


            System.out.println("\n========== TASK 5 : Doctor <-> Patient  ==========");

            Doctor doc2 = new Doctor();
            doc2.setName("Dr. Singh");

            Patient patient2 = new Patient();
            patient2.setName("Priya");

            doc1.addPatient(patient2);
            doc2.addPatient(patient);

            em.persist(doc2);

            System.out.println("Many-to-Many relationship created ");

            em.getTransaction().commit();

            System.out.println("ALL TASKS EXECUTED SUCCESSFULLY ");

        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

}
