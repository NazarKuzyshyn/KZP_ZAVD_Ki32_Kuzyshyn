/**
 * 
 */
package ki32.Kuzyshyn.lab7;

import java.util.LinkedList;


/**
 *  Class <code>Pencil case</code> implements Pencil case)
 * @author Nazar
 * @version 1.0
 */
public class PencilCase<T extends Device> {
    private LinkedList<T> myPencil�ase;

    /**
     * Constructor
     */
    public PencilCase(){
        myPencil�ase = new LinkedList<>();
    }

    /**
     * Method saves device in Pencil case
     * @param device for device to save
     */
    public void addDevice(T device){
        myPencil�ase.add(device);
    }

    /**
     * Method saves device in Pencil case
     * @param devices for device to save
     */
    public void addDevice(LinkedList<? extends  T> devices){
        myPencil�ase.addAll(devices);
    }

    /**
     * Method returns device the smallest size
     */
    public T getMin(){
        if (!myPencil�ase.isEmpty())
        {
            T min = myPencil�ase.get(0);
            for (int i = 1; i < myPencil�ase.size(); i++)
            {
                if ( myPencil�ase.get(i).compareTo(min) < 0 )
                    min = myPencil�ase.get(i);
            }
            return min;
        }
        return null;
    }

    /**
     * Method delete device from Pencil case by its position
     * @param i for position of device to delete
     */
    public void deleteDevice(int i){
        myPencil�ase.remove(i);
    }

}

/**
 * Interface
 * Provides general dict object operations: getSize for comparision and print for introducing itself
 */
interface Device extends Comparable<Device>
{
    int getSize();
    void print();
}

/**
 * Class <code></code> implements pen
 * @author Nazar
 * @version 1.0
 */
class Pen implements Device {

    private String penName;
    private int penSize;

    /**
     * Constructor
     */
    public Pen(String name, int size){
        penName = name;
        penSize = size;
    }

    /**
     * Method returns size of pen
     * @return size of pen
     * */
    public int getSize()
    {
        return penSize;
    }

    /**
     * @param p other device to compare
     * Method compare devices by their size
     * @return result of compare, Boolean
     * */
    public int compareTo(Device p)
    {
        Integer s = penSize;
        return s.compareTo(p.getSize());
    }

    /**
     * Method print inf about pen
     * */
    public  void print()
    {
        System.out.println("Pen Name: " + penName + "    Size: " + penSize);
    }
}

/**
 * Class <code>Pencil</code> implements pencil
 * @author Nazar
 * @version 1.0
 */
class Pencil implements Device {

    private String pencilName;
    private String pencilColor;
    private int pencilSize;

    /**
     * Constructor
     */
    public Pencil(String name, String color, int size){
        pencilName = name;
        pencilColor = color;
        pencilSize = size;
    }

    /**
     * Method returns size of pencil
     * @return size of pencil
     * */
    public int getSize()
    {
        return pencilSize;
    }

    /**
     * @param p other device to compare
     * Method compare devices by their size
     * @return result of compare, Boolean
     * */
    public int compareTo(Device p)
    {
        Integer s = pencilSize;
        return s.compareTo(p.getSize());
    }

    /**
     * Method print inf about pencil
     * */
    public  void print()
    {
        System.out.println("Pencil Name: " + pencilName + "    Color: " + pencilColor + "    Size: " + pencilSize);
    }
}
