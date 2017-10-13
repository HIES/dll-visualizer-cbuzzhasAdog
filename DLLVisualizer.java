import bridges.connect.Bridges;
import bridges.connect.Bridges;
import bridges.base.DLelement;
/**
 * A class that utilizes the BRIDGES library to visualize a doubly-linked list.
 *
 * @author (your name)
 */
public class DLLVisualizer
{
    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception{

        // TO DO: Define credentials
        final String API_KEY = "57218684868";
        final String USER_ID = "cbuzz_has_a_dog";

        // No need to modify Bridges constructor
        Bridges bridge = new Bridges(1, API_KEY, USER_ID);

        // TO DO: Build the objects to be added to your DLL
        Track[] tracks = { 
                new Track("Black Dog","Led Zepplin"),
                new Track("Drowning","kadak Black"),
                new Track("Hey Yah","Outkast"),
                new Track("Ragu","DJ Glaze"),
                new Track("Baby" , "Justin beiber")

            };

        // TO DO: Build the head 
        DLelement head = null;
        DLelement current = null;
        DLelement previous = null;
        for(Track i: tracks){
            if(head ==null){
                head = new DLelement<Track>(i.getName(), i);
                current = head;
            }
            else
            {
                current.setNext(new DLelement<Track>(i.getName(), i));
                previous = current;
                current = current.getNext();
                current.setPrev(previous);
            }
        }
        //head.setPrev(current);
        //current.setNext(head);
        // TO DO: Create the rest of the Nodes/DLelements and link them to form a DLL

        //Prepare for visualization
        bridge.setDataStructure(head);
        bridge.setTitle("A Doubly-Linked List");
        bridge.visualize();

    }
}
