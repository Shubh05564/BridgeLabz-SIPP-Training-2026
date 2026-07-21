import java.util.PriorityQueue;

class Patient {
    String name;
    int severity;

    Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
}

public class EmergencyRoom {

    PriorityQueue<Patient> triageQueue =
            new PriorityQueue<>((a, b) -> b.severity - a.severity);

    public void addPatient(Patient p) {
        triageQueue.offer(p);   // O(log n)
    }

    public Patient treatNext() {
        return triageQueue.poll();   // O(log n)
    }

    public Patient nextPatient() {
        return triageQueue.peek();   // O(1)
    }

    public static void main(String[] args) {
        EmergencyRoom er = new EmergencyRoom();

        er.addPatient(new Patient("Rahul", 5));
        er.addPatient(new Patient("Amit", 9));
        er.addPatient(new Patient("Neha", 7));

        System.out.println("Next Patient: " + er.nextPatient().name);

        Patient treated = er.treatNext();
        System.out.println("Treating: " + treated.name);

        System.out.println("Next Patient: " + er.nextPatient().name);
    }
}