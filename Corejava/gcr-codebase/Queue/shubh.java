import java.util.PriorityQueue;

class Patient {

    int priority;
    String name;

    Patient(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }
}

public class HospitalER {

    private PriorityQueue<Patient> triageQueue;

    // Constructor
    public HospitalER() {

        triageQueue = new PriorityQueue<>(
                (a, b) -> a.priority - b.priority
        );
    }

    // Admit patient
    public void admitPatient(Patient patient) {
        triageQueue.offer(patient);
        System.out.println(patient.name + " admitted.");
    }

    // Call next patient
    public Patient callNextPatient() {

        if (triageQueue.isEmpty()) {
            throw new RuntimeException("No patients waiting.");
        }

        return triageQueue.poll();
    }

    // Peek next patient
    public Patient peekNextPatient() {

        if (triageQueue.isEmpty()) {
            throw new RuntimeException("No patients waiting.");
        }

        return triageQueue.peek();
    }

    public static void main(String[] args) {

        HospitalER hospital = new HospitalER();

        hospital.admitPatient(new Patient(3, "Rahul"));
        hospital.admitPatient(new Patient(1, "Ankit"));
        hospital.admitPatient(new Patient(5, "Riya"));
        hospital.admitPatient(new Patient(2, "Priya"));

        Patient next = hospital.callNextPatient();

        System.out.println("\nNext Patient:");
        System.out.println(next.name + " (Priority " + next.priority + ")");

        Patient peek = hospital.peekNextPatient();

        System.out.println("\nNext Waiting Patient:");
        System.out.println(peek.name + " (Priority " + peek.priority + ")");
    }
}