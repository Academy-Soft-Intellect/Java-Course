import java.util.Comparator;

class CustomComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
    	String PersonName1 = o1.getFirstName().toUpperCase() + o1.getLastName().toUpperCase();
		   String PersonName2 = ((Person)o2).getFirstName().toUpperCase() +
				   ((Person)o2).getLastName().toUpperCase();
		   
		   return PersonName1.compareTo(PersonName2);
    }
}
