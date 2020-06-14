/**
 * 
 */
package ki32.Kuzyshyn.lab7;
import java.util.LinkedList;
import java.util.*; import java.io.*;
/**
 * PencilCaseApp class implements main method for PencilCase class possibilities demonstration
 * @author Nazar
 * @version 1.0
 */
public class PencilCaseApp {
    /**
     * @param args mb console args
     */
    public static void main(String[] args) {

        PencilCase<? super Device > testCompartment = new PencilCase<>();

        testCompartment.addDevice(new Pen("Parker", 50));

        LinkedList<Device> devicesL = new LinkedList<>();
        devicesL.add( new Pencil("Cohinor", "Green", 15));
        devicesL.add( new Pen("Bik", 7));

        testCompartment.addDevice(devicesL);
        testCompartment.getMin().print();
        testCompartment.deleteDevice(2);
        testCompartment.getMin().print();

    }
}

