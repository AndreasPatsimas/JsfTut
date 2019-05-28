package org.patsimas.jsf.hello;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class ProfessorDataUtil {

	private List<Professor> professors;

	public ProfessorDataUtil() {
		loadData();
	}
	
	public void loadData() {
		
		professors = new ArrayList();
		
		professors.add(new Professor("Andreas", "Patsimas", "andreas-patsim@hotmail.com"));
		professors.add(new Professor("Sotiris", "Patsimas", "sotirinio@hotmail.com"));
		professors.add(new Professor("Chris", "Bolosis", "bolosis@hotmail.com"));
	}

	public List<Professor> getProfessors() {
		return professors;
	}

	public void setProfessors(List<Professor> professors) {
		this.professors = professors;
	}
	
}
