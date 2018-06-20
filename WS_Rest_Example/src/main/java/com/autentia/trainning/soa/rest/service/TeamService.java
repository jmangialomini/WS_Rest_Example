package com.autentia.trainning.soa.rest.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.springframework.stereotype.Service;
import com.autentia.trainning.soa.rest.bean.Team;

@Service
public class TeamService {
		
	private Collection<Team> teams;
	
	public TeamService() {
		super();
		initDummy();
	}
	
	private void initDummy(){		
			
		teams = new ArrayList<Team>();
		
		Team team1 = new Team(1,"Athletic Club","Bilbao","San Mamés" );
		Team team2 = new Team(2, "Atlético de Madrid","Madrid","Wanda Metropolitano");
		Team team3 = new Team(3,"C.D.Leganés","Leganés","Butarque");
		Team team4 = new Team(4,"Deportivo Alavés","Vitoria","Mendizorroza");
		Team team5 = new Team(5,"Deportivo de La Coruña","La Coruña","Abanca-Riazor");
		Team team6 = new Team(6,"F. C. Barcelona","Barcelona","Camp Nou");
		Team team7 = new Team(7,"Getafe C. F.","Getafe","Alfonso Pérez");
		Team team8 = new Team(8,"Girona F. C.","Gerona","	Montilivi");
		Team team9 = new Team(9,"Levante U.D.","Valencia","Ciudad de Valencia");
		Team team10 = new Team(10,"Málaga C. F.","Málaga","La Rosaleda");
		Team team11 = new Team(11,"R. C. Celta de Vigo","Vigo	","Balaídos");
		Team team12 = new Team(12,"R. C. D. Español","Cornellá de Llobregat","RCDE Stadium");
		Team team13 = new Team(13,"Real Betis Balompié","Sevilla","Benito Villamarín");
		Team team14 = new Team(14,"Real Madrid C. F.","Madrid","Santiago Bernabéu");
		Team team15 = new Team(15,"Real Sociedad","San Sebastián","Anoeta");
		Team team16 = new Team(16,"S. D. Eibar","Éibar","Ipurúa");		
		Team team17 = new Team(17,"Sevilla F. C.","Sevilla","Ramón Sánchez Pizjuán");
		Team team18 = new Team(18,"U. D. Las Palmas","Las Palmas","Gran Canaria");
		Team team19 = new Team(19,"Valencia C. F.","Valencia","Mestalla");
		Team team20 = new Team(20,"Villarreal C. F.","Villarreal","Estadio de la Cerámica");

		teams.add(team1);
		teams.add(team2);
		teams.add(team3);
		teams.add(team4);
		teams.add(team5);
		teams.add(team6);
		teams.add(team7);
		teams.add(team8);
		teams.add(team9);		
		teams.add(team10);
		teams.add(team11);
		teams.add(team12);
		teams.add(team13);
		teams.add(team14);
		teams.add(team15);
		teams.add(team16);
		teams.add(team17);		
		teams.add(team18);
		teams.add(team19);
		teams.add(team20);		
	}
	
	public Collection<Team> getTeams(){		
		return teams;
	}
	
	public Team getTeamById(Integer id){		
		
		Team result = null; 		
		for (Team team : teams) {
			if (team.getId().equals(id))
				result = team;
		}
		return result;		
	}
	
	public Collection<Team> deleteTeam(Integer id){		
		
		Iterator<Team> iterator = null; 
		
		for (iterator=teams.iterator(); iterator.hasNext(); ) {
		    Team user = iterator.next();
		    		if (user.getId().equals(id)) {
		    			iterator.remove();
		    		}
		}
		
		return teams;		
	}
	
	public Collection<Team> updateTeam(Integer id, String name, String stadium, String city){		
 		
		for (Team team : teams) {
			if (team.getId().equals(id))
				team.setName(name);
				team.setStadium(stadium);
				team.setCity(city);
		}
		return teams;		
			
	}
	

}
