package objectInOtherObjects;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> persons=new ArrayList<Person>();
		ArrayList<PersonShare> personShares=new ArrayList<PersonShare>();
		ArrayList<PersonLike> personLikes=new ArrayList<PersonLike>();
		persons.add(new Person(newId(persons),"EmirCopyMachine","Emir"
				,"Akbasoglu","ERKEK"));
		persons.add(new Person(newId(persons),"MuratEyken","Murat"
				,"EYKEN","ERKEK"));
		persons.add(new Person(newId(persons),"MusaAcili","Musa"
				,"Açili","ERKEK"));
		personShares.add(new PersonShare(newIdShare(personShares),findPersonByNickName("EmirCopyMachine", persons) , "Java ya Merhaba",
				"dsa dasd asd asd a asdas"));
		personLikes.add(
					new PersonLike(newIdLike(personLikes) 
							, personShares.get(0)
							, findPersonByNickName("MusaAcili", persons))
				);
		System.out.println(personShares.get(0).getPerson().getName());
		System.out.println(personLikes.get(0).getPersonShare().getPerson().getNickName());
		System.out.println(personLikes.get(0).getPerson().getNickName());
	}
	public static int newId(ArrayList<Person> searchList) {
		int maxId=0;
		for(Person person:searchList) {
			if(person.getId()>maxId) maxId=person.getId();
		}
		return maxId+1;
	}
	public static int newIdShare(ArrayList<PersonShare> searchList) {
		int maxId=0;
		for(PersonShare personShare:searchList) {
			if(personShare.getId()>maxId) maxId=personShare.getId();
		}
		return maxId+1;
	}
	public static int newIdLike(ArrayList<PersonLike> searchList) {
		int maxId=0;
		for(PersonLike personLike:searchList) {
			if(personLike.getId()>maxId) maxId=personLike.getId();
		}
		return maxId+1;
	}
	public static Person findPersonByNickName(String nickName
			,ArrayList<Person> searchList) {
		for(Person person:searchList) {
			if(person.getNickName()==nickName) return person;
		}
		return null;
		
	}

}