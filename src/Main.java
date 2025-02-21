public class Main {
    public static void main(String[] args) {
        Door d1 = new Door(2.5, 0.8);
        Door d2 = new Door(1.8, 0.9);
        Door d3 = new Door(2.0, 0.7);

        //przechowajmy nasze drzwi w tablicy
        Door[] doors = new Door[3];
        doors[0] = d1;
        doors[1] = d2;
        doors[2] = d3;

        //wyświetlmy parametry naszych drzwi przy pomocy pętli foreach
        for (Door door: doors){
            System.out.println("Height: " + door.height);
            System.out.println("Width: " + door.width);
        }
    }
}
