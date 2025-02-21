public class Door {
    double height;
    double width;
    // Door(){}; konstruktor niejawny - zdefiniowany defaultowo bez udziału usera.
    //let's create our own constructor under the fields of our class
    Door(double heightInit, double widthInit){  //tworzymy własnego konstruktora
        height = heightInit;    //do poszczególnych pól przypisujemy wartości przekazane
        width = widthInit;      //w linii wywołana naszego własnego konstruktora
    }
}
