package lezione10;

import java.util.*;



interface AgendaUser {
	  void update (Appointment a);
}
 

class Appointment {
	  Date date;
	  String info;
	}

class Agenda {
  AgendaUser[] users;
  void addUser(AgendaUser u) {
    //...
  }
  void addAppointment(Appointment a) {
    //...
    for(int i=0; i< users.length; i++) {
      users[i].update(a);
    }
  }
  //...
}


class A implements AgendaUser {
	A(Agenda a) {
		a.addUser((AgendaUser)a);
	}
	 public void update (Appointment a) {
		System.out.println("update");
	}
	//...
}


