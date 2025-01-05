package Watki.MojeZadania.Zadanie13;

public class Producer implements Runnable{
    private final SharedList sharedList;

    public Producer(SharedList sharedList) {
        this.sharedList = sharedList;
    }

    @Override
    public void run() {
        String[] names = {"Jan", "Pawel", "Janina", "Piotr", "Karolina"};
        String[] lastNames = {"Kowalski", "Moniuszko", "Papieska", "Tomakowski", "Nazwiskowa"};
        int[] ages = {18, 15, 17, 22, 55};

        for (int i = 0; i < 10; i++) {
            int index = i  & names.length;
            Person person = new Person(names[index], lastNames[index], ages[index]);
            sharedList.addPerson(person);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
