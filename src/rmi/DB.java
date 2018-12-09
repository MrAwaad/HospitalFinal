/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;

/**
 *
 * @author usfng
 */
public class DB {

    private MongoClient client;
    private MongoDatabase database;
    private MongoCollection<Document> Accounts;
    private MongoCollection<Document> Admin;
    private MongoCollection<Document> Doctor;
    private MongoCollection<Document> Appointments;
    private MongoCollection<Document> Clinic;
    private MongoCollection<Document> Medicine;
    private MongoCollection<Document> Patient;
    private MongoCollection<Document> Pharmacist;
    private MongoCollection<Document> Pharmacy;
    private MongoCollection<Document> Perscription;
    private Gson gson = new Gson();

    public DB() {
        // Disables Mongo Logs
        Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.SEVERE);

        // Initialize
        client = new MongoClient();
        database = client.getDatabase("Hospital"); // Database name
        Accounts = database.getCollection("accounts"); // Collection name
        Admin = database.getCollection("Admin");
        Doctor = database.getCollection("doctor");
        Appointments = database.getCollection("appointments");
        Clinic = database.getCollection("clinic");
        Medicine = database.getCollection("medicine");
        Patient = database.getCollection("patient");
       Pharmacist = database.getCollection("pharmacist");
        Pharmacy = database.getCollection("pharmacy");
        Perscription = database.getCollection("perscription");
        
        
        
        
    }
    
      public void insertDoctor(Doctor d) {
        Doctor.insertOne(Document.parse(gson.toJson(d)));
        System.out.println("Doctor inserted.");
    }

    public void deleteDoctor(int ID) {
        boolean result = Doctor.deleteOne(Filters.eq("ID", ID)).wasAcknowledged();
        if (result) {
            System.out.println("Doctor Deleted.");
        } else {
            System.out.println("Doctor wasn't found.");
        }
    }
    
        public void updateDoctor(Doctor d) {
        Document doc = Document.parse(gson.toJson(d));
        boolean result = Doctor.replaceOne(Filters.eq("ID", d.getId()), doc).wasAcknowledged();
        if (result) {
            System.out.println("Doctor Updated.");
        } else {
            System.out.println("Doctor wasn't found.");
        }
    }
    

      public void insertAdmin(Admin a) {
        Admin.insertOne(Document.parse(gson.toJson(a)));
        System.out.println("Admin inserted.");
    }

    public void deleteAdmin(int ID) {
        boolean result = Admin.deleteOne(Filters.eq("ID", ID)).wasAcknowledged();
        if (result) {
            System.out.println("Admin Deleted.");
        } else {
            System.out.println("Admin wasn't found.");
        }
    }
    
            public void updateAdmin(Admin a) {
        Document doc = Document.parse(gson.toJson(a));
        boolean result = Admin.replaceOne(Filters.eq("ID", a.getId()), doc).wasAcknowledged();
        if (result) {
            System.out.println("Admin Updated.");
        } else {
            System.out.println("Admin wasn't found.");
        }
    }
    
      public void insertPharmacist(Pharmacist ph) {
        Pharmacist.insertOne(Document.parse(gson.toJson(ph)));
        System.out.println("Pharmacist inserted.");
    }

    public void deletePharmacist(int ID) {
        boolean result = Pharmacist.deleteOne(Filters.eq("ID", ID)).wasAcknowledged();
        if (result) {
            System.out.println("Pharmacist Deleted.");
        } else {
            System.out.println("Pharmacist wasn't found.");
        }
    }
    public void updatePharmacist(Pharmacist ph) {
        Document doc = Document.parse(gson.toJson(ph));
        boolean result = Pharmacist.replaceOne(Filters.eq("ID", ph.getId()), doc).wasAcknowledged();
        if (result) {
            System.out.println("Pharmacist Updated.");
        } else {
            System.out.println("Pharmacist wasn't found.");
        }
    }

      public void insertPatient(Patient p) {
        Patient.insertOne(Document.parse(gson.toJson(p)));
        System.out.println("Patient inserted.");
    }

    public void deletePatient(int ID) {
        boolean result = Patient.deleteOne(Filters.eq("ID", ID)).wasAcknowledged();
        if (result) {
            System.out.println("Patient Deleted.");
        } else {
            System.out.println("Patient wasn't found.");
        }
    }
    public void updatePatient(Patient p) {
        Document doc = Document.parse(gson.toJson(p));
        boolean result = Patient.replaceOne(Filters.eq("ID", p.getId()), doc).wasAcknowledged();
        if (result) {
            System.out.println("Patient Updated.");
        } else {
            System.out.println("Patient wasn't found.");
        }
    }
    
   
    
   public void insertAccounts(Accounts acc) {
        Accounts.insertOne(Document.parse(gson.toJson(acc)));
        System.out.println("Account inserted.");
    }

    public void deleteAccounts(int ID) {
        boolean result = Accounts.deleteOne(Filters.eq("ID", ID)).wasAcknowledged();
        if (result) {
            System.out.println("Account Deleted.");
        } else {
            System.out.println("Account wasn't found.");
        }
    }
    
      public void updateAccounts(Accounts acc) {
        Document doc = Document.parse(gson.toJson(acc));
        boolean result = Accounts.replaceOne(Filters.eq("ID", acc.getAccount_id()), doc).wasAcknowledged();
        if (result) {
            System.out.println("Accounts Updated.");
        } else {
            System.out.println("Accounts wasn't found.");
        }
    }
    public boolean verifyvisanumber(int id,int visa)
    {
        Document doc = Patient.find(Filters.eq("ID", id)).first();
        Patient result = gson.fromJson(doc.toJson(), Patient.class);
        if(result.visa_no==visa)
            return true;
        else
            return false;
    }
    
  public void insertMedicine(Medicine m) {
        Medicine.insertOne(Document.parse(gson.toJson(m)));
        System.out.println("Account inserted.");
    }

    public void deleteMedicine(int barcode) {
        boolean result = Medicine.deleteOne(Filters.eq("barcode", barcode)).wasAcknowledged();
        if (result) {
            System.out.println("barcode Deleted.");
        } else {
            System.out.println("barcode wasn't found.");
        }
    }
    
        public void updateMedicine(Medicine m) {
        Document doc = Document.parse(gson.toJson(m));
        boolean result = Medicine.replaceOne(Filters.eq("barcode", m.getBarcode()), doc).wasAcknowledged();
        if (result) {
            System.out.println("Medicine Updated.");
        } else {
            System.out.println("Medicine wasn't found.");
        }
    }
  
  public void insertPharmacy(Pharmacy pa) {
        Pharmacy.insertOne(Document.parse(gson.toJson(pa)));
        System.out.println("Pharmacy inserted.");
    }

    public void deletePharmacy(int ID) {
        boolean result = Pharmacy.deleteOne(Filters.eq("ID", ID)).wasAcknowledged();
        if (result) {
            System.out.println("Pharmacy Deleted.");
        } else {
            System.out.println("Pharmacy wasn't found.");
        }
    }
    
          public void updatePharmacy(Pharmacy pa) {
        Document doc = Document.parse(gson.toJson(pa));
        boolean result = Pharmacy.replaceOne(Filters.eq("ID", pa.getPharID()), doc).wasAcknowledged();
        if (result) {
            System.out.println("Pharmacy Updated.");
        } else {
            System.out.println("Pharmacy wasn't found.");
        }
    }
    
    
  public void insertClinic(Clinic c) {
        Clinic.insertOne(Document.parse(gson.toJson(c)));
        System.out.println("Clinic inserted.");
    }

    public void deleteClinic(int ID) {
        boolean result = Clinic.deleteOne(Filters.eq("ID", ID)).wasAcknowledged();
        if (result) {
            System.out.println("Clinic Deleted.");
        } else {
            System.out.println("Clinic wasn't found.");
        }
    }
    
    public void updateClinic(Clinic c) {
        Document doc = Document.parse(gson.toJson(c));
        boolean result = Clinic.replaceOne(Filters.eq("ID", c.getID()), doc).wasAcknowledged();
        if (result) {
            System.out.println("Clinic Updated.");
        } else {
            System.out.println("Clinic wasn't found.");
        }
    }
    
      public void insertPrescription(Prescription pe) {
        Perscription.insertOne(Document.parse(gson.toJson(pe)));
        System.out.println("Prescription inserted.");
    }

    public void deletePrescription(int ID) {
        boolean result = Perscription.deleteOne(Filters.eq("ID", ID)).wasAcknowledged();
        if (result) {
            System.out.println("Prescription Deleted.");
        } else {
            System.out.println("Prescription wasn't found.");
        }
    }
    
    public void updatePrescription(Prescription pr) {
        Document doc = Document.parse(gson.toJson(pr));
        boolean result = Perscription.replaceOne(Filters.eq("ID", pr.getId()), doc).wasAcknowledged();
        if (result) {
            System.out.println("Prescription Updated.");
        } else {
            System.out.println("Prescription wasn't found.");
        }
    }
    
      public void insertAppointments(Appointments ap) {
        Appointments.insertOne(Document.parse(gson.toJson(ap)));
        System.out.println("Prescription inserted.");
    }

    public void deleteAppointments(int ID) {
        boolean result = Appointments.deleteOne(Filters.eq("ID", ID)).wasAcknowledged();
        if (result) {
            System.out.println("Appointment Deleted.");
        } else {
            System.out.println("Appointment wasn't found.");
        }
    }
    
    public void updateAppointments(Appointments ap) {
        Document doc = Document.parse(gson.toJson(ap));
        boolean result = Appointments.replaceOne(Filters.eq("ID", ap.getAppointment_ID()), doc).wasAcknowledged();
        if (result) {
            System.out.println("Appointment Updated.");
        } else {
            System.out.println("Appointment wasn't found.");
        }
    }
    
        public ArrayList<Doctor> getAllDoctors() {
        ArrayList<Doctor> result = new ArrayList();
        ArrayList<Document> docs = Doctor.find().into(new ArrayList<Document>());
        for (int i = 0; i < docs.size(); i++) {
          result.add(gson.fromJson(docs.get(i).toJson(), Doctor.class));
        }
        return result;
    }
    
        public ArrayList<Pharmacist> getAllPharmacist() {
        ArrayList<Pharmacist> result = new ArrayList();
        ArrayList<Document> docs = Doctor.find().into(new ArrayList<Document>());
        for (int i = 0; i < docs.size(); i++) {
            result.add(gson.fromJson(docs.get(i).toJson(), Pharmacist.class));
        }
        return result;
    }
        
        public ArrayList<Patient> getAllPatient() {
        ArrayList<Patient> result = new ArrayList();
        ArrayList<Document> docs = Doctor.find().into(new ArrayList<Document>());
        for (int i = 0; i < docs.size(); i++) {
            result.add(gson.fromJson(docs.get(i).toJson(), Patient.class));
        }
        return result;
    }        
        public ArrayList<Accounts> getAllAccounts() {
        ArrayList<Accounts> result = new ArrayList();
        ArrayList<Document> docs = Doctor.find().into(new ArrayList<Document>());
        for (int i = 0; i < docs.size(); i++) {
            result.add(gson.fromJson(docs.get(i).toJson(), Accounts.class));
        }
        return result;
    }
        
        public ArrayList<Medicine> getAllMedicines() {
        ArrayList<Medicine> result = new ArrayList();
        ArrayList<Document> docs = Doctor.find().into(new ArrayList<Document>());
        for (int i = 0; i < docs.size(); i++) {
            result.add(gson.fromJson(docs.get(i).toJson(), Medicine.class));
        }
        return result;
    }        
        public ArrayList<Appointments> getAllAppointments() {
        ArrayList<Appointments> result = new ArrayList();
        ArrayList<Document> docs = Doctor.find().into(new ArrayList<Document>());
        for (int i = 0; i < docs.size(); i++) {
            result.add(gson.fromJson(docs.get(i).toJson(), Appointments.class));
        }
        return result;
    }        
        public ArrayList<Prescription> getAllPrescriptions() {
        ArrayList<Prescription> result = new ArrayList();
        ArrayList<Document> docs = Doctor.find().into(new ArrayList<Document>());
        for (int i = 0; i < docs.size(); i++) {
            result.add(gson.fromJson(docs.get(i).toJson(), Prescription.class));
        }
        return result;
    }
    public ArrayList<Patient> Getpatient(int id)
    {
        Document doc = Doctor.find(Filters.eq("ID", id)).first();
        Doctor result = gson.fromJson(doc.toJson(), Doctor.class);
        return result.patients;
    }
    public boolean verifyDoctor(String username , int password)
    {
        Document docs = Doctor.find(Filters.and(Filters.eq("username",username), Filters.eq("password", password))).first();
        if(docs!=null)
            return true;
        else
            return false;
            
    }
    
        public boolean verifyAdmin(String username , int password)
    {
        Document docs = Admin.find(Filters.and(Filters.eq("username",username), Filters.eq("password", password))).first();
        if(docs!=null)
            return true;
        else
            return false;
            
    }
        
    public boolean verifyPatient(String username , int password)
    {
        Document docs = Patient.find(Filters.and(Filters.eq("username",username), Filters.eq("password", password))).first();
        if(docs!=null)
            return true;
        else
            return false;
            
    }
   
    public boolean verifyPharmacist(String username , int password)
    {
        Document docs = Pharmacist.find(Filters.and(Filters.eq("username",username), Filters.eq("password", password))).first();
        if(docs!=null)
            return true;
        else
            return false;
            
    }    
  public void close() {
        client.close();
    }
}
