public class PersonDriver {
    public static void main(String [] args) {
        Person Andres = new Person();
        System.out.println(Andres.toString());

        Person Dean = new Person("Dean",25);

        if(Andres.getName().equals(Dean.getName())&& Andres.getAge()==Dean.getAge()){
            System.out.println("The two persons name and age are equal");
        }
        else {
            System.out.println("The two persons name and age are not equal");
        }

        if(Andres.getName().equals(Dean.getName())){
            System.out.println("The two persons names are the same!");
        }
        else {
            System.out.println("The two persons names are not the same");
        }

        if(Andres.getAge()<=Dean.getAge()){
            System.out.println("Dean is older");
        }
        else {
            System.out.println("Andres is older");
        }
        if(Andres.getAge()>=Dean.getAge()){
            System.out.println("Dean is younger");
        }
        else {
            System.out.println("Andres is younger");
        }
    }
}
