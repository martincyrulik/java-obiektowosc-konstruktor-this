/**
 * Stworzymy klasę o trzech polach :
 * tytuł zadania
 * opis  --||---
 * status --||-- (zadanie zrobione lub niezrobione
 */

public class Task {
    char[] title;
    char[] desc;
    boolean done;

    //stwórzmy konstruktor
    Task(char[] title, char[] desc, boolean done){
        this.title = title;
        this.desc = desc;
        this.done = done;
    }
}
