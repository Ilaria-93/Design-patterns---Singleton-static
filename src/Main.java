/* Crea una classe User che abbia i parametri privati nome ed età e i getter e setter
All'interno di User ci sarà anche una funzione che stampi a video le informazioni di età e il nome.
Creare 2 oggetti User di cui creerà un'istanza.
Del primo si stamperanno le informazioni di default, del secondo si cambieranno le informazioni e poi si stamperanno a video
 */

public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        user1.printNameAge();

        User user2 = new User();
        user2.setName("Pietro Rossi");
        user2.setAge(30);
        user2.printNameAge();
    }
}