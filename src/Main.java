public class Main {
    public static void main(String[] args) {

        //zadanie 1 - przechowywanie drzwi
        System.out.println("------------Zadanie 1-------------");
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

        //zadanie 2 - repo zadań
        System.out.println("------------Zadanie 2-------------");
        char[] title1 = {'u','m','y','j'};
        char[] desc1 = {'p','o','d','ł','o','g','ę',' ','w',' ','k','u','c','h','n','i'};
        Task t1 = new Task(title1, desc1,false);

        char[] title2 = {'p','r','z','e','c','z','y','t','a','j'};
        char[] desc2 = {'k','o','m','p','e','n','d','i','u','m',' ','p','r','o','g','a','m','i','s','t','y'};
        Task t2 = new Task(title2, desc2,true);

        //wrzućmy nasze zadania do tablicy
        Task[] tasks = new Task[2];     //mamy tylko dwa zadania
        tasks[0] = t1;
        tasks[1] = t2;

        //wyświetlmy nasze zadania przy użyciu pętli foreach
        for (Task task: tasks){
            System.out.print("Title: ");
            for (char c: task.title){
                System.out.print(c);
            }
            System.out.println();
            System.out.print("Description: ");
            for (char c : task.desc){
                System.out.print(c);
            }
            System.out.println();
            System.out.print("Status: ");
            if (task.done){
                System.out.println("done");
            } else {
                System.out.println("to do");
            }
            System.out.println();
        }

        /**zadanie 3 - Serwis samochodowy
         * Napisz program dla serwisu samochodowego. Samochód ma markę oraz cenę.
         * Dodaj kilka samochodów oraz wyświetl.
         */
        System.out.println("------------Zadanie 3-------------");
        //dodajmy pierwszy samochód
        char[] brand1 = {'M','e','r','c','e','d','e','s',' ','C','o','u','p','e'};
        double price1 = 9500.5;
        boolean newCar01 = false;
        Car car1 = new Car(brand1, price1, newCar01);

        //dodajemy drugi samochód
        char[] brand02 = {'S','k','o','d','a',' ','O','c','t','a','v','i','a'};
        double price2 = 129500;
        Car car2 = new Car(brand02, price2, true);

        //dodajemy trzeci samochód
        char[] brand3 = {'V','o','l','k','v','a','g','e','n',' ','P','o','l','o'};
        double price3 = 12300.5;
        Car car3 = new Car(brand3, price3, false);

        //dodajemy czwarty samochód
        char[] brand4 = {'O','p','e','l',' ','A','s','t','r','a'};
        double price4 = 42500;
        Car car4 = new Car(brand4, price4, false);

        //tworzymy flotę samochodów - tablicę naszych samochodów
        Car[] cars = new Car[4];
        cars[0] = car1;
        cars[1] = car2;
        cars[2] = car3;
        cars[3] = car4;

        //wyświetlimy naszą tablicę samochdów z użyciem pętli foreach
        for (Car car: cars){
            System.out.print("Brand: ");
            for (char c : car.brand){
                System.out.print(c);
            }
            System.out.println();
            System.out.print("Price: " + car.price);
            System.out.println();
            if (car.newCar == true){
                System.out.println("The car is new");
            } else {
                System.out.println("The car is used");
            }
            System.out.println();
        }
    }
}
