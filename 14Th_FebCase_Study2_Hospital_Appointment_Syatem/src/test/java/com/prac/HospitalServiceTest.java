package com.prac;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.Assignment.Appointment;
import com.Assignment.AppointmentDao;
import com.Assignment.Doctor;
import com.Assignment.DoctorDAO;
import com.Assignment.HospitalService;
import com.Assignment.MedicalRecord;
import com.Assignment.MedicalRecordDao;
import com.Assignment.Patient;
import com.Assignment.PatientDAO;

public class HospitalServiceTest {
	  PatientDAO pd = new PatientDAO();
	  PatientDAO dd = new PatientDAO();
	    AppointmentDao ad = new AppointmentDao();
	    MedicalRecordDao md = new MedicalRecordDao();

	    HospitalService service = new HospitalService();

	    @Test
	    public void testOneToOnePersist() {
	        MedicalRecord mr = new MedicalRecord(1,"O+","None");
	        md.saveMedicalRecord(mr);

	        Patient p = new Patient(1,"Ravi",309873487);
	        p.setMedicalRecord(mr);

	        pd.savePatient(p);

	        Patient db = pd.findPatient(1L);

	        assertNotNull(db);
	        assertEquals("O+", db.getMedicalRecord().getBloodGroup());
	    }
	    
	    @Test
	    public void testOneToManyPersist(){

	        Appointment a1 = new Appointment(11,"today",500);
	        Appointment a2 = new Appointment(12,"today",700);

	        ad.saveAppointment(a1);
	        ad.saveAppointment(a2);

	        Doctor d = new Doctor(2,"Dr.Smith","Cardio");

	        List<Appointment> list = new ArrayList<>();
	        list.add(a1);
	        list.add(a2);

//	        dd.setList(list);
//
//	        dd.saveDoctor(d);
//
//	        Doctor db = dd.findDoctor(2);

	        //assertEquals(2, db.getList().size());
	    }
	    
	    @Test
	    public void testManyToOnePersist(){

	        Patient p = new Patient(3,"Kumar",4043834);
	        pd.savePatient(p);

	        Appointment a = new Appointment(21,"today",1000);
	        a.setPatient(p);

	        ad.saveAppointment(a);

	        Appointment db = ad.findAppointment(21L);

	        assertEquals("Kumar", db.getPatient().getName());
	    }
	    
	    
	    @Test
	    public void testUpdateAppointmentFee(){

	        Appointment a = new Appointment(31,"today",200);
	        ad.saveAppointment(a);

	        a.setFee(999);
	        ad.saveAppointment(a);   

	        Appointment db = ad.findAppointment(31L);

	        assertEquals(999, db.getFee());
	    }
	    
	    
	    @Test
	    public void testDeletePatient(){

	        Patient p = new Patient(41,"DeleteMe",507464783);
	        pd.savePatient(p);

	        pd.deletePatient(41L);

	        Patient db = pd.findPatient(41L);

	        assertNull(db);
	    }
	    
	    @Test
	    public void testServiceWorkflow(){

	        MedicalRecord mr = new MedicalRecord(51,"B+","Dust");
	        md.saveMedicalRecord(mr);

	        Patient p = new Patient(51,"Workflow",2583488);

	        service.registerPatientWithMedicalRecord(p,mr);

	        Appointment a = new Appointment(52,"today",300);
	        ad.saveAppointment(a);

	        service.assignAppointmentToPatient(52L,51L);

	        Appointment db = ad.findAppointment(52L);

	        assertEquals("Workflow", db.getPatient().getName());
	    }
	    
	    
}