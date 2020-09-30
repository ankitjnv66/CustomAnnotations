package interview;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employes implements Serializable {
	private String fName;
	private String lName;
	private transient double contact; // transient variables will not be serialized, serialised object holds null
	private static String checkValue; // static variables will not be serialized, serialised object holds null

	public Employes(String fName, String lName, double contact, String checkValue) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.contact = contact;
		Employes.checkValue = checkValue;
	}

	@Override
	public String toString() {
		return "Employee [fName=" + fName + ", lName=" + lName + ", contact=" + contact + ", checkValue=" + checkValue
				+ "]";
	}

}

public class SerializationDeserializationUnderstanding {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employes emp = new Employes("Ankit", "Singh", 7705093111D, "checkValue");
		System.out.println("Emp object before serialization : " + emp);
		serialzeEmpObject(emp);
		Employes deEmp = deSerialzeEmpObject();
		System.out.println("Emp object before serialization : " + deEmp);

	}

	public static void serialzeEmpObject(Employes emp) throws IOException {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Emp.obj"))) {
			oos.writeObject(emp);
		}
	}

	public static Employes deSerialzeEmpObject() throws IOException, ClassNotFoundException {
		Employes emp;
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Emp.obj"))) {
			emp = (Employes) ois.readObject();
		}
		return emp;
	}

}

//Serialiaztion  and deserialization understanding 


