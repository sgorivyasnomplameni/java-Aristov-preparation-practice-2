public class Structures {

    public static void main(String[] args) {
        Structure element=new Structure();
        element.content="Content 1";

        Structure element2 = new Structure();
        element2.content="Content 2";
        element.neighbours=element2;

        Structure element3 = new Structure();
        element3.content="Content 3";
        element2.neighbours=element3;

        Structure current = element;

        while(current!=null)
        {
            System.err.println(current.content);
            current=current.neighbours;
        }

    }
}
