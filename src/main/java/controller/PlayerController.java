package controller;

import model.Player;
import view.PlayerView;

public class PlayerController {
	   
	private Player model;
	private PlayerView view;
	
	
	PlayerController(Player model, PlayerView view){
		this.model = model;
		this.view = view;
	}
	   
	public void setPlayerName(String name){
		model.setName(name);		
	}

	public String getPlayerName(){
		return model.getName();		
	}
	
	public void updateView(){				
		view.printPlayerDetails(model.getName());
	}	
	   
}
